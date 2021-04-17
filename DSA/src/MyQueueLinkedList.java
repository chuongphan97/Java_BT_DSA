import java.util.LinkedList;

public class MyQueueLinkedList<E> {
    private int size = 0;
    LinkedList<E> elements;

    public MyQueueLinkedList(){
        elements = new LinkedList<>();
    }

    public int getSize() {
        return size;
    }

    public void enqueue(E e){
        elements.add(e);
        size++;
    }

    public E dequeue(){
      if (size == 0) return null;
      else {
          size--;
          return elements.removeFirst();
      }
    }

    public E peek(){
        return elements.get(size-1);
    }

    public E get(int index){
        return elements.get(index);
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(get(i)+"\t");
        }
        System.out.println();
    }
}
