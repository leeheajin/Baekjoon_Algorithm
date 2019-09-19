// 9020. 2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ������ n�� ������ ��Ƽ���� ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.

package ����2;

import java.util.*;

public class a_9020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // test case
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i=0; i<T; i++) { // T���� ���� �޾Ƽ� ArrayList�� ����
			list.add(sc.nextInt()); 
		}
		
		for (int i=0; i<T; i++) {
			int num = list.get(i)/2;
			for (int j=num; j>=2; j--) {
				if (prime(j)) {
					if (prime(list.get(i)-j)) {
						answer.add(j);
						answer.add(list.get(i)-j);
						break;
					}
				}
			}
		}
		
		for (int i=0; i<answer.size()/2; i++) { // ������ 2���� ������ ���
			System.out.println(answer.get(2*i)+" "+answer.get(2*i+1));
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
