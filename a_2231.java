// 2231. �ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.

import java.util.*;

public class a_2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt(); // �̿��ڰ� �Է��� ����
		
		int sum = 0; // �������� ��Ÿ���� ����
		int num = 0; // ���� ��Ÿ���� ��
		
		for (int i=1; i<N; i++) {
			sum=i;
			num=i;
			
			while (num!=0) {
				sum += num%10;
				num = num/10;
			}
			
			if (sum==N) {
				System.out.println(i);
				return;
			}
			
		}
		System.out.println(0);
	}

}
