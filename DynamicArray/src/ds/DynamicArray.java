package ds;

import java.util.Arrays;

public class DynamicArray {

    private int[] numbers;

    public void add(int number) {
        add(size(), number);
    }

    public void add(int index, int number) {

        if (index > size() || index < 0){
            throw new RuntimeException("Invalid array index");
        }

        int[] temp = new int[size() + 1];
//        for (int i = 0; i < index; i++) {
//            temp[i] = numbers[i];
//        }
//        temp[index] = number;
//        for (int i = (index+1); i < temp.length; i++) {
//            temp[i] = numbers[i-1];
//        }
        for (int i = 0; i < temp.length; i++) {
            if (i < index){
                temp[i] = numbers[i];
            }else if (i == index){
                temp[i] = number;
                continue;
            }else{
                temp[i] = numbers[i-1];
            }
        }
        numbers = temp;
    }

    public int get(int index) {
        if (index >= size() || index < 0){
            throw new RuntimeException("Invalid array index");
        }
        return numbers[index];
    }

    public void remove(int index) {
        if (index >= size() || index < 0){
            throw new RuntimeException("Invalid array index");
        }
        if (size() -1 == 0){
            clear();
            return;
        }
        int[] temp = new int[size() - 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < index){
                temp[i] = numbers[i];
            }else if (i >= index) {
                temp[i] = numbers[i+1];
            }
        }
        numbers = temp;
    }

    public void clear() {
        numbers = null;
    }

    public boolean empty() {
        return (numbers == null);
    }

    public int size() {
        return (numbers == null) ? 0 : numbers.length;
    }

    public boolean contains(int number) {
        if (empty()){
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println(empty() ? "[]" : Arrays.toString(numbers));
    }
}
