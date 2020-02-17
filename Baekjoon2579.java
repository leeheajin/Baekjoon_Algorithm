/* 2579. ��� ������ ���� ������ ���� ��Ģ�� �ִ�.
1.����� �� ���� �� ��ܾ� �Ǵ� �� ��ܾ� ���� �� �ִ�. ��, �� ����� �����鼭 �̾ ���� ����̳�, ���� ���� ������� ���� �� �ִ�.
2.���ӵ� �� ���� ����� ��� ��Ƽ��� �� �ȴ�. ��, �������� ��ܿ� ���Ե��� �ʴ´�.
3. ������ ���� ����� �ݵ�� ��ƾ� �Ѵ�.
���� ù ��° ����� ��� �̾� �� ��° ����̳�, �� ��° ������� ���� �� �ִ�.
������, ù ��° ����� ��� �̾� �� ��° ������� �ö󰡰ų�, ù ��°, �� ��°, �� ��° ����� �����ؼ� ��� ���� ���� ����.
�� ��ܿ� ���� �ִ� ������ �־��� �� �� ���ӿ��� ���� �� �ִ� �� ������ �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */

import java.util.*;

public class Baekjoon2579 {

	static int n; // ����� ��
	static int stairs[];
	static int score[][];
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		stairs = new int [n+1];
		score = new int [n+1][2+1];
		/* 1) ���� ���� n-1��° ��ܿ��� �ö�� ����� ���� �����Ѵ� : �� ��, 3ĭ �������� ���� �� ���� ������ n-1��° ���� �� ���� ���� ��� ���� ���� �����Ѵ�
		   2) ���� ���� n-2��° ��ܿ��� �ö�� ����� ���� �����Ѵ� : �� ��, ������ �����Ƿ� n-2��° ���� �� �ִ밪�� ���� ��� ���� ���� �����Ѵ� */
	
	
		for (int i=1; i<=n; i++) {
			stairs[i] = sc.nextInt();
		}

		calScore();
		
	}

	
	static void calScore () {
		
		score[1][1]=stairs[1]; // �ʱ� �� ����
		score[1][2]=stairs[1];
		
		for (int i=2; i<=n; i++) {
			score[i][1]=score[i-1][2]+stairs[i];
			score[i][2]=choiceMax(i-2)+stairs[i];
		}
		
		System.out.println(choiceMax(n));
		
	}
	
	
	static int choiceMax(int n) {
		
		int max = score[n][1];
		
		if (max<=score[n][2])
			max = score[n][2];
			
		return max;
		
	}
	
}
