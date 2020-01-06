// 1181. 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

import java.util.*;

public class Baekjoon1181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 단어의 개수
		sc.nextLine(); // 개행문자 삭제
		
		HashSet<String> set = new HashSet<String>(); // 중복값을 저장하지 않기 위해 HashSet 사용
		 		
		for(int i=0; i<N ; i++)
			set.add(sc.nextLine());
		 		
		ArrayList<String> list = new ArrayList<String>(set); // sort를 사용하기 위해 Collections(ArrayList)로 바꿈
		 	
		Collections.sort(list, new MyComparator());
		 		
		for (String s : list)  // 정렬된 배열을 출력
			System.out.println(s);

	}
	
}

class MyComparator implements Comparator<String> {
	
	@Override
	public int compare(String st1, String st2) {
		if(st1.length() > st2.length())
			return 1;
		else if(st1.length() < st2.length())
			return -1;
		else
			return st1.compareTo(st2);
	}
	
}