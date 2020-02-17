// 1932. �ﰢ���� ������ ��, ù° �ٿ� ���� �ִ밡 �Ǵ� ��ο� �ִ� ���� ���� ����Ѵ�.

import java.io.*;

public class Baekjoon1932 {

	static int n;
	static int triangle[][];
	static int path[][];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n= Integer.parseInt(br.readLine());
		triangle = new int[n+1][n+1]; // �� ĭ�� ũ�� ���� ����� �� �� ��(���� �������� �ʴ� �κ�)�� 0 ������ ó���ǰ� ��, �ִ밪�� �����ϱ� ���ؼ��� ������ ���� �ִ� ���� �����ϰ� �����
		path = new int[n+1][n+1];
		
		String tmp[]; // �� ���� ��°�� �о�� ���ø� �ϱ� ���� ���ڿ� ����
		for (int i=1; i<=n; i++) {
			tmp=br.readLine().split(" "); // �� ���� ��°�� �о�´�
			for (int j=1; j<=i; j++) { // i��° ���� i���� ���ڷ� �̷���� �ִ�
				triangle[i][j]=Integer.parseInt(tmp[j-1]); // ������ ���� ���ø��ؼ� int������ ����ȯ �Ŀ� ���� �ִ´�
			}
		}
		
		calPath();

	}
	
	
	static void calPath() {
		
		path[1][1]=triangle[1][1]; // �ʱ� �� ����
		for (int i=2; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (path[i-1][j-1]<=path[i-1][j])
					path[i][j]=path[i-1][j]+triangle[i][j];
				else 
					path[i][j]=path[i-1][j-1]+triangle[i][j];
			}
		}
		
		choiceMin();
		
	}
	
	
	static void choiceMin() {
		
		int max=path[n][1];
		for (int i=2; i<=n; i++) {
			if (max<=path[n][i]) // �� ���� ���� ������ ��� �ּҰ��� �ٲ۴�
				max=path[n][i];
		}
		
		System.out.println(max);
		
	}

}
