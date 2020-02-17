// 1932. 삼각형이 존재할 때, 첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.

import java.io.*;

public class Baekjoon1932 {

	static int n;
	static int triangle[][];
	static int path[][];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n= Integer.parseInt(br.readLine());
		triangle = new int[n+1][n+1]; // 한 칸을 크게 만들어서 계산할 때 빈 곳(값이 존재하지 않는 부분)은 0 값으로 처리되게 해, 최대값에 접근하기 위해서는 무조건 값이 있는 곳을 선택하게 만든다
		path = new int[n+1][n+1];
		
		String tmp[]; // 한 줄을 통째로 읽어와 스플릿 하기 위한 문자열 변수
		for (int i=1; i<=n; i++) {
			tmp=br.readLine().split(" "); // 한 줄을 통째로 읽어온다
			for (int j=1; j<=i; j++) { // i번째 줄은 i개의 숫자로 이루어져 있다
				triangle[i][j]=Integer.parseInt(tmp[j-1]); // 각각의 값을 스플릿해서 int형으로 형변환 후에 집어 넣는다
			}
		}
		
		calPath();

	}
	
	
	static void calPath() {
		
		path[1][1]=triangle[1][1]; // 초기 값 설정
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
			if (max<=path[n][i]) // 더 작은 값이 존재할 경우 최소값을 바꾼다
				max=path[n][i];
		}
		
		System.out.println(max);
		
	}

}
