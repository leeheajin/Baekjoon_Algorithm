// 1018. �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢���� �ּ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.*;

public class a_1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = N*M;
		char color;
		
		char NM[][] = new char [N][M];
		
		for (int i=0; i<N; i++) {
			String s = sc.next(); // String Ÿ������ �� �پ� �Է� ����
			for (int j=0; j<M; j++) {
				NM[i][j] = s.charAt(j); // ���� �� ĭ�� �� ���� char���·� ����
			}
		}
		
		
		for (int i=0; i<=N-8; i++) {
			for (int j=0; j<=M-8; j++) {
				int count = 0;
				color = NM[i][j]; // ������(���簢���� �� ���� �� �κ�)�� �÷��� ����
				for (int x=i; x<i+8; x++) {
					for (int y=j; y<j+8; y++) {
						if ((i+j)%2==(x+y)%2) { // ��, ���� ���� ¦�� or Ȧ���� ���� 
							if (color!=NM[x][y]) { // ���� ������ ���� ���� ��쿡�� �ش� ü�� ĭ�� �÷��� ���ƾ� ��
								count ++;
							}
						}
						else { // ���� ������ ���� �ٸ� ��쿡�� �ش� ü�� ĭ�� �÷��� �ݴ��� �����̾�� ��
							if (color==NM[x][y]) { // �ش� ü�� ���� �÷��� ���� ��쿡�� �ٲپ� ĥ�ϴ� ���� �ʿ�
								count ++;
							}
						}
					}
				}
				if (count<=min) min = count; // ������ �ּ� ������ ���� ���, ������ �ּ� ���� ����
				if (64-count<=min) min = 64-count; // �������� �÷��� �ݴ� �÷��� ���� ����� ���� ����
			}
		}
		
		System.out.println(min);
	}

}
