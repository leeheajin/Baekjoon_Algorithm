// 6064. �� ���� ���� M, N, x�� y�� �־��� ��, <M:N>�� ī�� �޷��� ������ �ض�� �ϸ� <x:y>�� �� ��° �ظ� ��Ÿ������ ���ϴ� ���α׷��� �ۼ��϶�. 

import java.util.Scanner;

public class a_6064 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		int count [] = new int [t]; 
		
		for (int i=0; i<t; i++) { // 1 �� M, N �� 40,000, 1 �� x �� M, 1 �� y �� N
			int m = sc.nextInt(); 
			int n = sc.nextInt();
			int x = sc.nextInt(); // <x, y>
			int y = sc.nextInt();
			
			if (m>n) { // ū ���� �ڷ� �̵��ؾ� ��
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

	public static int LCM (int a, int b) { // �ּҰ����
		
		int tmp1 = a, tmp2 = b;
		int r = 1;
		int LCM;
		
		if(a<b){ // b�� Ŭ ��� ū���� a���� ����
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
