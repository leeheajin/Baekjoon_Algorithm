// 2798. N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

import java.util.*;

public class Baekjoon2798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int bestsum = 0; // 현재 최적의 합
		int sum = 0; // 세 카드의 합
		int card[] = new int[N]; // N장의 카드를 저장
		
		for (int i=0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		
		for (int i=0; i<N-2; i++) {
			
			for (int j=i+1; j<N-1; j++) {
				
				for (int k=j+1; k<N; k++) {
					
					sum = card[i]+card[j]+card[k];
					
					if (M-bestsum>M-sum && sum<=M) { // 현재의 값이 더 최적일 때
						bestsum = sum;
					}
					
					if (M-bestsum==0) { // 최적의 해라고 확신할 수 있는 경우
						System.out.println(bestsum);
						return;
					}
				
				}
				
			}
			
		}
		
		System.out.println(bestsum);
		
	}

}
