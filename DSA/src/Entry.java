public class Entry {
    public static void main(String[] args) {
        //--TEST MY STACK--
        System.out.println("Test My Stack--------------");

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(45);
        myStack.push(14);
        myStack.push(11);
        myStack.display();
        System.out.println(myStack.pop());
        myStack.display();


        //--TEST MY STACK BY LINKED LIST--
//        System.out.println("Test My Stack Linked List--------------");
//        MyStackLinkedList<Integer> integerMyStackLinkedList = new MyStackLinkedList<>();
//        integerMyStackLinkedList.push(1);
//        integerMyStackLinkedList.push(2);
//        integerMyStackLinkedList.push(4);
//        integerMyStackLinkedList.push(7);
//        integerMyStackLinkedList.display();
//        System.out.println(integerMyStackLinkedList.pop());
//        integerMyStackLinkedList.display();


        //--TEST MY STACK BY MY LINKED LIST--
//        System.out.println("Test My Stack By My Linked List--------------");
//        MyStackByMyLinkedList<Integer> myStack = new MyStackByMyLinkedList<>();
//        myStack.push(2);
//        myStack.push(5);
//        myStack.push(7);
//        myStack.push(3);
//        myStack.display();
//        System.out.println(myStack.pop());
//        myStack.display();


        //--TEST MY QUEUE--
//        System.out.println("Test My Queue--------------");
//        MyQueue<Integer> myQueue = new MyQueue<>();
//        myQueue.enqueue(19);
//        myQueue.enqueue(15);
//        myQueue.enqueue(12);
//        myQueue.enqueue(11);
//        myQueue.display();
//        System.out.println(myQueue.dequeue());
//        myQueue.display();


        //--TEST MY QUEUE LINKED LIST--
//        System.out.println("Test My Queue Linked List--------------");
//        MyQueueLinkedList<Integer> myQueue = new MyQueueLinkedList<>();
//        myQueue.enqueue(21);
//        myQueue.enqueue(25);
//        myQueue.enqueue(7);
//        myQueue.enqueue(3);
//        myQueue.display();
//        System.out.println(myQueue.dequeue());
//        myQueue.display();


        //--TEST MY QUEUE BY MY LINKED LIST--
//        System.out.println("Test My Queue By My Linked List--------------");
//        MyQueueByMyLinkedList<Integer> myQueue = new MyQueueByMyLinkedList<>();
//        myQueue.enqueue(21);
//        myQueue.enqueue(22);
//        myQueue.enqueue(26);
//        myQueue.enqueue(6);
//        myQueue.display();
//        System.out.println(myQueue.dequeue());
//        myQueue.display();
    }
}
