//Problem 2375
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().smallestNumber("IIIDIDDD"));
                System.out.println("123549876  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().smallestNumber("DDD"));
                System.out.println("4321  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 2;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
