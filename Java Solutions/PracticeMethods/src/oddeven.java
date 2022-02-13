import java.util.Scanner;

public class oddeven {
	public static void odencheck(int a) {
		if(a%2==0) {
			System.out.println(a+" is Even.");
		}
		else {
			System.out.println(a+" is Odd.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		odencheck(x);
		sc.close();

	}

}
