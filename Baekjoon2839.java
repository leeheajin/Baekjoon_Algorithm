
import java.util.*;

public class Baekjoon2839 {

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
			System.out.println(-1); // Á¤È®ÇÏ°Ô ¹è´ÞÇÒ ¼ö ¾øÀ½
		}
		
		else {
			System.out.println(answer);
		}
	}

}
