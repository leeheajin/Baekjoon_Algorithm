// 1929. M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

package ����2;

import java.util.Scanner;

public class a_1929 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		for (int i=M; i<=N; i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
		
	}

	public static boolean prime (int num) {
		
		boolean isPrime = true;
		int sqrt = (int)Math.sqrt(num);

		if (num==1) {
			return false;
		}
		
		for (int i=2; i<=sqrt; i++) {
			if (num%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		
	}
	
}
