import java.util.Scanner;

public class a_10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		int room[] = new int [t]; 
		
		for (int i=0; i<t; i++) { // 1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W
			int h = sc.nextInt(); // 세로 
			int w = sc.nextInt(); // 가로
			int n = sc.nextInt(); // 손님 번호
			
			int a = 0; 
			int b = 0;
            
			if (n%h==0){
                a = h;
                b = n/h;
            }
            
            else {
                a = n%h;
                b = n/h + 1;
            }
            
			room[i] = 100*a+b;
		
		}
		
		for (int j=0; j<t; j++) System.out.println(room[j]);
	}

}
