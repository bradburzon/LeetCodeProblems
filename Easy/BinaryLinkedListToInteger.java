public class BinaryLinkedListToInteger {

    public int getDecimalValue(ListNode head){
        int result = 0;
        while(head != null){
            result *= 2;
            result += head.val;
            head = head.next;
        }
        return result;
    }
}