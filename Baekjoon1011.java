import java.util.Scanner;

public class Baekjoon1011 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		int count[] = new int [t]; // 정답 카운트 변수
		
		for (int i=0;i<t;i++) { // 총 t번 각각의 케이스 수행
			int x = sc.nextInt(); // 현재 위치 x
			int y = sc.nextInt(); // 목표 위치 y, x < y
			int hop=0; // 현재 몇칸 이동
			count[i]=0;
			y = y-x;
			x = 0; // 시작 위치를 0으로 조정
			
			while (sum(hop+1)<=y-x-(hop+1)) {
				hop++;
				x += hop;
				count[i]++;
			}
			
			while (x!=y) {
				if (sum(hop)<=y-x-hop) {
					x += hop;
					count[i]++;
				}
				else {
					hop --;
				}
			}
		}
		
		for (int i=0; i<t; i++) 
			System.out.println(count[i]);
		
	}
	
	public static int sum(int a) {
		if (a==0||a==1) return 0;
		else return a*(a-1)/2;
	}
	
}
