// 15650. �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����, �� ������ ���������̾�� �Ѵ�.

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
		N = sc.nextInt(); // N������ �ڿ����߿���
		M = sc.nextInt(); // �ߺ� ���� M���� �� ����
		check = new boolean[N+1]; // ���õ� ���� üũ�ϱ� ���� �迭
		perm(0);
	}
	
	
	static void perm(int cnt) {
		if (cnt==M) {
			printStack();
			return; // ����� �� �Ʒ��� ������ �ʿ䰡 ����
		}
		
		start = 1; // ������ �� ������ ���
		// ������ ������� ���� ���, �� �� ���ں��� ū ���ڰ� �ڿ� ���� �ߺ��ǹǷ� ������ �� �� ���ڸ� �����´�
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
			sb.append(stack.get(i)+" "); // ���� ���� ���ڵ��� StringBuilder�� �ٿ� �ִ´�
		System.out.println(sb);
		sb.setLength(0); // StringBuilder�� ���̸� 0���� ����� �ʱ�ȭ ��Ų��
	}

}
