import java.util.Scanner;

public class maxfunc {
	public static void max(int arr[]) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			if(temp < arr[i]) {
				temp = arr[i];
			}
			
		}
		System.out.print(temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for(int j = 0; j<arr.length;j++) {
			arr[j] = sc.nextInt();
		}
		max(arr);
		sc.close();
	}

}
