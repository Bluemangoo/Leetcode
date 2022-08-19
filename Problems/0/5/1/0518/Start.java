//Problem 0518
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int amountIn = 5;
                int[] coinsIn = {1, 2, 5};
                System.out.println(new Solution().change(amountIn, coinsIn));
                System.out.println("Should be: 4\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int amountIn = 3;
                int[] coinsIn = {2};
                System.out.println(new Solution().change(amountIn, coinsIn));
                System.out.println("Should be: 0\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int amountIn = 10;
                int[] coinsIn = {10};
                System.out.println(new Solution().change(amountIn, coinsIn));
                System.out.println("Should be: 1\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                int amountIn = 100;
                int[] coinsIn = {99, 1};
                System.out.println(new Solution().change(amountIn, coinsIn));
                System.out.println("Should be: 2\n");
                break;
            }
            case 5: {
                System.out.println("test 5 start:");
                int amountIn = 500;
                int[] coinsIn = {3, 5, 7, 8, 9, 10, 11};
                System.out.println(new Solution().change(amountIn, coinsIn));
                System.out.println("Should be: 35502874\n");
                break;
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
