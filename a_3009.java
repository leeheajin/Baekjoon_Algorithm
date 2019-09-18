// 3009. 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

package 수학2;

import java.util.Scanner;

public class a_3009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p1_x = sc.nextInt(); // p1(x,y)
		int p1_y = sc.nextInt();
		int p2_x = sc.nextInt(); // p2(x,y)
		int p2_y = sc.nextInt();
		int p3_x = sc.nextInt(); // p3(x,y)
		int p3_y = sc.nextInt();
		System.out.println(point(p1_x, p2_x, p3_x)+" "+point(p1_y,p2_y,p3_y));
	
	}
	
	public static int point(int p1, int p2, int p3) {
		
		if (p1==p2) return p3;
		else if (p1==p3) return p2;
		else return p1;
		
	}

}
