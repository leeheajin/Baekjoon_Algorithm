import java.util.Scanner;

public class a_2775 {

	static int memo[][] = new int [15][15];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		
		int people[] = new int [t]; 
		
		for (int i=0;i<t;i++) { // 총 t번 각각의 케이스 수행
			int k = sc.nextInt(); // 층
			int n = sc.nextInt(); // 호
			people[i] = sum(k,n);
		}
		
		for (int i=0; i<t; i++) System.out.println(people[i]);
	}
	
	public static int sum (int a, int b) { // a층 b호
		
		if (memo[a][b]==0) { // 해당 값을 계산해야 하는 경우
			if (a==0) { // 맨 아래 층일 때
				memo[a][b]=b;
			}
			else {
				if (b!=1) memo[a][b]=sum(a,b-1)+sum(a-1,b);
				else memo[a][b]=1;
			}
		}

		return memo[a][b];
			
	}

}
