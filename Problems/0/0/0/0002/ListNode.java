public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        if (this.next == null) {
            return String.valueOf(this.val);
        } else return String.valueOf(this.val) + this.next;
    }
}