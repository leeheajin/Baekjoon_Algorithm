// 3009. �� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.

package ����2;

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
