// 10430. (A+B)%C는 (A%C + B%C)%C 와 같을까?
// (A×B)%C는 (A%C × B%C)%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

import java.util.*;

public class Baekjoon10430 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100-b%10)/10);
		System.out.println(a*(b/100));
		System.out.println(a*b);

	}

}
