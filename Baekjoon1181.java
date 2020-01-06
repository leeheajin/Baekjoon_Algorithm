// 1181. ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.*;

public class Baekjoon1181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �ܾ��� ����
		sc.nextLine(); // ���๮�� ����
		
		HashSet<String> set = new HashSet<String>(); // �ߺ����� �������� �ʱ� ���� HashSet ���
		 		
		for(int i=0; i<N ; i++)
			set.add(sc.nextLine());
		 		
		ArrayList<String> list = new ArrayList<String>(set); // sort�� ����ϱ� ���� Collections(ArrayList)�� �ٲ�
		 	
		Collections.sort(list, new MyComparator());
		 		
		for (String s : list)  // ���ĵ� �迭�� ���
			System.out.println(s);

	}
	
}

class MyComparator implements Comparator<String> {
	
	@Override
	public int compare(String st1, String st2) {
		if(st1.length() > st2.length())
			return 1;
		else if(st1.length() < st2.length())
			return -1;
		else
			return st1.compareTo(st2);
	}
	
}