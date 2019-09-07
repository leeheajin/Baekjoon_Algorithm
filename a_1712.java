
import java.util.*;

public class a_1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x;
		
		if (c-b <= 0) {
			System.out.println(-1);
		}
		
		else {
		int val = (a/(c-b))+1;
		System.out.println(val);
		}
		
	}

}
