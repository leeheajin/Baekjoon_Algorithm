// �Ѽ��� ���� (x, y)�� �ִ�. ���簢���� ���� �Ʒ� �������� (0, 0)�� �ְ�, ������ �� �������� (w, h)�� �ִ�. ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

package ����2;

import java.util.Scanner;

public class a_1085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int min;
		
		if (x>=y) min = y;
		else min = x;
		
		w = w-x;
		h = h-y;
		
		if (w>=h) {
			if (min>=h) min = h;
		}
		else {
			if (min>=w) min = w;
		}
		
		System.out.println(min);
	}

}
