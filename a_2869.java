import java.util.Scanner;

public class a_2869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // A미터 올라감  (1 ≤ B < A ≤ V ≤ 1,000,000,000)
		int b = sc.nextInt(); // B미터 내려감
		int v = sc.nextInt(); // 막대의 높이
	
		if ((v-b)%(a-b)==0) {
			System.out.println((v-a)/(a-b)+1);
		}
		
		else {
			System.out.println((v-a)/(a-b)+2);
		}
	
	}

}
