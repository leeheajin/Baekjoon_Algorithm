package ����;

import java.util.*;

public class a_1427 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner (System.in);
		long num = sc.nextLong();
		long a=num; // ��
		int b=0; // ������
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		while(a!=0) { // ���ڸ� ��� ����
			b=(int)(a%10);
			a=a/10; // ��� ������ ��
			list.add(b);
		}
		
		Collections.sort(list); // * Collections.reverse() : ����Ʈ�� ������ �ݴ�� ������
		
		for (int i=list.size()-1; i>=0; i--) System.out.print(list.get(i));
		
	}

}
