// 15651. 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
// 1부터 N까지 자연수 중에서 M개를 고른 수열, 같은 수를 여러 번 골라도 된다.

import java.util.*;
import java.io.*; // BufferReader, InputStreamReader

public class Baekjoon15651 {

	static int N;
	static int M;
	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static int start;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		perm(0);
		System.out.print(sb);
	}
	
	
	static void perm(int cnt) {
		if (cnt==M) {
			printStack();
			return; // 출력한 후 아래를 실행할 필요가 없다
		}
		
		for (int i=1; i<=N; i++) {
			stack.push(i);
			perm(cnt+1);
			stack.pop();
		}
	}
	
	
	static void printStack() {
		for (int i=0; i<M; i++) 
			sb.append(stack.get(i)+" "); // 스택 안의 숫자들을 StringBuilder에 붙여 넣는다
		sb.append("\n"); // 앞의 문제와는 다르게 시간을 줄이기 위해 각각을 출력하지 않고 한번에 출력하였다.
	}

}

