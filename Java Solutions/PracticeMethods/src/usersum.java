import java.util.Scanner;

public class usersum {
	public static void sumofnum(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sumofnum(x,y);
		sc.close();


	}

}
