// 1149.�� ���� �������� ĥ�� �� ��� ���, �ʷ����� ĥ�� �� ��� ���, �Ķ����� ��� ����� �־��� ��, ��� ���� ĥ�ϴ� ����� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.io.*;

public class Baekjoon1149 {

	static int N;
	static int color[][];
	static int minCost;
	static int calCost[][];
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		color = new int [N+1][3+1]; // RGB ��ĥ ���� ����, �� ĥ�ϴ� ������ ��� 1000���� �۰ų� ����
		calCost = new int [N+1][3+1];
		
		String tmp[]; // �� ���� ��°�� �о�� ���ø� �ϱ� ���� ���ڿ� ����
		for (int i=1; i<=N; i++) { // N���� ���� ���� ������ �Ѳ����� �о�´�
			tmp=br.readLine().split(" "); // �� ���� ��°�� �о�´�
			for (int j=1; j<=3; j++) { // R,G,B���� ������� �о�;� �ϱ� ������ 3���� �ݺ��� �ʿ��ϴ�
				color[i][j]=Integer.parseInt(tmp[j-1]); // ������ ���� ���ø� �ؼ� R,G,B�� int������ ����ȯ �Ŀ� ���� �ִ´�
			}
		}
		
		paintColor();
		System.out.println(minCost);
	
	}
	
	static void paintColor() { 
		
		for (int i=1; i<=N; i++) {
			if (i==1) { // �� ó�� ���� ���� ������ ������ �Է¹��� ���� ����
				for (int k=1; k<=3; k++) {
					calCost[i][k] = color[i][k];
				}
				continue; // �Ʒ� �ݺ����� �������� �ʰ� ���� i������ �Ѿ��
			}
			
			for (int j=1; j<=3; j++) {
				switch (j) {
					case 1:
						if (calCost[i-1][2]<=calCost[i-1][3])
							calCost[i][1]=calCost[i-1][2]+color[i][1];
						else 
							calCost[i][1]=calCost[i-1][3]+color[i][1];
						break;
						
					case 2:
						if (calCost[i-1][1]<=calCost[i-1][3])
							calCost[i][2]=calCost[i-1][1]+color[i][2];
						else 
							calCost[i][2]=calCost[i-1][3]+color[i][2];
						break;
						
					case 3:
						if (calCost[i-1][1]<=calCost[i-1][2])
							calCost[i][3]=calCost[i-1][1]+color[i][3];
						else 
							calCost[i][3]=calCost[i-1][2]+color[i][3];
						break;
				}
			}
		}
		
		minCost=calMin(calCost[N][1], calCost[N][2], calCost[N][3]);
	}
	
	static int calMin (int x, int y, int z) {
		int min=x;
		
		if (min>=y) {
			min=y;
		}
		
		if (min>=z) {
			min=z;
		}
		
		return min;
	}
	
}