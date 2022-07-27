//Problem 0592
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test "+count+" start:");
                String expressionIn="-1/2+1/2";
                System.out.println(new Solution().fractionAddition(expressionIn));
                System.out.println("0/1  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test "+count+" start:");
                String expressionIn="-1/2+1/2+1/3";
                System.out.println(new Solution().fractionAddition(expressionIn));
                System.out.println("1/3  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test "+count+" start:");
                String expressionIn="1/3-1/2";
                System.out.println(new Solution().fractionAddition(expressionIn));
                System.out.println("-1/6  <-  Should be\n");
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
