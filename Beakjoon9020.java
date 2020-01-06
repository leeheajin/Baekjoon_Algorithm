// 9020. 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

import java.util.*;

public class Beakjoon9020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // test case
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i=0; i<T; i++) { // T개의 수를 받아서 ArrayList에 저장
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
		
		for (int i=0; i<answer.size()/2; i++) { // 정답을 2개씩 나누어 출력
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
