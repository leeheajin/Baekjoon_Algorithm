import java.util.Scanner;

public class Baekjoon2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1<=n<=1,000,000,000
		
		int i=1;
		int num=1;
		
		if (n==1) {
			System.out.println(i);
		}
		
		else {
			num++;
			while (n>=num) {
				num = num + (i*6);
				i++;
			}
			System.out.println(i);
		}
	}

}
