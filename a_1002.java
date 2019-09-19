// 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.

package 수학2;

import java.util.Scanner;

public class a_1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // test case
		
		int answer[] = new int[T];
		
		for (int i=0; i<T; i++) { // test case 만큼 반복해 수행
	
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			if (x1==x2 && y1==y2 && r1==r2) { // 두원이 겹치게 있는 경우
				answer[i]=-1; // 무한대로 존재
			}
			
			else if (dist(x1,y1,x2,y2)>r1+r2) { // 두원이 겹치지 않는 경우 1) 서로 밖에 존재할 때
				answer[i]=0; // 교점이 존재하지 않음
			}
			
			else if (Math.min(r1,r2)+dist(x1,y1,x2,y2)<Math.max(r1,r2)) { // 두 원이 겹치지 않는 경우 2) 한 원이 다른 원의 내부에 있을 때
				answer[i]=0;
			}
			
			else if (dist(x1,y1,x2,y2)+Math.min(r1,r2)==Math.max(r1,r2)) { // 두 원의 교점이 하나 있을 때 1) 한 원이 다른 원의 내부에 있을 때
				answer[i]=1;
			}
			
			else if (r1+r2==dist(x1,y1,x2,y2)) { // 두 원의 교점이 하나 있을 때 2) 두 원이 한 점만 맞닿을 때
				answer[i]=1;
			}
			
			else // 두 원이 두점에서 만나는 경우  dist(x1,y1,x2,y2)<r1+r2
				answer[i]=2;
			
		}
		
		for (int i=0; i<T; i++)
			System.out.println(answer[i]);
	}
	
	public static double dist(int x1, int y1, int x2, int y2) { // 두 점 (x1,y1), (x2,y2) 사이의 거리
		return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
	}

}
