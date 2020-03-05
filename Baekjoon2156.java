/* 2156. ȿ�ִ� �� �� �ִ� ��� ���� ���� �����ָ� ������ ���ؼ� � ������ ���� �����ؾ� ���� ����ϰ� �ִ�.
	1���� n������ ��ȣ�� �پ� �ִ� n���� ������ ���� ������� ���̺� ���� ���� �ְ�, �� ������ �ܿ� ����ִ� �������� ���� �־����� ��,
	ȿ�ָ� ���� ���� ���� ���� �����ָ� ���� �� �ֵ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�. */

import java.io.*;

public class Baekjoon2156 {

	static int n;
	static int grape[];
	static int dp[];
	static int answer;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		grape = new int[n+1];
		dp = new int[n+1];
		
		for (int i=1; i<=n; i++) {
			String str = br.readLine();
			grape[i] = Integer.parseInt(str);
		}
		
		dp[1]=grape[1];
		if (n>1) dp[2]=dp[1]+grape[2]; // n>1�̸� ���α׷��� ������ �Ф�
		for (int i=3; i<=n; i++) {
			// �������� �������� 0�� �� �� vs �������� �������� 1�� �� �� vs �������� �������� 2�� �� ��
			dp[i]=choiceMax(dp[i-1], dp[i-2]+grape[i], dp[i-3]+grape[i]+grape[i-1]);
		}
		
		System.out.println(dp[n]);
		
	}
	
	static int choiceMax(int a, int b, int c) {
		
		int max = a;
		if (b>max) max = b;
		if (c>max) max = c;
		
		return max;
		
	}
}
