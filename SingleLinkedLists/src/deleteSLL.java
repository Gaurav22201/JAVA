public class deleteSLL {
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
		
		public static void delete(int key) {
			Node temp = head, prev=null;
			if(temp!=null && temp.data == key) {
				head = temp.next;
				return;
			}
			
			while(temp!=null && temp.data!=key) {
				prev = temp;
				temp = temp.next;
			}
			
			if(temp==null) {
				return;
						
			}
			prev.next = temp.next;
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
			deleteSLL llist = new deleteSLL(); //Object of the SuperClass

			llist.head = new Node(1);
			Node second = new Node(2);
			Node third = new Node(3);

			llist.head.next = second; // Link first node with the second node
			second.next = third; // Link second node with the third node

			System.out.print("List before: ");
			llist.printList();
			System.out.print("\n");				
			delete(2);
			System.out.print("List After: ");
			llist.printList();
		}
	}
