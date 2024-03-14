package leetCode.Medium;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next = new ListNode(3);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next = new ListNode(4);
		
		ListNode list = addTwoNumbers(list1, list2);
	
		while(list != null) {
			System.out.println(list.val);
			list = list.next;
		}

	}
	
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(0);
        ListNode tail = temp;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
        
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return temp.next;
    }

}
