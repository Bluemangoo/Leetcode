//Problem 0731
public class Start {
    private static MyCalendarTwo myCalendar;

    private static void test(int count) {
        switch (count) {
            case 11: {
                System.out.println("test 1.1 start:");
                System.out.println(myCalendar.book(10, 20));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 12: {
                System.out.println("test 1.2 start:");
                System.out.println(myCalendar.book(50, 60));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 13: {
                System.out.println("test 1.3 start:");
                System.out.println(myCalendar.book(10, 40));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 14: {
                System.out.println("test 1.4 start:");
                System.out.println(myCalendar.book(5, 15));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 15: {
                System.out.println("test 1.5 start:");
                System.out.println(myCalendar.book(5, 10));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 16: {
                System.out.println("test 1.6 start:");
                System.out.println(myCalendar.book(25, 55));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 21: {
                System.out.println("test 2.1 start:");
                System.out.println(myCalendar.book(24, 40));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 22: {
                System.out.println("test 2.2 start:");
                System.out.println(myCalendar.book(43, 50));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 23: {
                System.out.println("test 2.3 start:");
                System.out.println(myCalendar.book(27, 43));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 24: {
                System.out.println("test 2.4 start:");
                System.out.println(myCalendar.book(5, 21));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 25: {
                System.out.println("test 2.5 start:");
                System.out.println(myCalendar.book(30, 40));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 26: {
                System.out.println("test 2.6 start:");
                System.out.println(myCalendar.book(14, 29));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 27: {
                System.out.println("test 2.7 start:");
                System.out.println(myCalendar.book(3, 19));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 28: {
                System.out.println("test 2.8 start:");
                System.out.println(myCalendar.book(3, 14));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 29: {
                System.out.println("test 2.9 start:");
                System.out.println(myCalendar.book(25, 39));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 30: {
                System.out.println("test 2.10 start:");
                System.out.println(myCalendar.book(6, 19));
                System.out.println("false  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        myCalendar = new MyCalendarTwo();
        int testTime = 6;
        for (int i = 11; i <= testTime + 10; i++) {
            test(i);
        }
        myCalendar = new MyCalendarTwo();
        testTime = 10;
        for (int i = 21; i <= testTime + 20; i++) {
            test(i);
        }
    }
}
