package CircularArray;
public class CircularArray {
    int queue[] = new int[6];
    int size = 0;
    int front = 0;
    int rear = 0;
    public int getSize() {
        return size;
    }
    public boolean isFull() {
        return getSize() == 6;
    }
    public boolean isEmpty() {
        return getSize() == 0;
    }
    // Here,we have a method that can add elements to the array
    public void enQueue(int data) {
        /*here we adding elements.*/
        if (!isFull()) {
            queue[rear] = data;
        /*after we add elements then the rear has to be shifted to the next location.so to make it a circular array then
        we have mode it by the size of array. which is  rear =(rear +1)% ArraySize*/
            rear = (rear + 1) % 6;
            // since we have added element then  the size also increases.
            size = size + 1;
        } else
            System.out.println("the Queue is full");
    }

    // to delete an element from Queue data structure we need to implement a method called deQueue
    public int deQueue() {
        // The Queue is first in first out data structure(FIFO).
        // so here we're asking what the front value is.

        int data = queue[front];
        if (!isEmpty()) {
            // we have to move the front to the next value.same thing here we have to mode it by Arraysize
            front = (front + 1) % 6;
            // after that we need to reduce the size also
            size = size - 1;

        } else {
            System.out.println("the Queue is empty");
        }
        return size;
    }

    public void show() {
        System.out.println("Queue Elements :");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 6] + " ");
        }
        System.out.println();
        // when we apply the  deQueue() method ,we not removing the elements ,we're just shifting them. As a result
        // we can't add new elements after performing the deQueue () method. if we try to do that then we will get
        //  exception error.The foreach loop we have below basically proof that and if we try
        // print out the array then we will get all the elements including those we deQueue them
        System.out.println("ELements of the Array queue:");
        for (int fr : queue) {
            System.out.print(fr + " ");
        }
    }
}
