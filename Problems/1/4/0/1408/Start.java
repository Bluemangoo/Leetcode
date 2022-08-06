//Problem 1408
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                String[] wordsIn = new String[]{"mass", "as", "hero", "superhero"};
                System.out.println(new Solution().stringMatching(wordsIn));
                System.out.println("[as, hero]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                String[] wordsIn = new String[]{"leetcode", "et", "code"};
                System.out.println(new Solution().stringMatching(wordsIn));
                System.out.println("[et, code]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                String[] wordsIn = new String[]{"blue", "green", "bu"};
                System.out.println(new Solution().stringMatching(wordsIn));
                System.out.println("[]  <-  Should be\n");
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
