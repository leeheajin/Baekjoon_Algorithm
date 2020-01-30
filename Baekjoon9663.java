// 9663. N-Queen ������ ũ�Ⱑ N �� N�� ü���� ���� �� N���� ���� ������ �� ���� ���� �����̴�.
// N�� �־����� ��, ���� ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Baekjoon9663 {

	public static int n;
	public static int count;
	public static int[] map;

	public static boolean check(int[] map, int col) {
		
		for (int i=1; i<col; i++) {
			if (map[i] == map[col]) // ���� ���� ��ġ�ϴ� ���
				return false;
			
			if (Math.abs(i - col) == Math.abs(map[i] - map[col])) // �밢���� ��ġ�ϴ� ���
				return false;
		}
		
		return true;
		
	}

	public static void dfs(int[] map, int col) { // col��° ������ ���� ������ �ִ�
		
		if (col==n) { // ���� ������ üũ�� ��� (n������ ��� ���� ������ �ִ� ���) : ������ ������ ������ ������ ���� ��� ���� �� �ִ� ���̴�
			count++;
		}

		else {
			for (int i=1; i<=n; i++) {
				map[col+1] = i; 
				if (check(map, col+1)) { // ���� �� �ִ� ��쿡 �ش� �ڸ��� ���� ���´�
					dfs(map, col+1); // ��������� �Լ��� �ٽ� ȣ��
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