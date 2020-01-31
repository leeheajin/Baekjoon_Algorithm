// 2747. ù° �ٿ� n�� �־�����. n�� 45���� �۰ų� ���� �ڿ����̴�. n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.*;

public class Baekjoon2747 {

	static int n;
	static int pib[] = new int[45+1];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // n<=45
		
		pib[1]=1;
		System.out.println(pibo(n));
		
	}

	static int pibo(int n) {
		if (n==1) return 1;
		else if (n==0) return 0;
		
		if (pib[n-2]==0) pib[n-2]=pibo(n-2);
		if (pib[n-1]==0) pib[n-1]=pibo(n-1);
		
		return pib[n-2]+pib[n-1];
		
	}
}
