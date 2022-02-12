
public class insertSLL {
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
	
	public void insertfront(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		
	}
	
	public void insertend(int data) {
		Node new_node = new Node(data);
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		new_node.next = null;
		
	}
	
	public void insertmid(Node prev_node,int data) {
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	/* This function prints contents of linked list starting from head */
	public void printList()
	{
		Node n = head; //Initialising
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	

	public static void main(String[] args)
	{
		/* Start with the empty list. */
		insertSLL llist = new insertSLL(); //Object of the SuperClass

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link second node with the third node

		System.out.print("List before: ");
		llist.printList();
		System.out.print("\n");				
//		llist.insertfront(0);
//		llist.insertend(4);
		llist.insertmid(third, 6); //After the third Node.
		System.out.print("List After: ");
		llist.printList();
	}


}
