//Problem 0641
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                MyCircularDeque circularDeque = new MyCircularDeque(3);
                Print.print(circularDeque.insertLast(1));
                Print.print(circularDeque.insertLast(2));
                Print.print(circularDeque.insertFront(3));
                Print.print(circularDeque.insertFront(4));
                Print.print(circularDeque.getRear());
                Print.print(circularDeque.isFull());
                Print.print(circularDeque.deleteLast());
                Print.print(circularDeque.insertFront(4));
                Print.println(circularDeque.getFront());
                System.out.println("true, true, true, false, 2, true, true, true, 4  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                MyCircularDeque circularDeque = new MyCircularDeque(3);
                Print.print(circularDeque.insertLast(1));
                Print.print(circularDeque.insertLast(2));
                Print.print(circularDeque.deleteFront());
                Print.println(circularDeque.getFront());
                System.out.println("true, true, true, 2  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                MyCircularDeque circularDeque = new MyCircularDeque(3);
                Print.print(circularDeque.insertFront(3));
                Print.print(circularDeque.deleteLast());
                Print.print(circularDeque.getRear());
                Print.print(circularDeque.getFront());
                Print.print(circularDeque.getFront());
                Print.print(circularDeque.deleteFront());
                Print.print(circularDeque.insertFront(6));
                Print.print(circularDeque.insertLast(5));
                Print.print(circularDeque.insertFront(9));
                Print.print(circularDeque.getFront());
                Print.println(circularDeque.insertFront(6));
                System.out.println("true, true, -1, -1, -1, false, true, true, true, 9, false  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
