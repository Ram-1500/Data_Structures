package queue;

public class Queue {	

    private static final int DEFAULT_CAPACITY = 10;

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;
    public Queue() {
        this(DEFAULT_CAPACITY);
    }
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public boolean insert(int x) {
        if (isFull()) {
            return false;
        }
        // If the back of the queue is the end of the array wrap around to the front
        rear = (rear + 1) % maxSize;
        queueArray[rear] = x;
        nItems++;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int temp = queueArray[front];
        front = (front + 1) % maxSize;
        nItems--;
        return temp;
    }

    public int peekFront() {
        return queueArray[front];
    }

    public int peekRear() {
        return queueArray[rear];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int getSize() {
        return nItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = front;; i = ++i % maxSize) {
            sb.append(queueArray[i]).append(", ");
            if (i == rear) {
                break;
            }
        }
        sb.replace(sb.length() - 2, sb.length(), "]");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Queue myQueue = new Queue(4);
        myQueue.insert(10);
        myQueue.insert(2);
        myQueue.insert(5);
        myQueue.insert(3);
        // [10(front), 2, 5, 3(rear)]

        System.out.println(myQueue.isFull()); // Will print true

        myQueue.remove(); // Will make 2 the new front, making 10 no longer part of the queue
        // [10, 2(front), 5, 3(rear)]

        myQueue.insert(7); // Insert 7 at the rear which will get 0 index because of wrap around
        // [7(rear), 2(front), 5, 3]

        System.out.println(myQueue.peekFront()); // Will print 2
        System.out.println(myQueue.peekRear()); // Will print 7
        System.out.println(myQueue.toString()); // Will print [2, 5, 3, 7]
    }
}
