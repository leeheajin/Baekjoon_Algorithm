// 9663. N-Queen ������ ũ�Ⱑ N �� N�� ü���� ���� �� N���� ���� ������ �� ���� ���� �����̴�.
// N�� �־����� ��, ���� ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Baekjoon9663_1 {
	
	static int N;
	static int count = 0; // ������� ī��Ʈ �� ���� ���� ����� ��
	static int queen[]; // ���� ������ �ִ� �� ��ȣ�� ���� ���� �迭
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		queen = new int[N+1];
		
		chess(0);
		System.out.println(count);

	}
	
	static void chess (int row) { // �� ��° ���� ��� ������ ���� �Ǿ������� ���ڷ� �޴´�
		
		if (row==N) { // ��� �࿡ ���� ��� ���� ���
			count++;
			return;
		}
		
		for (int i=1; i<=N; i++) {
			if (isPossible(row+1, i)) {
				queen[row+1]=i; // row��, i���� ���� ���´�
				chess(row+1);
				queen[row+1]=0; // ��Ʈ��ŷ �ϴ� ��� �ٽ� ���� �����Ѵ�
			}
		}
		
	}
	
	static boolean isPossible (int row, int val) {
		
		for (int i=1; i<row; i++) {
			if (val==queen[i]) // ���� ���� ��ġ�ϴ� ���
				return false;
			
			if (Math.abs(i-row) == Math.abs(queen[i]-val)) // �밢���� ��ġ�ϴ� ���
				return false;
		}
		
		return true;
		
	}

}
