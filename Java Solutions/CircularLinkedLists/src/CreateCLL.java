
public class CreateCLL {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	public void printlist() {
		if(head !=null) {
			Node temp = head;
			
			do {
				System.out.println(temp.data);
				temp = temp.next;
			}while(temp!=head);
			
		}
	}
	
	public static void main(String[] args) {
		CreateCLL cllist = new CreateCLL();
		
		cllist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		cllist.head.next = second;
		second.next = third;
		third.next = cllist.head;
		
		cllist.printlist();

	}

}
