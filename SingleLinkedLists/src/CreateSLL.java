// A simple Java program for traversal of a linked list
class CreateSLL {
	Node head; // head of list

	/* Linked list Node. This inner class is made static so that
	main() can access it */
	static class Node {
		String data;   //Define Data Type of Data to be inserted.
		Node next;
		Node(String d)
		{
			this.data = d;
			next = null;
		} // Constructor
	}

	/* This function prints contents of linked list starting from head */
	public void printList()
	{
		Node n = head; //Initializing
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args)
	{
		/* Start with the empty list. */
		CreateSLL llist = new CreateSLL(); //Object of the SuperClass

		llist.head = new Node("1");
		Node second = new Node("2");
		Node third = new Node("3");

		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link second node with the third node

		llist.printList();
		
	}
}
