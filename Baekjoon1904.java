// 1904. ù ��° �ٿ� �����̰� ���� �� �ִ� ���̰� N�� ��� 2�� ������ ������ 15746���� ���� �������� ����Ѵ�.

import java.util.*;

public class Baekjoon1904 {

	static int N;
	static int tile[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		N = sc.nextInt(); // N<=1000000
		tile = new int[N+1];

		System.out.println(makeTile(N));
		
	}
	
	static int makeTile(int n) {
		
		if(n==0) return 0; // �ʱⰪ ����
		else if(n==1) return 1;
		else if(n==2) return 2;
		
		if(tile[n-2]==0) tile[n-2]=makeTile(n-2); // �� ���� ����� �Ϸ���� ���� ���
		if(tile[n-1]==0) tile[n-1]=makeTile(n-1);
		
		tile[n]=(tile[n-1]+tile[n-2])%15746;
		return (tile[n]);
	}

}
