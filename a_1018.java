// 1018. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

import java.util.*;

public class a_1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = N*M;
		char color;
		
		char NM[][] = new char [N][M];
		
		for (int i=0; i<N; i++) {
			String s = sc.next(); // String 타입으로 한 줄씩 입력 받음
			for (int j=0; j<M; j++) {
				NM[i][j] = s.charAt(j); // 이후 한 칸에 한 개의 char형태로 저장
			}
		}
		
		
		for (int i=0; i<=N-8; i++) {
			for (int j=0; j<=M-8; j++) {
				int count = 0;
				color = NM[i][j]; // 시작점(직사각형의 맨 왼쪽 윗 부분)의 컬러를 저장
				for (int x=i; x<i+8; x++) {
					for (int y=j; y<j+8; y++) {
						if ((i+j)%2==(x+y)%2) { // 행, 열의 합의 짝수 or 홀수로 구분 
							if (color!=NM[x][y]) { // 위의 수식의 값이 같은 경우에는 해당 체스 칸의 컬러도 같아야 함
								count ++;
							}
						}
						else { // 위의 수식의 값이 다른 경우에는 해당 체스 칸의 컬러도 반대의 색상이어야 함
							if (color==NM[x][y]) { // 해당 체스 판의 컬러가 같은 경우에는 바꾸어 칠하는 과정 필요
								count ++;
							}
						}
					}
				}
				if (count<=min) min = count; // 현재의 최소 값보다 작은 경우, 현재의 최소 값을 저장
				if (64-count<=min) min = 64-count; // 시작점의 컬러를 반대 컬러로 했을 경우의 값을 저장
			}
		}
		
		System.out.println(min);
	}

}
