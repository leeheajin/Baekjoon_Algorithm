// 1436. 숌이 만든 N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램을 작성하시오. 숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.

import java.util.*;

public class Beakjoon1436 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int num = 666;
		int count = 1;
		
		while (count<N){
			num ++;
			String str = String.valueOf(num);
			if (str.contains("666")){
				count++;
			}
		}
		
		System.out.println(num);
	}

}
