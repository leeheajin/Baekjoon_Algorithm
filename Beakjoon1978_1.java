
import java.util.*; // Scanner, List

public class Beakjoon1978_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		int num [] = new int [t]; // t개의 수를 저장하기 위한 변수 선언
		
		int count = 0;
		
		for (int i=0; i<t; i++) { // 수를 받아서 저장
			num [i] = sc.nextInt();
		}
		
		for (int j=0; j<t; j++) {
			if (prime(num[j])) {
				count ++;
			}
		}

		System.out.println(count);
	
		
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
