//Problem 0761
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().makeLargestSpecial("11011000"));
                System.out.println("11100100  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().makeLargestSpecial("1110011000"));
                System.out.println("1110011000  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().makeLargestSpecial("101010"));
                System.out.println("101010  <-  Should be\n");
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
