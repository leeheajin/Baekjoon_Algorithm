package 정렬;

import java.util.*;

public class a_1427 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner (System.in);
		long num = sc.nextLong();
		long a=num; // 몫
		int b=0; // 나머지
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		while(a!=0) { // 숫자를 모두 저장
			b=(int)(a%10);
			a=a/10; // 계속 나누어 감
			list.add(b);
		}
		
		Collections.sort(list); // * Collections.reverse() : 리스트의 구성을 반대로 뒤집음
		
		for (int i=list.size()-1; i>=0; i--) System.out.print(list.get(i));
		
	}

}
