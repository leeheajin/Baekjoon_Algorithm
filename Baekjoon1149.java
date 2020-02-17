// 1149.각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠하는 비용의 최솟값을 구하는 프로그램을 작성하시오.

import java.io.*;

public class Baekjoon1149 {

	static int N;
	static int color[][];
	static int minCost;
	static int calCost[][];
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		color = new int [N+1][3+1]; // RGB 색칠 값을 저장, 각 칠하는 가격은 모두 1000보다 작거나 같다
		calCost = new int [N+1][3+1];
		
		String tmp[]; // 한 줄을 통째로 읽어와 스플릿 하기 위한 문자열 변수
		for (int i=1; i<=N; i++) { // N개의 집에 대한 가격을 한꺼번에 읽어온다
			tmp=br.readLine().split(" "); // 한 줄을 통째로 읽어온다
			for (int j=1; j<=3; j++) { // R,G,B값을 순서대로 읽어와야 하기 때문에 3번의 반복이 필요하다
				color[i][j]=Integer.parseInt(tmp[j-1]); // 각각의 값을 스플릿 해서 R,G,B에 int형으로 형변환 후에 집어 넣는다
			}
		}
		
		paintColor();
		System.out.println(minCost);
	
	}
	
	static void paintColor() { 
		
		for (int i=1; i<=N; i++) {
			if (i==1) { // 맨 처음 색상에 대한 가격은 기존에 입력받은 값과 같다
				for (int k=1; k<=3; k++) {
					calCost[i][k] = color[i][k];
				}
				continue; // 아래 반복문을 실행하지 않고 다음 i값으로 넘어간다
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