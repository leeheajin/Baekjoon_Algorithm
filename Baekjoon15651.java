// 15651. �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 1���� N���� �ڿ��� �߿��� M���� �� ����, ���� ���� ���� �� ��� �ȴ�.

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
			return; // ����� �� �Ʒ��� ������ �ʿ䰡 ����
		}
		
		for (int i=1; i<=N; i++) {
			stack.push(i);
			perm(cnt+1);
			stack.pop();
		}
	}
	
	
	static void printStack() {
		for (int i=0; i<M; i++) 
			sb.append(stack.get(i)+" "); // ���� ���� ���ڵ��� StringBuilder�� �ٿ� �ִ´�
		sb.append("\n"); // ���� �����ʹ� �ٸ��� �ð��� ���̱� ���� ������ ������� �ʰ� �ѹ��� ����Ͽ���.
	}

}

