// 11650. 2���� ��� ���� �� N���� �־�����. ��ǥ�� x��ǥ�� �����ϴ� ������, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.*;

class Point implements Comparable<Point> {
	int x, y; // ����� �� ���� ����
	
	public Point(int x, int y) { // ��ü ������
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point point) {
		if (this.x>point.x) return 1; // ������ ���ϵ� ��� : ������ �ٲ�

		else if (this.x==point.x) {
				if (this.y>point.y) 
					return 1;
			}
		return -1; // 0�Ǵ� -1�� ���ϵ� ��� : ������ �ٲ��� ����
		}
	}
	
public class Baekjoon11650 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ������ ���� ����
		List<Point> list = new ArrayList<>();
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new Point(x, y));
		}
	
		Collections.sort(list);

		for (Point p : list)
			System.out.println(p.x+" "+p.y);
		
	}

}
