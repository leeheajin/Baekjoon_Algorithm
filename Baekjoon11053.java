/* 11053. ���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�. */

import java.io.*;

public class Baekjoon11053 {

	static int n;
	static int A[];
	static int dp[][];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // ������ ũ��
		
		String str = br.readLine(); // ���� ��ü�� �� �ٷ� �Է¹���
		String tmp[] = str.split(" ");
		A = new int[n+1];
		for (int i=1; i<=n; i++) {
			A[i]=Integer.parseInt(tmp[i-1]);
		}
		
		dp = new int [n+1][2]; // 0: ���������� ���� �� ���� �� ������ �� �� �ε���, 1: ���� ���� �� ������ ����
		
		int index=0, length=0, maxLength=0;
		
		for (int i=1; i<=n; i++) {
			index=0; // �� �� �ݺ��� �� ���� �ʱ�ȭ �ϸ鼭 �� �ʿ�
			length=1;
			for (int j=1; j<i; j++) {
				if (A[j]<A[i] && length<=dp[j][1]) {
					index=j;
					length=dp[j][1]+1;
				}
			}
			dp[i][0]=index;
			dp[i][1]=length;
			if (maxLength<=length) maxLength=length;
		}
		
		System.out.println(maxLength);
		
	}

}
