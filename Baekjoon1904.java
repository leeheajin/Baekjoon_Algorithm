// 1904. 첫 번째 줄에 지원이가 만들 수 있는 길이가 N인 모든 2진 수열의 개수를 15746으로 나눈 나머지를 출력한다.

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
		
		if(n==0) return 0; // 초기값 설정
		else if(n==1) return 1;
		else if(n==2) return 2;
		
		if(tile[n-2]==0) tile[n-2]=makeTile(n-2); // 앞 쪽의 계산이 완료되지 않은 경우
		if(tile[n-1]==0) tile[n-1]=makeTile(n-1);
		
		tile[n]=(tile[n-1]+tile[n-2])%15746;
		return (tile[n]);
	}

}
