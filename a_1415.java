// �̷��� Ǯ�� �ð� �ʰ��� ��ϴ� ..... ��_��_��_��_

import java.util.*;

public class a_1415 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int num[] = new int [N];
		
		for (int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		ArrayList<String> candy = new ArrayList<>(); // ������ ��� ������ �����ϴ� ����Ʈ
		int count = 0; // �� �� �ִ� ��츦 üũ�ϱ� ���� ����
		candy.add(""); // �ƹ��͵� ���� ��찡 �־����, ������ �͵��� �־ ������� ���� ���� ����
		int candy_size = 1;
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<candy_size; j++) {
				String str = candy.get(j)+Integer.toString(num[i]);
				if (!candy.contains(str)) {
					candy.add(str);
				}
			}
			candy_size = candy.size(); // for�� �ȿ��� �����ϸ� ������ for���� �������� �ݺ��Ǵ� ��Ȳ �߻�
		}
		
		for (int i=1; i<candy.size(); i++) { // �ƹ��͵� ����("")�� ��� ���ĺ��� �ݺ��� ����
			if (prime(string_to_sum(candy.get(i)))) count++;
		}
		
		System.out.println(count);
		
	}
	
	public static int string_to_sum(String str) { 
		
		int num = Integer.parseInt(str);

		int sum = 0;
		
		if (num == 1) {
			return num;
		}
		
		for (int i=str.length(); i>0; i--) {
			sum += num%10;
			num = num/10;
		}

		return sum;
	}
	
	public static boolean prime (int num) {
		
		boolean isPrime = true;
		int sqrt = (int)Math.sqrt(num);

		if (num==1) {
			return false;
		}
		
		for (int i=2; i<=sqrt; i++) {
			if (num%i==0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
		
	}

}
