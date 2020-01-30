// 2580. 게임 시작 전 스도쿠 판에 쓰여 있는 숫자들의 정보가 주어질 때 모든 빈 칸이 채워진 최종 모습을 출력하는 프로그램을 작성하시오.

import java.util.*;
import java.io.*;

public class Baekjoon2580 {

	static int N = 9;
	static int stoc[][] = new int[N+1][N+1];
	static ArrayList<Point> zero = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp;
		for (int i=1; i<=N; i++) { 
			temp = br.readLine().split(" ");
			for (int j=1; j<=N; j++) {
				stoc[i][j]=Integer.parseInt(temp[j-1]);
				if (stoc[i][j ]==0)
					zero.add(new Point(i,j)); // 빈 칸(0)은 해당 리스트에 집어 넣는다
			}
		}
		makeStoc(0);
		
	}
	
	static boolean isPossible (int x, int y, int val) {
		
		for (int i=1; i<=N; i++) { // 열 내의 검사
			if (stoc[i][y]==val)
				return false;
		}
		
		for (int i=1; i<=N; i++) { // 행 내의 검사
			if (stoc[x][i]==val)
				return false;
		}
		
		for (int i=1+((x-1)/3)*3; i<=3+((x-1)/3)*3; i++) { // 큰 사각형 (3x3) 검사
			for (int j=1+((y-1)/3)*3; j<=3+((y-1)/3)*3; j++) {
				if (stoc[i][j]==val)
					return false;
			}
		}
		
		return true; // 위의 모든 검사를 통과 했을 경우 해당 숫자를 채워 넣을 수 있다
		
	}
	
	static void makeStoc (int i) {
		
		if (i==zero.size()) { // 스토쿠를 모두 채운 경우
			printStoc();
			System.exit(0); // 프로세스를 종료
		}
		
		int x = zero.get(i).x;
		int y = zero.get(i).y;
		
		for (int val=1; val<=N; val++) {
			if (isPossible(x,y,val)) {
				stoc[x][y]=val;
				makeStoc(i+1);
				stoc[x][y]=0; // 만약 해당 경우가 옳지 않은 경우, 백트래킹 할 때 이 값을 다시 0으로 초기화 시켜 빈칸으로 만든다
			}
		}
		
	}
	
	static void printStoc() {
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=N; j++) {
				System.out.print(stoc[i][j]+" ");
			}
			System.out.println();
		}
	}

}

class Point {
	int x,y;
	
	Point(int x, int y) { // 해당 클래스 생성자
		this.x=x;
		this.y=y;
	}
	
}
