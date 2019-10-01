// 2750. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

package 정렬;

import java.util.*;

public class a_2750 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // 수의 개수
		
		int list[] = new int[n];
		
		for (int i=0; i<n; i++) list[i]=sc.nextInt();
			
		for (int i=0; i<n-1; i++) {
			int min = 1001;
			int num = i; // 몇 번째 자리의 수가 제일 작은지 저장
			
			for (int j=i; j<n; j++) {				
				if (list[j]<=min) {
					min = list[j];
					num = j;
				}
			}
			
			int tmp = list[i];
			list[i] = min;
			list[num] = tmp;
		}
		
		for (int i=0; i<n; i++) System.out.println(list[i]);
	}

}
