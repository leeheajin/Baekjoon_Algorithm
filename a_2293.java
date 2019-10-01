// 2293. n���� ������ ������ �ִ�. ������ ������ ��Ÿ���� ��ġ�� �ٸ���. �� ������ ������ ����ؼ�, �� ��ġ�� ���� k���� �ǵ��� �ϰ� �ʹ�. �� ����� ���� ���Ͻÿ�. ������ ������ �� ���� ����� �� �ִ�.

import java.util.Scanner;

public class a_2293 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int coin[] = new int[n+1];
		
		for (int i=1; i<=n; i++) coin[i] = sc.nextInt();
		
		int D[][] = new int [n+1][k+1]; // n���� �������� k�� ����� ����� ��
		
		 for (int i=1; i<=n; i++) {
		        D[i][0] = 1;
		    }
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=k; j++) {
				if (coin[i]>j) { 
					D[i][j] = D[i-1][j];
					
				}
				else { // coin[i] <= j
					D[i][j] = D[i-1][j] + D[i][j-coin[i]];
				}
			}
		}
		
		System.out.println(D[n][k]);
	}

}
