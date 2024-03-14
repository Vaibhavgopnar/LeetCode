package leetCode;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		
		ListNode list = new ListNode(1);
		list.next = new ListNode(4);
		list.next.next = new ListNode(6);
		list.next.next.next = new ListNode(2);
		list.next.next.next.next = new ListNode(3);
		list.next.next.next.next.next = new ListNode(5);
		
		ListNode head = middleNode(list);
		
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}

	}
	
public static ListNode middleNode(ListNode head) {
        
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        count = (int)Math.ceil(count/2);

        for(int i = 0; i < count; i++){
            head = head.next;
        }

        return head;
    }

}
