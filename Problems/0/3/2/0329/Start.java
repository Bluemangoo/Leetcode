//Problem 0329
public class Start {
    private static void test(int count){
        switch (count) {
            case 1:{
                System.out.println("test 1 start:");
                int[][] matrixIn={{9,9,4},{6,6,8},{2,1,1}};
                System.out.println(new Solution().longestIncreasingPath(matrixIn));
                System.out.println("Should be: 4\n");
                break;
            }
            case 2:{
                System.out.println("test 2 start:");
                int[][] matrixIn={{3,4,5},{3,2,6},{2,2,1}};
                System.out.println(new Solution().longestIncreasingPath(matrixIn));
                System.out.println("Should be: 4\n");
                break;
            }
            case 3:{
                System.out.println("test 3 start:");
                int[][] matrixIn={{1}};
                System.out.println(new Solution().longestIncreasingPath(matrixIn));
                System.out.println("Should be: 1\n");
                break;
            }
            case 4:{
                System.out.println("test 4 start:");
                int[][] matrixIn={{0},{1},{5},{5}};
                System.out.println(new Solution().longestIncreasingPath(matrixIn));
                System.out.println("Should be: 3\n");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int testTime = 4;
        for (int i=1;i<=testTime;i++){
            test(i);
        }
    }
}
