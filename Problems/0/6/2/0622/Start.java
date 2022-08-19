//Problem 0622
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                MyCircularQueue circularQueue = new MyCircularQueue(3);
                System.out.println("test " + count + " start:");
                System.out.print("[" + circularQueue.enQueue(1) + ", ");
                System.out.print(circularQueue.enQueue(2) + ", ");
                System.out.print(circularQueue.enQueue(3) + ", ");
                System.out.print(circularQueue.enQueue(4) + ", ");
                System.out.print(circularQueue.Rear() + ", ");
                System.out.print(circularQueue.isFull() + ", ");
                System.out.print(circularQueue.deQueue() + ", ");
                System.out.print(circularQueue.enQueue(4) + ", ");
                System.out.print(circularQueue.Rear() + ", ");
                System.out.print(circularQueue.isEmpty() + ", ");
                System.out.println(circularQueue.Front() + "]");
                System.out.println("[true, true, true, false, 3, true, true, true, 4, false, 2]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                MyCircularQueue circularQueue = new MyCircularQueue(8);
                System.out.print("[" + circularQueue.enQueue(3) + ", ");
                System.out.print(circularQueue.enQueue(9) + ", ");
                System.out.print(circularQueue.enQueue(5) + ", ");
                System.out.print(circularQueue.enQueue(0) + ", ");
                System.out.print(circularQueue.deQueue() + ", ");
                System.out.print(circularQueue.deQueue() + ", ");
                System.out.print(circularQueue.isEmpty() + ", ");
                System.out.print(circularQueue.isEmpty() + ", ");
                System.out.print(circularQueue.Rear() + ", ");
                System.out.print(circularQueue.Rear() + ", ");
                System.out.println(circularQueue.deQueue() + "]");
                System.out.println("[true, true, true, true, true, true, false, false, 0, 0, true]  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 2;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
