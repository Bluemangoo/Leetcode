//Problem 0013
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                System.out.println(new Solution().romanToInt("III"));
                System.out.println("Should be: 3\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                System.out.println(new Solution().romanToInt("IV"));
                System.out.println("Should be: 4\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                System.out.println(new Solution().romanToInt("IX"));
                System.out.println("Should be: 9\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                System.out.println(new Solution().romanToInt("LVIII"));
                System.out.println("Should be: 58\n");
                break;
            }
            case 5: {
                System.out.println("test 5 start:");
                System.out.println(new Solution().romanToInt("MCMXCIV"));
                System.out.println("Should be: 1994\n");
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
