// 2750. N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

package ����;

import java.util.*;

public class a_2750 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // ���� ����
		
		int list[] = new int[n];
		
		for (int i=0; i<n; i++) list[i]=sc.nextInt();
			
		for (int i=0; i<n-1; i++) {
			int min = 1001;
			int num = i; // �� ��° �ڸ��� ���� ���� ������ ����
			
			for (int j=i; j<n; j++) {				
				if (list[j]<=min) {
					min = list[j];
					num = j;
				}
			}
			
			int tmp = list[i];
			list[i] = min;
			list[num] = tmp;
		}
		
		for (int i=0; i<n; i++) System.out.println(list[i]);
	}

}
