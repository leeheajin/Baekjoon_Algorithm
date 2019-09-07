import java.util.Scanner;

public class a_1193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1<=n<=10,000,000
		
		int i=1;
		int num=1;
		
		while (num<=n) {
			num += i;
			i++;
		}
		
		i--;
		num -= i;
		
		if (i%2==0) {
			System.out.print(1+(n-num));
			System.out.print("/");
			System.out.print(i-n+num);
		}
		
		else {
			System.out.print(i-n+num);
			System.out.print("/");
			System.out.print(1+(n-num));
		}
		
	}

}
