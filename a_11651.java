// 11651. 2���� ��� ���� �� N���� �־�����. ��ǥ�� y��ǥ�� �����ϴ� ������, y��ǥ�� ������ x��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class a_11651 {
	
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
    	
    	while (st1<=mid && st2<=end) { // �� �迭�� ������ �ݺ��� ����
    		if (list[st1][1]<list[st2][1]) { // y1 < y2
	    		sorted[count][0]=list[st1][0];
	    		sorted[count][1]=list[st1][1];
    			st1++;
    		}
    		
    		else if (list[st1][1]==list[st2][1]) { // y1 == y2
    			if (list[st1][0]<list[st2][0]) { // x1 < x2
    				sorted[count][0]=list[st1][0];
    				sorted[count][1]=list[st1][1];
    				st1++;
    			}
    			else { // list[st1][0]>list[st2][0] : x1 > x2
    				sorted[count][0]=list[st2][0];
    				sorted[count][1]=list[st2][1];
    				st2++;
    			}
    		}
    		
    		else { // list[st1][0]>list[st2][0] : y1 > y2
    			sorted[count][0]=list[st2][0];
	    		sorted[count][1]=list[st2][1];
    			st2++;
    		}
    		count++;
    	}
    	
    	if (st1>mid) { // ���� �迭�� ��� �� ������ ���
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
    	
    	int mid = (start+end)/2; // �߰����� ����
    	if (start<end) {
    		mergeSort(list, start, mid);
    		mergeSort(list, mid+1, end);
    		merge(list, start, mid, end);
    	}
    	
    }
	
}
