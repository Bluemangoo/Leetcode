//Problem 0014
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                String[] strsIn = {"flower", "flow", "flight"};
                System.out.println(new Solution().longestCommonPrefix(strsIn));
                System.out.println("Should be: fl\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                String[] strsIn = {"dog", "racecar", "car"};
                System.out.println(new Solution().longestCommonPrefix(strsIn));
                System.out.println("Should be: \n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                String[] strsIn = {"ab", "a"};
                System.out.println(new Solution().longestCommonPrefix(strsIn));
                System.out.println("Should be: a\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                String[] strsIn = {"", "a"};
                System.out.println(new Solution().longestCommonPrefix(strsIn));
                System.out.println("Should be: \n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 4;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
