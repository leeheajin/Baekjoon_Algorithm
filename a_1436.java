// 1436. ���� ���� N��° ��ȭ�� ���� �� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� �� �ø�� �׻� ���ʴ�� �����, �ٸ� ��ȭ�� ������ �ʴ´�.

import java.util.*;

public class a_1436 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int num = 666;
		int count = 1;
		
		while (count<N){
			num ++;
			String str = String.valueOf(num);
			if (str.contains("666")){
				count++;
			}
		}
		
		System.out.println(num);
	}

}
