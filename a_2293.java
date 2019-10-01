// 2293. n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 이 동전을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다. 그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다.

import java.util.Scanner;

public class a_2293 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int coin[] = new int[n+1];
		
		for (int i=1; i<=n; i++) coin[i] = sc.nextInt();
		
		int D[][] = new int [n+1][k+1]; // n개의 동전으로 k원 만드는 경우의 수
		
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
