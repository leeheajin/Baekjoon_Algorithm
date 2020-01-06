// 2231. 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

import java.util.*;

public class Beakjoon2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt(); // 이용자가 입력한 숫자
		
		int sum = 0; // 분해합을 나타내는 숫자
		int num = 0; // 몫을 나타내는 수
		
		for (int i=1; i<N; i++) {
			sum=i;
			num=i;
			
			while (num!=0) {
				sum += num%10;
				num = num/10;
			}
			
			if (sum==N) {
				System.out.println(i);
				return;
			}
			
		}
		System.out.println(0);
	}

}
