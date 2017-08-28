package Top100LikedQuestions;

public class HasCycle {

	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;

		if (head.next == null)
			return false;

		ListNode curr = head;
		ListNode prev = head;

		while (curr != null) {
			if (curr.next != null)
				curr = curr.next;
			else
				return false;

			if (curr.next != null)
				curr = curr.next;
			else
				return false;

			if (prev.next != null)
				prev = prev.next;
			else
				return false;

			if (curr == prev)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);

		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		//l4.next=l2;
		System.out.println(hasCycle(l1));
	}

}
