// 2798. N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.

import java.util.*;

public class a_2798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int bestsum = 0; // ���� ������ ��
		int sum = 0; // �� ī���� ��
		int card[] = new int[N]; // N���� ī�带 ����
		
		for (int i=0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		
		for (int i=0; i<N-2; i++) {
			
			for (int j=i+1; j<N-1; j++) {
				
				for (int k=j+1; k<N; k++) {
					
					sum = card[i]+card[j]+card[k];
					
					if (M-bestsum>M-sum && sum<=M) { // ������ ���� �� ������ ��
						bestsum = sum;
					}
					
					if (M-bestsum==0) { // ������ �ض�� Ȯ���� �� �ִ� ���
						System.out.println(bestsum);
						return;
					}
				
				}
				
			}
			
		}
		
		System.out.println(bestsum);
		
	}

}
