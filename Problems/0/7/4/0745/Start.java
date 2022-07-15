//Problem 0745

public class Start {
    static WordFilter wordFilter;

    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                System.out.println(wordFilter.f("a", "e"));
                System.out.println("Should be: 0\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                System.out.println(wordFilter.f("a", "cd"));
                System.out.println("Should be: 2\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                System.out.println(wordFilter.f("a", "c"));
                System.out.println("Should be: -1\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        wordFilter = new WordFilter(new String[]{"apple", "abccd", "abcfcd"});
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
