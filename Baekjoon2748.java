// 2748. n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.*;

public class Baekjoon2748 {

	static int n;
	static long fib[]; // long Ÿ������ ���������� ������ ������ ���ϱ޼������� Ŀ���� ������ ������ �߻��Ѵ�
	
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
		
		if (fib[n-2]==0) fib[n-2]=fibo(n-2); // �Լ��� ��������� ȣ���ϳ�, �ݺ��Ǵ� ����� ���ϱ� ���� ������ �����Ѵ�
		if (fib[n-1]==0) fib[n-1]=fibo(n-1);

		return fib[n-1]+fib[n-2];
	}

}
