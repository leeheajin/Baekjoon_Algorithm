// 10430. (A+B)%C�� (A%C + B%C)%C �� ������?
// (A��B)%C�� (A%C �� B%C)%C �� ������?
// �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
