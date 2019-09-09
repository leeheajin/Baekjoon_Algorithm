import java.util.Scanner;

public class a_2775 {

	static int memo[][] = new int [15][15];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		
		int people[] = new int [t]; 
		
		for (int i=0;i<t;i++) { // �� t�� ������ ���̽� ����
			int k = sc.nextInt(); // ��
			int n = sc.nextInt(); // ȣ
			people[i] = sum(k,n);
		}
		
		for (int i=0; i<t; i++) System.out.println(people[i]);
	}
	
	public static int sum (int a, int b) { // a�� bȣ
		
		if (memo[a][b]==0) { // �ش� ���� ����ؾ� �ϴ� ���
			if (a==0) { // �� �Ʒ� ���� ��
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
