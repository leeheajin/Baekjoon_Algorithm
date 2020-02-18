// 6064. 네 개의 정수 M, N, x와 y가 주어질 때, <M:N>이 카잉 달력의 마지막 해라고 하면 <x:y>는 몇 번째 해를 나타내는지 구하는 프로그램을 작성하라. 

import java.util.Scanner;

public class Baekjoon6064 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		int count [] = new int [t]; 
		
		for (int i=0; i<t; i++) { // 1 ≤ M, N ≤ 40,000, 1 ≤ x ≤ M, 1 ≤ y ≤ N
			int m = sc.nextInt(); 
			int n = sc.nextInt();
			int x = sc.nextInt(); // <x, y>
			int y = sc.nextInt();
			
			if (m>n) { // 큰 수가 뒤로 이동해야 함
				int tmp = m;
				m = n;
				n = tmp;
				tmp = x;
				x = y;
				y = tmp;
			}
			
			int c_x = x;
			int c_y = x;
			count[i] = x;
			
			while (c_y!=y) {
				c_y = (c_y+m)%n;
				if (c_y==0) c_y = n;
				count[i]+=m;
				
				if (count[i]>=LCM(m,n)) {
					count[i]=-1;
					break;
				}
			}
			
		}
		
		for (int i=0; i<t; i++) System.out.println(count[i]);

	}

	public static int LCM (int a, int b) { // 최소공배수
		
		int tmp1 = a, tmp2 = b;
		int r = 1;
		int LCM;
		
		if(a<b){ // b가 클 경우 큰수를 a으로 변경
			a = tmp2;
			b = tmp1;
	         }
	 
		while (r>0) {
			r = a % b;
			a = b;
			b = r;
		}
	        LCM = tmp1* tmp2/a; 
	        return LCM;
	        
	}

}
