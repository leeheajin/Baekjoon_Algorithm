// 11650. 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
// n^2 시간복잡도를 갖는 방법을 사용할 경우 시간 초과가 뜨기 때문에, 시간 복잡도가 nlogn인 mergeSort 방법을 사용했다

import java.util.*;

public class a_11650 {
	
	static int N;
	static int sorted[][];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // number of point
		int point[][] = new int [N][2];
		sorted = new int [N][2];
		for (int i=0; i<N; i++) { 
			point[i][0]=sc.nextInt();
			point[i][1]=sc.nextInt();
		}
		
		mergeSort(point, 0, N-1);
	
		for (int i=0; i<N; i++) {
			System.out.println(sorted[i][0]+" "+sorted[i][1]);
		}
		
	}
	
	
	public static void merge(int list[][], int start, int mid, int end) {
	    
    	int count = start;
    	int st1 = start;
    	int st2 = mid+1;
    	
    	while (st1<=mid && st2<=end) { // 한 배열이 끝나면 반복문 종료
    		if (list[st1][0]<list[st2][0]) { // x1 < x2
	    		sorted[count][0]=list[st1][0];
	    		sorted[count][1]=list[st1][1];
    			st1++;
    		}
    		
    		else if (list[st1][0]==list[st2][0]) { // x1 == x2
    			if (list[st1][1]<list[st2][1]) {
    				sorted[count][0]=list[st1][0];
    				sorted[count][1]=list[st1][1];
    				st1++;
    			}
    			else { // list[st1][1]>list[st2][1]
    				sorted[count][0]=list[st2][0];
    				sorted[count][1]=list[st2][1];
    				st2++;
    			}
    		}
    		
    		else { // list[st1][0]>list[st2][0] : x1 > x2
    			sorted[count][0]=list[st2][0];
	    		sorted[count][1]=list[st2][1];
    			st2++;
    		}
    		count++;
    	}
    	
    	if (st1>mid) { // 앞의 배열을 모두 다 소진한 경우
    		for (int i=st2; i<=end; i++) {
    			sorted[count][0]=list[i][0];
    			sorted[count][1]=list[i][1];
    			count++;
    		}
    	}
    	
    	else {
    		for (int i=st1; i<=mid; i++) {
    			sorted[count][0]=list[i][0];
    			sorted[count][1]=list[i][1];
    			count++;
    		}
    	}
    	
    	for (int i=start; i<=end; i++) {
    		list[i][0]=sorted[i][0];
    		list[i][1]=sorted[i][1];
    	}

    }
    
	
    public static void mergeSort(int list[][], int start, int end) {
    	
    	int mid = (start+end)/2; // 중간점을 지정
    	if (start<end) {
    		mergeSort(list, start, mid);
    		mergeSort(list, mid+1, end);
    		merge(list, start, mid, end);
    	}
    	
    }
	
}
