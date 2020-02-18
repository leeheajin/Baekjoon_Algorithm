// 3053. 반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Baekjoon3053 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		
		System.out.printf("%.6f\n", Math.PI*R*R);
		System.out.printf("%.6f\n", (double)2*R*R);
		
	}

}
