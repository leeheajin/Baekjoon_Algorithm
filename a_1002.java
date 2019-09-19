// �������� ��ǥ (x1, y1)�� ���ȯ�� ��ǥ (x2, y2)�� �־�����, �������� ����� �������� �Ÿ� r1�� ���ȯ�� ����� �������� �Ÿ� r2�� �־����� ��, ������� ���� �� �ִ� ��ǥ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

package ����2;

import java.util.Scanner;

public class a_1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // test case
		
		int answer[] = new int[T];
		
		for (int i=0; i<T; i++) { // test case ��ŭ �ݺ��� ����
	
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			if (x1==x2 && y1==y2 && r1==r2) { // �ο��� ��ġ�� �ִ� ���
				answer[i]=-1; // ���Ѵ�� ����
			}
			
			else if (dist(x1,y1,x2,y2)>r1+r2) { // �ο��� ��ġ�� �ʴ� ��� 1) ���� �ۿ� ������ ��
				answer[i]=0; // ������ �������� ����
			}
			
			else if (Math.min(r1,r2)+dist(x1,y1,x2,y2)<Math.max(r1,r2)) { // �� ���� ��ġ�� �ʴ� ��� 2) �� ���� �ٸ� ���� ���ο� ���� ��
				answer[i]=0;
			}
			
			else if (dist(x1,y1,x2,y2)+Math.min(r1,r2)==Math.max(r1,r2)) { // �� ���� ������ �ϳ� ���� �� 1) �� ���� �ٸ� ���� ���ο� ���� ��
				answer[i]=1;
			}
			
			else if (r1+r2==dist(x1,y1,x2,y2)) { // �� ���� ������ �ϳ� ���� �� 2) �� ���� �� ���� �´��� ��
				answer[i]=1;
			}
			
			else // �� ���� �������� ������ ���  dist(x1,y1,x2,y2)<r1+r2
				answer[i]=2;
			
		}
		
		for (int i=0; i<T; i++)
			System.out.println(answer[i]);
	}
	
	public static double dist(int x1, int y1, int x2, int y2) { // �� �� (x1,y1), (x2,y2) ������ �Ÿ�
		return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
	}

}
