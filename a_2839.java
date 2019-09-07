
import java.util.*;

public class a_2839 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3 <= n <= 5000
		
		int answer = 10000;
		
		for (int x=0;x<=5000/5;x++) {
			for (int y=0;y<=5000/3;y++) {
				if (n==5*x+3*y) {
					if (answer>x+y) answer=x+y;
				}
			}
		}
		
		
		if (answer == 10000) {
			System.out.println(-1); // 정확하게 배달할 수 없음
		}
		
		else {
			System.out.println(answer);
		}
	}

}
