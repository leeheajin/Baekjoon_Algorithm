// 이렇게 풀면 시간 초과가 뜹니다 ..... ㅠ_ㅠ_ㅠ_ㅠ_

import java.util.*;

public class Baekjoon1415 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int num[] = new int [N];
		
		for (int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		ArrayList<String> candy = new ArrayList<>(); // 가능한 모든 조합을 저장하는 리스트
		int count = 0; // 살 수 있는 경우를 체크하기 위한 변수
		candy.add(""); // 아무것도 없는 경우가 있어야지, 이후의 것들을 넣어서 순서대로 조합 생성 가능
		int candy_size = 1;
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<candy_size; j++) {
				String str = candy.get(j)+Integer.toString(num[i]);
				if (!candy.contains(str)) {
					candy.add(str);
				}
			}
			candy_size = candy.size(); // for문 안에서 조정하면 안쪽의 for문이 무한으로 반복되는 상황 발생
		}
		
		for (int i=1; i<candy.size(); i++) { // 아무것도 없는("")의 경우 이후부터 반복문 시행
			if (prime(string_to_sum(candy.get(i)))) count++;
		}
		
		System.out.println(count);
		
	}
	
	public static int string_to_sum(String str) { 
		
		int num = Integer.parseInt(str);

		int sum = 0;
		
		if (num == 1) {
			return num;
		}
		
		for (int i=str.length(); i>0; i--) {
			sum += num%10;
			num = num/10;
		}

		return sum;
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
