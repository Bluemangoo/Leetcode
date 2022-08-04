//Problem 2358
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] gradesIn = new int[]{10, 6, 12, 7, 3, 5};
                System.out.println(new Solution().maximumGroups(gradesIn));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] gradesIn = new int[]{8, 8};
                System.out.println(new Solution().maximumGroups(gradesIn));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] gradesIn = new int[]{2, 3, 3, 3, 3};
                System.out.println(new Solution().maximumGroups(gradesIn));
                System.out.println("2  <-  Should be\n");
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
