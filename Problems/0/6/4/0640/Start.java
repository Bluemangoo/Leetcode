//Problem 0640
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().solveEquation("x+5-3+x=6+x-2"));
                System.out.println("x=2  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().solveEquation("x=x"));
                System.out.println("Infinite solutions  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().solveEquation("2x=x"));
                System.out.println("x=0  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().solveEquation("x+1=x"));
                System.out.println("No solution  <-  Should be\n");
                break;
            }
            case 5: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().solveEquation("-x=-1"));
                System.out.println("x=1  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 5;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
