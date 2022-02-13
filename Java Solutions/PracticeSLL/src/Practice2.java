import deleteposSLL.Node;

public class Practice2 {
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
		
		public void pushelement(int data) {
			Node n = new Node(data);
			n.next = head;
			head = n;
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
		
		public static void trim(int pos) { 
			Node temp = head;
			if(pos==0) {
				head = temp.next;
			}
			
	}

		public static void main(String[] args)
		{
			/* Start with the empty list. */
			Practice2 llist = new Practice2(); //Object of the SuperClass
			for(int i=1;i<51;i++) {
				llist.pushelement(i);
			}
			llist.printList();
			for(int i=0;i<25;i++) {
				Practice2.trim(0);
			}
			
			System.out.println("\n");
			llist.printList();
		}
	}


