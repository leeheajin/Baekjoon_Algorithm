// 7568. 여러분은 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력해야 한다.

import java.util.*;

public class Baekjoon7568 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int weight[] = new int [N];
		int height[] = new int [N];
		int rank[] = new int [N];
		
		for (int i=0; i<N; i++) { // N명의 몸무게와 키를 입력 받음
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
			rank[i] = 1; // 순위를 전부 1로 초기화
		}
		
		for (int i=0; i<N-1; i++) { // 모든 경우에 대해 사람들을 비교
			for (int j=i+1; j<N; j++) {
				if (weight[i]>weight[j]) {
					if (height[i]>height[j]) { // i가 j보다 확실히 덩치가 큰 경우
						rank[j]++;
					}
				}
				
				else if (weight[i]<weight[j]) {
					if (height[i]<height[j]) {
						rank[i]++;
					}
				}
			}
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(rank[i]+" ");
		}
		
	}

}
