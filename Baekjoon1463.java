/* 1463. 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
	1) X가 3으로 나누어 떨어지면, 3으로 나눈다.
	2) X가 2로 나누어 떨어지면, 2로 나눈다.
	3) 1을 뺀다.
	정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
	연산을 사용하는 횟수의 최솟값을 출력하시오. */

import java.util.Scanner;

public class Baekjoon1463 {

	static int N;
	static int math[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		math = new int [N+1];
		
		calMin();
		
	}
	
	static void calMin() {
		
		// math[1]=0 자동, 2부터 N까지 계산하며 채워나가면 된다
		int min;
		for (int i=2; i<=N; i++) {
			min = math[i-1];
			if (i%2==0 && math[i/2]<=min) min=math[i/2];
			if (i%3==0 && math[i/3]<=min) min=math[i/3];
			
			math[i]=min+1;
		}
		
		System.out.println(math[N]);

	}

}
