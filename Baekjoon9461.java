// 9461. N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.

import java.util.*;

public class Baekjoon9461 {

	static int T;
	static int testCase[];
	static long triangle[]; // 100번째 triangle 변의 길이가 int 타입으로 표현될 수 없기 때문에 long 타입의 선언 필요
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		testCase = new int[T]; // (1 ≤ testCase의 원소값 ≤ 100)
		triangle = new long[100+1];
		
		for (int i=0; i<T; i++) {
			testCase[i]=sc.nextInt();
		}
		
		for (int i=0; i<T; i++) {
			System.out.println(makeTriangle(testCase[i]));
		}

	}
	
	static long makeTriangle(int n) {
		
		if (n==1 || n==2 || n==3) triangle[n]=1;
		else if (n==4 || n==5) triangle[n]=2;
		else if (n==6) triangle[n]=3;
		
		else {
			if (triangle[n-5]==0) triangle[n-5]=makeTriangle(n-5);
			if (triangle[n-1]==0) triangle[n-1]=makeTriangle(n-1);
			triangle[n]=triangle[n-5]+triangle[n-1];
		}
		
		return triangle[n];
	}

}
