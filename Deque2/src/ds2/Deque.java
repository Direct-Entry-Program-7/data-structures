package ds2;

import ds.Queue;

public class Deque extends Queue {

    public void enqueueRear(int number){
        if (empty()){
            numbers = new int[1];
            numbers[0] = number;
        }else{
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i+1] = numbers[i];
            }
            temp[0]= number;
            numbers = temp;
        }
    }

    public void dequeueFront(){
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

}
