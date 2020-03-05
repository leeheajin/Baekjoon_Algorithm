/* 10844. 45656�̶� ���� ����.
	�� ���� ������ ��� �ڸ����� ���̰� 1�� ����. �̷� ���� ��� ����� �Ѵ�.
	�����̴� ���� ���̰� N�� ��� ���� �� �� �ִ��� �ñ�������.
	N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (0���� �����ϴ� ���� ����.) */

import java.util.*;

public class Baekjoon10844 {
	
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
	    long number[][] = new long[101][10]; // 10�� 0���� �ΰ�, 9�� ���� ���� �ս��� ����ϱ� ���ؼ�
	 
	    for (int i=1; i<=9; i++) {
	        number[1][i] = 1;
	    }
	 
	    for (int i=2; i<=n; i++) {
	    	number[i][0] = number[i-1][1]; // ������ ������ ���� 1�� ������ �κп� �ִ� ���� �������� �ȴ� (ex: 1210 �� ���� 1->0���� ������ ��츦 ī��Ʈ), 0���� ���� ���� ���� ������ ��� ���ʿ�
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