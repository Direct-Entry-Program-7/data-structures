package ds;

public class SinglyLinkedList {

    private Node head;
    private int size;

    public void add(int number){
        if (empty()){
            head = new Node(number, null);
        }else{
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(number, null));
        }
        size++;
    }

    public void add(int index, int number){

    }

    public void remove(int index){

    }

    public void clear(){
        head = null;
        size = 0;
    }

    public int get(int index){
        return 0;
    }

    public boolean empty(){
        return (head == null);
    }

    public boolean contains(int number){
        return false;
    }

    public int size(){
        return size;
    }

    public void print(){
        if (empty()){
            System.out.println("[]");
        }else{
            Node temp = head;
            System.out.print("[");

            /* Method 1 */

//            while (temp != null){
//                System.out.print(temp.getData() + ", ");
//                temp = temp.getNext();
//            }

            /* Method 2 (If you prefer this way) */

            while (temp.getNext() != null){
                System.out.print(temp.getData() + ", ");
                temp = temp.getNext();
            }
            System.out.print(temp.getData());
            System.out.print("]");
        }
    }

}
