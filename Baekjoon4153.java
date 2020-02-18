// 4153. 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

import java.util.*;

public class Baekjoon4153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList(); // 각 테스트 케이스에 대한 입력들을 저장
		
		while (true) {
			int length = sc.nextInt();
			if (length==0) break;
			list.add(length);
		}
		
		int t = list.size()/3; // 몇 개의 테스트 케이스가 존재하는지 연산
		for (int i=0; i<t; i++) { // 각각의 테스트 케이스에 대해 연산을 진행
			int a = (int)list.get(i*3); // 각각의 인덱스 값들을 불러옴
			int b = (int)list.get(i*3+1);
			int c = (int)list.get(i*3+2);
			
			if (a>=b && a>=c) { // 제일 긴 변이 항상 맨 뒤에 오도록 조정 1. a가 가장 길 때
				int tmp = a;
				a = c;
				c = tmp;
			}
			else if (b>=a && b>=c) { // b가 가장 길 때
				int tmp = b;
				b = c;
				c = tmp;
			}
			// c가 가장 긴 경우는 그대로 유지
			
			if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
				System.out.println("right");
			else 
				System.out.println("wrong");
			
			
		}

	}

}
