// 4153. ���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.

package ����2;

import java.util.*;

public class a_4153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList(); // �� �׽�Ʈ ���̽��� ���� �Էµ��� ����
		
		while (true) {
			int length = sc.nextInt();
			if (length==0) break;
			list.add(length);
		}
		
		int t = list.size()/3; // �� ���� �׽�Ʈ ���̽��� �����ϴ��� ����
		for (int i=0; i<t; i++) { // ������ �׽�Ʈ ���̽��� ���� ������ ����
			int a = (int)list.get(i*3); // ������ �ε��� ������ �ҷ���
			int b = (int)list.get(i*3+1);
			int c = (int)list.get(i*3+2);
			
			if (a>=b && a>=c) { // ���� �� ���� �׻� �� �ڿ� ������ ���� 1. a�� ���� �� ��
				int tmp = a;
				a = c;
				c = tmp;
			}
			else if (b>=a && b>=c) { // b�� ���� �� ��
				int tmp = b;
				b = c;
				c = tmp;
			}
			// c�� ���� �� ���� �״�� ����
			
			if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
				System.out.println("right");
			else 
				System.out.println("wrong");
			
			
		}

	}

}
