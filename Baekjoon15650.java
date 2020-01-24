// 15650. 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열, 고른 수열은 오름차순이어야 한다.

import java.util.*;

public class Baekjoon15650 {

	static int N;
	static int M;
	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static boolean check[];
	static int start;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // N까지의 자연수중에서
		M = sc.nextInt(); // 중복 없이 M개를 고른 수열
		check = new boolean[N+1]; // 선택된 수를 체크하기 위한 배열
		perm(0);
	}
	
	
	static void perm(int cnt) {
		if (cnt==M) {
			printStack();
			return; // 출력한 후 아래를 실행할 필요가 없다
		}
		
		start = 1; // 스택이 빈 스택일 경우
		// 스택이 비어있지 않은 경우, 맨 앞 숫자보다 큰 숫자가 뒤에 오면 중복되므로 스택의 맨 뒤 숫자를 가져온다
		if (stack.size()!=0) start = stack.peek();
		
		for (int i=start; i<=N; i++) {
			if (check[i]) {
				continue;
			}
			stack.push(i);
			check[i]=true;
			perm(cnt+1);
			stack.pop();
			check[i]=false;
		}
	}
	
	
	static void printStack() {
		for (int i=0; i<M; i++) 
			sb.append(stack.get(i)+" "); // 스택 안의 숫자들을 StringBuilder에 붙여 넣는다
		System.out.println(sb);
		sb.setLength(0); // StringBuilder의 길이를 0으로 만들어 초기화 시킨다
	}

}
