//Problem 剑指 Offer II 041 || 0346 (*Plus)
import java.util.Arrays;
public class Start {
    private static MovingAverage movingAverage;
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                System.out.println(movingAverage.next(1));
                System.out.println("Should be: 1.0\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                System.out.println(movingAverage.next(10));
                System.out.println("Should be: 5.5\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                System.out.printf("%.5f%n",movingAverage.next(3));
                System.out.println("Should be: 4.66667\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                System.out.println(movingAverage.next(5));
                System.out.println("Should be: 6.0\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        movingAverage =new MovingAverage(3);
        int testTime = 4;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
