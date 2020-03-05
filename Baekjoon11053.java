/* 11053. 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다. */

import java.io.*;

public class Baekjoon11053 {

	static int n;
	static int A[];
	static int dp[][];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 수열의 크기
		
		String str = br.readLine(); // 수열 전체를 한 줄로 입력받음
		String tmp[] = str.split(" ");
		A = new int[n+1];
		for (int i=1; i<=n; i++) {
			A[i]=Integer.parseInt(tmp[i-1]);
		}
		
		dp = new int [n+1][2]; // 0: 이전까지의 값들 중 가장 긴 수열의 맨 뒤 인덱스, 1: 현재 가장 긴 수열의 길이
		
		int index=0, length=0, maxLength=0;
		
		for (int i=1; i<=n; i++) {
			index=0; // 한 번 반복할 때 마다 초기화 하면서 비교 필요
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
