// 7568. �������� �л� N���� �����Կ� Ű�� ��� �Է��� �о �� ����� ��ġ ����� ����Ͽ� ����ؾ� �Ѵ�.

import java.util.*;

public class a_7568 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int weight[] = new int [N];
		int height[] = new int [N];
		int rank[] = new int [N];
		
		for (int i=0; i<N; i++) { // N���� �����Կ� Ű�� �Է� ����
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
			rank[i] = 1; // ������ ���� 1�� �ʱ�ȭ
		}
		
		for (int i=0; i<N-1; i++) { // ��� ��쿡 ���� ������� ��
			for (int j=i+1; j<N; j++) {
				if (weight[i]>weight[j]) {
					if (height[i]>height[j]) { // i�� j���� Ȯ���� ��ġ�� ū ���
						rank[j]++;
					}
				}
				
				else if (weight[i]<weight[j]) {
					if (height[i]<height[j]) {
						rank[i]++;
					}
				}
			}
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(rank[i]+" ");
		}
		
	}

}
