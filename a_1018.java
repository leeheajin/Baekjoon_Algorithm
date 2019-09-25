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
			String s = sc.next();
			for (int j=0; j<M; j++) {
				NM[i][j] = s.charAt(j);
			}
		}
		
		
		for (int i=0; i<=N-8; i++) {
			for (int j=0; j<=M-8; j++) {
				int count = 0;
				color = NM[i][j];
				for (int x=i; x<i+8; x++) {
					for (int y=j; y<j+8; y++) {
						if (i+j%2==x+y%2) {
							if (color!=NM[x][y]) {
								count ++;
							}
						}
						else {
							if (color==NM[x][y]) {
								count ++;
							}
						}
					}
				}
				if (count<=min) min = count;
				if (N*M-count<=min) min = N*M-count;
			}
		}
		
		System.out.println(min);
	}

}
