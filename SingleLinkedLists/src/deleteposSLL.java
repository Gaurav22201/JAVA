public class deleteposSLL {
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
	
	public void printList()
	{
		Node n = head; //Initializing
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void deleteatpos(int pos) {
		// if LL is empty
		if(head==null) {
			return;
		}
		// If head needs to be removed
		Node temp = head;
		if(pos==0) {
			head = temp.next;
		}
		// Find previous node of the node to be deleted
		for(int i = 0; temp!=null && i<pos-1;i++) {
			temp = temp.next;
		}
		// If position is more than number of nodes
		if(temp.next == null || temp==null) {
			return;
		}
		
		Node next = temp.next.next;
		temp.next=next; // Unlink the deleted node from list
	}
	
	public static void main(String[] args) {
		/* Start with the empty list. */
		deleteposSLL llist = new deleteposSLL(); //Object of the SuperClass

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link second node with the third node

		System.out.print("List before: ");
		llist.printList();
		System.out.print("\n");				
		deleteatpos(0);
		System.out.print("List After: ");
		llist.printList();

	}

}
