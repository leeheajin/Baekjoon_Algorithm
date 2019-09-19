package ����2;

import java.util.*;

public class a_1929_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Boolean> primeList;
		int M = sc.nextInt();
		int N = sc.nextInt();

		if(N <= 1) return;

		primeList = new ArrayList<Boolean>(N+1);
		primeList.add(false); // 0�� �Ҽ��� �ƴϴ�
		primeList.add(false); // 1�� �Ҽ��� �ƴϴ�
		
		for(int i=2; i<=N; i++) // ���� true�� ä�� �ְ� �Ҽ��� �ƴ� ������ ã�� false�� �ٲ�
			primeList.add(i, true);
		
		for(int i=2; (i*i)<=N; i++) { // 2 ����  ~ i*i <= N ���� ������ ������� ����
			if (primeList.get(i)) {
				for(int j = i*i; j<=N; j+=i) primeList.set(j, false); // �Ҽ��� �ƴ� ������ false�� �ٲ�
				/* i*i �̸��� �̹� ó���Ǿ����Ƿ� j�� ���۰��� i*i�� ����ȭ�� �� ����
				 ���� ��� 5�� ü�� �Ÿ� ������ �̹� �ռ�, 4*5�� 3*5�� ��� �ɷ����� */
			}
		}
		
		for (int i=M; i<=N; i++) {
			if (primeList.get(i)) System.out.println(i);
		}

	}

}
