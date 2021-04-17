import java.util.LinkedList;

public class MyStackLinkedList<E> {
    private int size=0;
    LinkedList<E> elements;

    public MyStackLinkedList(){
        elements = new LinkedList<>();
    }

    public int getSize() {
        return size;
    }

    public void push(E e){
        elements.add(e);
        size++;
    }

    public E pop(){
        if (size == 0) return null;
        else {
            size--;
            return elements.removeLast();
        }
    }

    public E get(int index){
        return elements.get(index);
    }

    public E peek(){
        return elements.get(size-1);
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(get(i)+"\t");
        }
        System.out.println();
    }


}
