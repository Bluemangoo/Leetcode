//Problem 0735
import java.util.Arrays;
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[] asteroidsIn = new int[]{5, 10, -5};
                System.out.println(Arrays.toString(new Solution().asteroidCollision(asteroidsIn)));
                System.out.println("Should be: [5, 10]\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[] asteroidsIn = new int[]{8, -8};
                System.out.println(Arrays.toString(new Solution().asteroidCollision(asteroidsIn)));
                System.out.println("Should be: []\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int[] asteroidsIn = new int[]{10, 2, -5};
                System.out.println(Arrays.toString(new Solution().asteroidCollision(asteroidsIn)));
                System.out.println("Should be: [10]\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                int[] asteroidsIn = new int[]{10, -5, 5};
                System.out.println(Arrays.toString(new Solution().asteroidCollision(asteroidsIn)));
                System.out.println("Should be: [10, 5]\n");
                break;
            }
            case 5: {
                System.out.println("test 5 start:");
                int[] asteroidsIn = new int[]{-2, -1, 1, 2};
                System.out.println(Arrays.toString(new Solution().asteroidCollision(asteroidsIn)));
                System.out.println("Should be: [-2, -1 ,1 ,2]\n");
                break;
            }
            case 6: {
                System.out.println("test 6 start:");
                int[] asteroidsIn = new int[]{-2, 2, -1, -2};
                System.out.println(Arrays.toString(new Solution().asteroidCollision(asteroidsIn)));
                System.out.println("Should be: [-2]\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 6;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
