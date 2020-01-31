// 2747. 첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다. n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

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
