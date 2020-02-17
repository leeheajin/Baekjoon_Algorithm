/* 2579. 계단 오르는 데는 다음과 같은 규칙이 있다.
1.계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
2.연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
3. 마지막 도착 계단은 반드시 밟아야 한다.
따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다.
하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세 번째 계단을 연속해서 모두 밟을 수는 없다.
각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오. */

import java.util.*;

public class Baekjoon2579 {

	static int n; // 계단의 수
	static int stairs[];
	static int score[][];
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		stairs = new int [n+1];
		score = new int [n+1][2+1];
		/* 1) 앞의 값은 n-1번째 계단에서 올라온 경우의 값을 저장한다 : 이 때, 3칸 연속으로 밟을 수 없기 때문에 n-1번째 값의 뒤 값과 현재 계단 값의 합을 저장한다
		   2) 뒤의 값은 n-2번째 계단에서 올라온 경우의 값을 저장한다 : 이 때, 제약이 없으므로 n-2번째 값들 중 최대값과 현재 계단 값의 합을 저장한다 */
	
	
		for (int i=1; i<=n; i++) {
			stairs[i] = sc.nextInt();
		}

		calScore();
		
	}

	
	static void calScore () {
		
		score[1][1]=stairs[1]; // 초기 값 세팅
		score[1][2]=stairs[1];
		
		for (int i=2; i<=n; i++) {
			score[i][1]=score[i-1][2]+stairs[i];
			score[i][2]=choiceMax(i-2)+stairs[i];
		}
		
		System.out.println(choiceMax(n));
		
	}
	
	
	static int choiceMax(int n) {
		
		int max = score[n][1];
		
		if (max<=score[n][2])
			max = score[n][2];
			
		return max;
		
	}
	
}
