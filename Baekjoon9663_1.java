// 9663. N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
// N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Baekjoon9663_1 {
	
	static int N;
	static int count = 0; // 현재까지 카운트 된 퀸을 놓는 방법의 수
	static int queen[]; // 퀸이 놓여져 있는 열 번호를 적기 위한 배열
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		queen = new int[N+1];
		
		chess(0);
		System.out.println(count);

	}
	
	static void chess (int row) { // 몇 번째 열의 어느 값까지 진행 되었는지를 인자로 받는다
		
		if (row==N) { // 모든 행에 퀸을 모두 놓은 경우
			count++;
			return;
		}
		
		for (int i=1; i<=N; i++) {
			if (isPossible(row+1, i)) {
				queen[row+1]=i; // row행, i열에 퀸을 놓는다
				chess(row+1);
				queen[row+1]=0; // 백트래킹 하는 경우 다시 퀸을 제거한다
			}
		}
		
	}
	
	static boolean isPossible (int row, int val) {
		
		for (int i=1; i<row; i++) {
			if (val==queen[i]) // 같은 열에 위치하는 경우
				return false;
			
			if (Math.abs(i-row) == Math.abs(queen[i]-val)) // 대각선에 위치하는 경우
				return false;
		}
		
		return true;
		
	}

}
