/* 10844. 45656이란 수를 보자.
	이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
	세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
	N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.) */

import java.util.*;

public class Baekjoon10844 {
	
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
	    long number[][] = new long[101][10]; // 10을 0으로 두고, 9에 오는 값을 손쉽게 계산하기 위해서
	 
	    for (int i=1; i<=9; i++) {
	        number[1][i] = 1;
	    }
	 
	    for (int i=2; i<=n; i++) {
	    	number[i][0] = number[i-1][1]; // 무조건 이전의 줄의 1로 끝나는 부분에 있는 값이 내려오게 된다 (ex: 1210 과 같이 1->0으로 끝나는 경우를 카운트), 0보다 작은 경우는 없기 때문에 고려 불필요
	        for (int j = 1; j <= 8; j++) {
	        	number[i][j] = (number[i-1][j-1]+number[i-1][j+1])%1000000000;
	        }
	        number[i][9] = number[i-1][8];
	    }
	 
	    long sum = 0;
	    
	    for (int i = 0; i < 10; i++) {
	        sum += number[n][i];
	    }
	    
	    System.out.println(sum%1000000000);
	    
	}

}