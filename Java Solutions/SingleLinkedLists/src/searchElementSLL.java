public class searchElementSLL {
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
	
	public static boolean search(Node head, int key) {
		if(head == null) {
			return false;
		}
		
		Node temp = head;
		while(temp!=null) {
			if(temp.data == key) {
				return true;
			}
			temp = temp.next;
			
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		/* Start with the empty list. */
		searchElementSLL llist = new searchElementSLL(); //Object of the SuperClass

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link second node with the third node
 
        if (llist.search(llist.head, 1))
            System.out.println("Yes");
        else
            System.out.println("No");

	}

}
