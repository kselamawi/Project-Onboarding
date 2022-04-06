package CircularArray;

public class Driver {
    public static void main(String[] args) {
        CircularArray circularArray =new CircularArray();
        circularArray.enQueue(1);
        circularArray.enQueue(2);
        circularArray.enQueue(3);
        circularArray.enQueue(4);
        circularArray.enQueue(5);
        circularArray.enQueue(6);
        circularArray.deQueue();
        circularArray.deQueue();
        circularArray.enQueue(11);
        circularArray.enQueue(12);
        System.out.println(circularArray.getSize());
        circularArray.show();
    }
}
