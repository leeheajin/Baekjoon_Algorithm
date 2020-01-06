// n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 


import java.util.*;

public class Beakjoon1948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		
		while (true) { // 테스트 케이스에 대한 값들을 계속해서 받음
			n=sc.nextInt();
			if (n==0) break; // 0이 들어오면 더이상 값들을 받지 않음
			list.add(n);
		}
		
		for (int i=0; i<list.size(); i++) { // 결과 값을 구해서 저장
			int count=0;
			for (int j=list.get(i)+1; j<=2*list.get(i); j++) {
				if (prime(j)) count++;
			}
			answer.add(count);
		}
		
		for (int i=0; i<answer.size(); i++) { // 결과 값들을 출력
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
