package ds;

public class Queue {

    protected int[] numbers;

    public void enqueue(int number){
        if (this.empty()){
            this.numbers = new int[1];
            this.numbers[0] = number;
        }else{
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1]= number;
            numbers = temp;
        }
    }

    public void dequeue(){
        if (empty()){
            System.err.println("Can't dequeue from empty queue");
            return;
        }else if (numbers.length == 1){
            numbers = null;
            return;
        }
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i+1];
        }
        numbers = temp;
    }

    public void clear(){
        numbers = null;
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

    public int peek(){
        if (empty()){
            throw new RuntimeException("Queue is empty");
        }
        return numbers[numbers.length -1];
    }

    public int size(){
        return empty()? 0: numbers.length;
    }

    public boolean empty(){
        return this.numbers == null;
    }

    public boolean contains(int number){
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

}
