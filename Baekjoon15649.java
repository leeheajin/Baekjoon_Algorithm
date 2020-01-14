// 15649. �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����, ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.

import java.util.*;

public class Baekjoon15649 {

	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static boolean[] visit;
	static int N;
	static int M;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// (1 �� M �� N �� 8)
		N = sc.nextInt(); // N���� �ڿ��� �߿���
		M = sc.nextInt(); // M���� ȣ��
		visit = new boolean[N+1]; // �湮 ���θ� üũ�ϱ� ���� ����
		perm(0); // �Լ� ȣ��
		
	}
	
	static void perm(int cnt) { // cnt�� ���� ���ÿ� ����ִ� ���� ������ ����
		if(cnt == M) { // ������ ����á�� ���
			printStack();
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(visit[i]) { // �ش� ��ȣ�� �̹� ���ÿ� ������� ��� ����ģ��
				continue;
			}
			stack.push(i); // ������� ���� ��� �ϴ� �������
			visit[i] = true;
			perm(cnt+1); // ���� �ܰ踦 ������
			stack.pop(); // ���� �ܰԸ� ������ ��, ���� �� �ش� ��ȣ�� pop(false)�ϰ� i�� �������� ���� ���� ����ִ´�
			visit[i] = false;
		}
		
	}
	
	static void printStack() {
		for(int i = 0; i < M; i++) {
			sb.append(stack.get(i) + " ");
		}
		System.out.println(sb);
		sb.setLength(0); // StringBuffer�� �ʱ�ȭ
	}

}
