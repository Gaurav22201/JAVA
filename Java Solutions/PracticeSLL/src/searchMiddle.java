public class searchMiddle {
	// A simple Java program for traversal of a linked list
	static Node head; // head of list

	/* Linked list Node. This inner class is made static so that
	main() can access it */
	static class Node {
		int data;   //Define Data Type of Data to be inserted.
		Node next;
		Node(int d)
		{
			this.data = d;
			next = null;
		} // Constructor
	}
	
	public static void searchMid(Node head) {
		
		Node temp = head;
		int cnt = 0;
		while(head!=null) {
			if(cnt%2!=0)
				temp = temp.next;
			++cnt;
			head = head.next;
		}
		if (temp != null)
	        System.out.println("The middle element is [" +
	                            temp.data + "]\n");
		
	}
	

	public static void main(String[] args) {
		/* Start with the empty list. */
		searchMiddle llist = new searchMiddle(); //Object of the SuperClass

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link second node with the third node
		third.next = fourth;
		llist.searchMid(llist.head);
	}

}
