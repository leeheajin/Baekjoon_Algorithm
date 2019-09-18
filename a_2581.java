// 2581. 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

package 수학2;

import java.util.*;

public class a_2581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		List list = new ArrayList();
		
		for (int i=M; i<=N; i++) {
			if (prime(i)) {
				list.add(i);
			}
		}
		
		if (list.size()==0) System.out.println(-1);
		else {
			int sum=0;
			for (int i=0; i<list.size(); i++) {
				sum += (int)list.get(i);
			}
			System.out.println(sum);
			System.out.println(list.get(0));
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
