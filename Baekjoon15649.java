// 15649. 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열, 수열은 사전 순으로 증가하는 순서로 출력해야 한다.

import java.util.*;

public class Baekjoon15649 {

	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static boolean[] visit;
	static int N;
	static int M;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// (1 ≤ M ≤ N ≤ 8)
		N = sc.nextInt(); // N개의 자연수 중에서
		M = sc.nextInt(); // M개를 호출
		visit = new boolean[N+1]; // 방문 여부를 체크하기 위한 변수
		perm(0); // 함수 호출
		
	}
	
	static void perm(int cnt) { // cnt는 현재 스택에 들어있는 수의 개수와 같다
		if(cnt == M) { // 스택이 가득찼을 경우
			printStack();
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(visit[i]) { // 해당 번호가 이미 스택에 들어있을 경우 지나친다
				continue;
			}
			stack.push(i); // 들어있지 않을 경우 일단 집어넣음
			visit[i] = true;
			perm(cnt+1); // 다음 단계를 수행함
			stack.pop(); // 이후 단게를 수행한 후, 리턴 해 해당 번호를 pop(false)하고 i를 증가시켜 다음 수를 집어넣는다
			visit[i] = false;
		}
		
	}
	
	static void printStack() {
		for(int i = 0; i < M; i++) {
			sb.append(stack.get(i) + " ");
		}
		System.out.println(sb);
		sb.setLength(0); // StringBuffer를 초기화
	}

}
