package ds;

import java.util.Arrays;

public class Stack {

    private int[] numbers;

    public void push(int number){
        if (numbers == null){
            numbers = new int[1];
            numbers[0] = number;
        }else{
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1] = number;
            numbers = temp;
        }
    }

    public void pop(){
        if (numbers == null){
            System.err.println("Can't pop from empty array");
            return;
        }else if (numbers.length == 1){
            numbers = null;
            return;
        }
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
    }

    public boolean empty(){
        return numbers == null;
    }

    public int size(){
        return 0;
    }

    public int peek(){
        return 0;
    }

    public void clear(){

    }

    public void print(){
        if (empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = numbers.length - 1; i >=0 ; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public boolean contains(int number){
        return false;
    }

}
