// 2580. ���� ���� �� ������ �ǿ� ���� �ִ� ���ڵ��� ������ �־��� �� ��� �� ĭ�� ä���� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
					zero.add(new Point(i,j)); // �� ĭ(0)�� �ش� ����Ʈ�� ���� �ִ´�
			}
		}
		makeStoc(0);
		
	}
	
	static boolean isPossible (int x, int y, int val) {
		
		for (int i=1; i<=N; i++) { // �� ���� �˻�
			if (stoc[i][y]==val)
				return false;
		}
		
		for (int i=1; i<=N; i++) { // �� ���� �˻�
			if (stoc[x][i]==val)
				return false;
		}
		
		for (int i=1+((x-1)/3)*3; i<=3+((x-1)/3)*3; i++) { // ū �簢�� (3x3) �˻�
			for (int j=1+((y-1)/3)*3; j<=3+((y-1)/3)*3; j++) {
				if (stoc[i][j]==val)
					return false;
			}
		}
		
		return true; // ���� ��� �˻縦 ��� ���� ��� �ش� ���ڸ� ä�� ���� �� �ִ�
		
	}
	
	static void makeStoc (int i) {
		
		if (i==zero.size()) { // ������ ��� ä�� ���
			printStoc();
			System.exit(0); // ���μ����� ����
		}
		
		int x = zero.get(i).x;
		int y = zero.get(i).y;
		
		for (int val=1; val<=N; val++) {
			if (isPossible(x,y,val)) {
				stoc[x][y]=val;
				makeStoc(i+1);
				stoc[x][y]=0; // ���� �ش� ��찡 ���� ���� ���, ��Ʈ��ŷ �� �� �� ���� �ٽ� 0���� �ʱ�ȭ ���� ��ĭ���� �����
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
	
	Point(int x, int y) { // �ش� Ŭ���� ������
		this.x=x;
		this.y=y;
	}
	
}
