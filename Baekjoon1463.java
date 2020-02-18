/* 1463. ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
	1) X�� 3���� ������ ��������, 3���� ������.
	2) X�� 2�� ������ ��������, 2�� ������.
	3) 1�� ����.
	���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�.
	������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�. */

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
		
		// math[1]=0 �ڵ�, 2���� N���� ����ϸ� ä�������� �ȴ�
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
