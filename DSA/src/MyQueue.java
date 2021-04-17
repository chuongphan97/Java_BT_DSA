import java.util.Arrays;

public class MyQueue<E>{
    public static final int DEFAULT_CAPACITY = 10;
    private int size=0;
    Object[] elements;

    public MyQueue(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa(){
        if (size == elements.length){
            int newSize = elements.length*2;
            elements = Arrays.copyOf(elements,newSize);
        }
    }

    public void enqueue(E e){
        elements[size++] = e;
    }

    public E dequeue(){
        Object result = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return (E) result;
    }

    public E get(int index){
        return (E) elements[index];
    }

    public E peek(){
        return (E) elements[size-1];
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(get(i) +"\t" );
        }
        System.out.println();
    }
}
