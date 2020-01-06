// 11650. 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

import java.util.*;

class Point implements Comparable<Point> {
	int x, y; // 평면의 두 점을 저장
	
	public Point(int x, int y) { // 객체 생성자
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point point) {
		if (this.x>point.x) return 1; // 음수가 리턴될 경우 : 순서를 바꿈

		else if (this.x==point.x) {
				if (this.y>point.y) 
					return 1;
			}
		return -1; // 0또는 -1이 리턴될 경우 : 순서를 바꾸지 않음
		}
	}
	
public class Baekjoon11650 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 저장할 점의 개수
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
