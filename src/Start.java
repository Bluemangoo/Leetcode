//Problem 6010
//minimum-time-to-complete-trips
public class Start {
    private static void test1(){
        System.out.println("test 1 start:");
        int[] timeIn=new int[]{1,2,3};
        int totalTripsIn=5;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 3\n");
    }
    private static void test2(){
        System.out.println("test 2 start:");
        int[] timeIn=new int[]{2};
        int totalTripsIn=1;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 2\n");
    }
    private static void test3(){
        System.out.println("test 3 start:");
        int[] timeIn=new int[]{10};
        int totalTripsIn=1;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 10\n");
    }
    private static void test4(){
        System.out.println("test 4 start:");
        int[] timeIn=new int[]{1};
        int totalTripsIn=3;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 3\n");
    }
    private static void test5(){
        System.out.println("test 5 start:");
        int[] timeIn=new int[]{1};
        int totalTripsIn=0;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 0\n");
    }
    private static void test6(){
        System.out.println("test 6 start:");
        int[] timeIn=new int[]{5,10,10};
        int totalTripsIn=9;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 25\n");
    }
    private static void test7(){
        System.out.println("test 7 start:");
        int[] timeIn=new int[]{1};
        int totalTripsIn=1;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 1\n");
    }
    private static void test8(){
        System.out.println("test 8 start:");
        int[] timeIn=new int[]{9,3,10,5};
        int totalTripsIn=2;
        System.out.println(new Solution().minimumTime(timeIn,totalTripsIn));
        System.out.println("Should be: 5\n");
    }
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
    }
}
