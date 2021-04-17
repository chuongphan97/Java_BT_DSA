import java.util.Arrays;

public class MyStack<E> {
    public static final int DEFAULT_CAPACITY = 10;
    Object[] elements;
    int size =0;
    public MyStack(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa(){
        if (size == elements.length) {
            int newSize = elements.length*2;
            elements = Arrays.copyOf(elements,newSize);
        }
    }

    public void push(E e){
        ensureCapa();
        elements[size++] = e;
    }

    public E pop(){
        if (size==0) return null;
        else {
            return (E) elements[--size];
        }
    }

    public E get(int index){
        return (E) elements[index];
    }

    public E peek(){
        return (E) elements[size-1];
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(get(i) + "\t");
        }
        System.out.println();
    }

}
