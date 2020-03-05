/* 2156. 효주는 될 수 있는 대로 많은 양의 포도주를 맛보기 위해서 어떤 포도주 잔을 선택해야 할지 고민하고 있다.
	1부터 n까지의 번호가 붙어 있는 n개의 포도주 잔이 순서대로 테이블 위에 놓여 있고, 각 포도주 잔에 들어있는 포도주의 양이 주어졌을 때,
	효주를 도와 가장 많은 양의 포도주를 마실 수 있도록 하는 프로그램을 작성하시오. */

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
		if (n>1) dp[2]=dp[1]+grape[2]; // n>1이면 프로그램이 터진다 ㅠㅠ
		for (int i=3; i<=n; i++) {
			// 연속으로 마신잔이 0잔 일 때 vs 연속으로 마신잔이 1잔 일 때 vs 연속으로 마신잔이 2잔 일 때
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
