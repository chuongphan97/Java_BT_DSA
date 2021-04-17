public class MyStackByMyLinkedList<E> {
    private int size = 0;
    MyLinkedList<E> elements;

    public MyStackByMyLinkedList(){
        elements = new MyLinkedList<>();
    }

    public int getSize(){
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
            return (E) elements.removeLast();
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
