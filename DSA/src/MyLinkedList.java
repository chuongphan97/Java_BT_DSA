public class MyLinkedList<E>{
    private Node head;
    private int numNodes = 0;

    class Node{
        Object data;
        Node next;
        public Node(){

        }
        public Node(Object data){
            this.data = data;
        }
        public E getData(){
            return (E) this.data;
        }
    }

    public MyLinkedList(){
        head = new Node();
        head.next = null;
        numNodes++;
    }

    public void add(E e){
        Node temp = head;
        Node addNode = new Node(e);
        if (head.data == null){
            head = new Node(e);
        } else {
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = addNode;
            addNode.next = null;
            numNodes++;
        }
    }

    public E removeFirst(){
        Node temp = head;
        Node holder;
        if (head == null) {
            numNodes--;
            return null;
        } else {
            head = temp.next;
            holder = temp;
            temp = null;
            numNodes--;
            return (E) holder.data;
        }
    }

    public E removeLast(){
        Node temp = head;
        Node holder;
        Node delNode;
        if (head == null){
            numNodes--;
            return null;
        } else {
            while (temp.next.next != null){
                temp = temp.next;
            }
            delNode = temp.next;
            holder = delNode;
            temp.next = null;
            delNode = null;
            numNodes--;
            return (E) holder.data;
        }
    }
    public E get(int index){
        Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void display(){
        for (int i = 0; i < numNodes; i++) {
            System.out.print(get(i)+"\t");
        }
        System.out.println();
    }

}
