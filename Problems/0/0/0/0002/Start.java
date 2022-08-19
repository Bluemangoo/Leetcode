//Problem 0002
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                ListNode l1In = new ListNode(2, new ListNode(4, new ListNode(3))),
                        l2In = new ListNode(5, new ListNode(6, new ListNode(4)));
                System.out.println(new Solution().addTwoNumbers(l1In, l2In));
                System.out.println("708  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                ListNode l1In = new ListNode(0),
                        l2In = new ListNode(0);
                System.out.println(new Solution().addTwoNumbers(l1In, l2In));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                ListNode l1In = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        l2In = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
                System.out.println(new Solution().addTwoNumbers(l1In, l2In));
                System.out.println("89990001  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                ListNode l1In = new ListNode(5),
                        l2In = new ListNode(5);
                System.out.println(new Solution().addTwoNumbers(l1In, l2In));
                System.out.println("01  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
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
