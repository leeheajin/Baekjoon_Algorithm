import java.util.Scanner;

public class a_1011 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test case
		int count[] = new int [t]; // ���� ī��Ʈ ����
		
		for (int i=0;i<t;i++) { // �� t�� ������ ���̽� ����
			int x = sc.nextInt(); // ���� ��ġ x
			int y = sc.nextInt(); // ��ǥ ��ġ y, x < y
			int hop=0; // ���� ��ĭ �̵�
			count[i]=0;
			y = y-x;
			x = 0; // ���� ��ġ�� 0���� ����
			
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
