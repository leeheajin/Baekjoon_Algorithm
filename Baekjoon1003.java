// 1003. fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
// 마찬가지로 피보나치 수열이 두 개가 존재한다고 생각하고 풀이하면 된다 !!

import java.util.*;

public class Baekjoon1003 {

	static int T;
	static int N[];
	static int count_0[];
	static int count_1[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		N = new int[T]; // 0<=N<=40
		count_0 = new int[T+1];
		count_1 = new int[T+1];
		count_1[1]=1;
		count_0[0]=1;
		
		for (int i=0; i<T; i++) {
			N[i]=sc.nextInt();
		}
		
		for (int i=0; i<T; i++) {
			System.out.println(pibo0(N[i])+" "+pibo1(N[i]));
		}
	}
	
	static int pibo0 (int n) {
		if (n==0) return 1; // count_0[0]=1
		else if (n==1) return 0; // count_0[1]=0
		
		if (count_0[n-1]==0) count_0[n-1]=pibo0(n-1);
		if (count_0[n-2]==0) count_0[n-2]=pibo0(n-2);
		
		count_0[n]=count_0[n-1]+count_0[n-2];
		return count_0[n];
	}

	static int pibo1 (int n) {
		if (n==0) return 0; // count_1[0]=0
		else if (n==1) return 1; // count_1[1]=1
		
		if (count_1[n-1]==0) count_1[n-1]=pibo1(n-1);
		if (count_1[n-2]==0) count_1[n-2]=pibo1(n-2);
		
		count_1[n]=count_1[n-1]+count_1[n-2];
		return count_1[n];
	}
}