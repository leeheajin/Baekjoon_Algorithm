// 14888. N���� ���� N-1���� �����ڰ� �־����� ��, ���� �� �ִ� ���� ����� �ִ��� �Ͱ� �ּ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.*;

public class Baekjoon14888 {

	static int N;
	static int num[];
	static int op[]; // +, -, x, �� ������ ������ ����
	static int pick[];
	static ArrayList<Integer> list;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		N = sc.nextInt();
		num = new int[N]; // N���� ���� �̷���� ����
		op = new int[4]; // 4���� �����ڸ� ������� ����
		pick = new int[N-1]; // �迭�� �����ڸ� ������� ����
		list = new ArrayList<>(); // ��� ��� ����� ����
		
		for (int i=0; i<N; i++) {
			num[i]=sc.nextInt();
		}
		
		for (int i=0; i<4; i++) {
			op[i]=sc.nextInt();
		}
		
		dfs(0);

		Collections.sort(list); // �ش� ArrayList�� �������� ����
		System.out.println(list.get(list.size()-1)); // �ִ밪 ���
		System.out.println(list.get(0)); // �ּҰ� ���
	}
	
	static void dfs (int opCount) {
		if (opCount==N-1) {
			list.add(cal());
		}
		
		for (int i=0; i<4; i++) {
			if(op[i]==0) continue; // �ش� �����ڰ� ���� ���� ���� ���
			op[i]--;
			pick[opCount]=i; // � �����ڸ� ����� ������ ����
			dfs(opCount+1);
			op[i]++;
			pick[opCount]=-1; // �ش� �迭�� �����ڸ� ���� (��Ʈ��ŷ)
		}
	}
	
	static int cal () {
		int result=num[0];
		for (int i=0; i<N-1; i++) {
			if (pick[i]==0) {
				result += num[i+1];
			}
			else if (pick[i]==1) {
				result -= num[i+1];
			}
			else if (pick[i]==2) {
				result *= num[i+1];
			}
			else if (pick[i]==3) {
				result /= num[i+1];
			}
		}
		return result;
	}

}
