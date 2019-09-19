// n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 

package ����2;

import java.util.*;

public class a_1948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		
		while (true) { // �׽�Ʈ ���̽��� ���� ������ ����ؼ� ����
			n=sc.nextInt();
			if (n==0) break; // 0�� ������ ���̻� ������ ���� ����
			list.add(n);
		}
		
		for (int i=0; i<list.size(); i++) { // ��� ���� ���ؼ� ����
			int count=0;
			for (int j=list.get(i)+1; j<=2*list.get(i); j++) {
				if (prime(j)) count++;
			}
			answer.add(count);
		}
		
		for (int i=0; i<answer.size(); i++) { // ��� ������ ���
			System.out.println(answer.get(i));
		}
		
	}
	
	public static boolean prime (int num) {
			
			boolean isPrime = true;
			int sqrt = (int)Math.sqrt(num);
	
			if (num==1) {
				return false;
			}
			
			for (int i=2; i<=sqrt; i++) {
				if (num%i==0) {
					isPrime = false;
					break;
				}
			}
			
			return isPrime;
			
	}

}
