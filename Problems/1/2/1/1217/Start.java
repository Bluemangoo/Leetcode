//Problem 1217
public class Start {
    private static void test(int count){
        switch (count) {
            case 1:{
                System.out.println("test 1 start:");
                int[] position = {1, 2, 3};
                System.out.println(new Solution().minCostToMoveChips(position));
                System.out.println("Should be: 1\n");
                break;
            }
            case 2:{
                System.out.println("test 2 start:");
                int[] position = {2, 2, 2, 3, 3};
                System.out.println(new Solution().minCostToMoveChips(position));
                System.out.println("Should be: 2\n");
                break;
            }
            case 3:{
                System.out.println("test 3 start:");
                int[] position = {1, 1000000000};
                System.out.println(new Solution().minCostToMoveChips(position));
                System.out.println("Should be: 1\n");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int testTime = 3;
        for (int i=1;i<=testTime;i++){
            test(i);
        }
    }
}
