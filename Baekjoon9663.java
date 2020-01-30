// 9663. N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
// N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Baekjoon9663 {

	public static int n;
	public static int count;
	public static int[] map;

	public static boolean check(int[] map, int col) {
		
		for (int i=1; i<col; i++) {
			if (map[i] == map[col]) // 같은 열에 위치하는 경우
				return false;
			
			if (Math.abs(i - col) == Math.abs(map[i] - map[col])) // 대각선에 위치하는 경우
				return false;
		}
		
		return true;
		
	}

	public static void dfs(int[] map, int col) { // col번째 열까지 퀸이 놓아져 있다
		
		if (col==n) { // 열을 끝까지 체크한 경우 (n열까지 모두 퀸이 놓아져 있는 경우) : 이전에 오류가 없었기 때문에 퀸을 모두 놓을 수 있는 것이다
			count++;
		}

		else {
			for (int i=1; i<=n; i++) {
				map[col+1] = i; 
				if (check(map, col+1)) { // 놓을 수 있는 경우에 해당 자리에 퀸을 놓는다
					dfs(map, col+1); // 재귀적으로 함수를 다시 호출
				}

			}
		}

	}

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n+1];
		
		for (int i=1; i<=n; i++) {
			map[1]=i;
			dfs(map, 1);
		}
		
		System.out.println(count);
		
	}
	
}