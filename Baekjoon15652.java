/* 15652. 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 			1부터 N까지 자연수 중에서 M개를 고른 수열
			같은 수를 여러 번 골라도 된다.
			고른 수열은 비내림차순이어야 한다.
				길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다. */

import java.util.*;
import java.io.*;

public class Baekjoon15652 {
	
	static int N;
	static int M;
	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static int check[];
	static int start;
	static int tmp;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		tmp=1;
		perm(0);
	}

	static void perm(int cnt) {
		if (cnt==M) {
			printStack();
			return; // 출력한 후 아래를 실행할 필요가 없다
		}
		
		for (int i=tmp; i<=N; i++) {
			tmp=stack.push(i);
			perm(cnt+1);
			stack.pop();
		}
	}
	
	
	static void printStack() {
		for (int i=0; i<M; i++) 
			sb.append(stack.get(i)+" "); // 스택 안의 숫자들을 StringBuilder에 붙여 넣는다
		System.out.println(sb);
		sb.setLength(0); // StringBuilder의 길이를 0으로 만들어 초기화 시킨다
	}

}
