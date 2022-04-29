//Problem 0002
public class Start {
    private static void printLnListNode(ListNode listNode){
        if(listNode.next==null){
            System.out.println(listNode.val);
            return;
        }
        System.out.print(listNode.val);
        printLnListNode(listNode.next);
    }
    private static void test1(){
        System.out.println("test 1 start:");
        ListNode l1In = new ListNode(2,new ListNode(4, new ListNode(3))),
                l2In = new ListNode(5,new ListNode(6,new ListNode(4)));
        printLnListNode(new Solution().addTwoNumbers(l1In,l2In));
        System.out.println("Should be: 708\n");
    }
    private static void test2(){
        System.out.println("test 2 start:");
        ListNode l1In = new ListNode(0),
                l2In = new ListNode(0);
        printLnListNode(new Solution().addTwoNumbers(l1In,l2In));

        System.out.println("Should be: 0\n");
    }
    private static void test3(){
        System.out.println("test 3 start:");
        ListNode l1In = new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))),
            l2In = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
        printLnListNode(new Solution().addTwoNumbers(l1In,l2In));
        System.out.println("Should be: 89990001\n");
    }
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
