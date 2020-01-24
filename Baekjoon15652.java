/* 15652. �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 			1���� N���� �ڿ��� �߿��� M���� �� ����
			���� ���� ���� �� ��� �ȴ�.
			�� ������ �񳻸������̾�� �Ѵ�.
				���̰� K�� ���� A�� A1 �� A2 �� ... �� AK-1 �� AK�� �����ϸ�, �񳻸������̶�� �Ѵ�. */

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
			return; // ����� �� �Ʒ��� ������ �ʿ䰡 ����
		}
		
		for (int i=tmp; i<=N; i++) {
			tmp=stack.push(i);
			perm(cnt+1);
			stack.pop();
		}
	}
	
	
	static void printStack() {
		for (int i=0; i<M; i++) 
			sb.append(stack.get(i)+" "); // ���� ���� ���ڵ��� StringBuilder�� �ٿ� �ִ´�
		System.out.println(sb);
		sb.setLength(0); // StringBuilder�� ���̸� 0���� ����� �ʱ�ȭ ��Ų��
	}

}
