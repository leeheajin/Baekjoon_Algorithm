// 2748. n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

import java.util.*;

public class Baekjoon2748 {

	static int n;
	static long fib[]; // long 타입으로 선언해주지 않으면 수들이 기하급수적으로 커지기 때문에 에러가 발생한다
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // n<=90
		fib = new long[90+1];
		
		fib[1]=1;
		System.out.println(fibo(n));
	}
	
	public static long fibo(int n) {
		if (n==0) return 0; // fib[0]=0
		else if (n==1) return 1; // fib[1]=1
		
		if (fib[n-2]==0) fib[n-2]=fibo(n-2); // 함수를 재귀적으로 호출하나, 반복되는 계산을 피하기 위해 값들을 저장한다
		if (fib[n-1]==0) fib[n-1]=fibo(n-1);

		return fib[n-1]+fib[n-2];
	}

}
