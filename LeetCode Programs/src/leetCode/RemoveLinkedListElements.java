package leetCode;

// class ListNode {
//	      int val;
//	      ListNode next;
//	      ListNode() {}
//	      ListNode(int val) { this.val = val; }
//	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//	  }
public class RemoveLinkedListElements {

	public static void main(String[] args) {
		
		ListNode list = new ListNode(1);
		list.next = new ListNode(4);
		list.next.next = new ListNode(6);
		list.next.next.next = new ListNode(2);
		list.next.next.next.next = new ListNode(3);
		list.next.next.next.next.next = new ListNode(5);
		list.next.next.next.next.next.next = new ListNode(6);

		int val = 6;
		
		ListNode head = removeElements(list, val);
		
		printList(head);
	}
	
	public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;


        if(head == null)
            return null;

        while(head != null && head.val == val){
                head = head.next;
        }
        
        while(temp.next != null){
            if(temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return head;
    }
	
	private static void printList(ListNode head) {

		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
