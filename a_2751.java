// 2751. N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// Mergesort�� �̿��ؼ� ���� O(nlogn)

package ����;

import java.util.*;

public class a_2751 {
	
	static int sorted[] = new int[1000000];
	
    public static void main(String args[]) {
      
    	Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // ���� ����
		
		int list[] = new int[n];
		
		for (int i=0; i<n; i++) list[i]=sc.nextInt();
		
		mergeSort(list, 0, n-1);
		
		for (int i=0; i<n; i++) System.out.println(list[i]);
			
    }
    
    public static void merge(int list[], int start, int mid, int end) {
    
    	int count = start;
    	int st1 = start;
    	int st2 = mid+1;
    	
    	while (st1<=mid && st2<=end) { // �� �迭�� ������ �ݺ��� ����
    		if (list[st1]<=list[st2]) {
    			sorted[count]=list[st1];
    			st1++;
    		}
    		else {
    			sorted[count]=list[st2];
    			st2++;
    		}
    		count++;
    	}
    	
    	if (st1>mid) { // ���� �迭�� ��� �� ������ ���
    		for (int i=st2; i<=end; i++) {
    			sorted[count]=list[i];
    			count++;
    		}
    	}
    	
    	else {
    		for (int i=st1; i<=mid; i++) {
    			sorted[count]=list[i];
    			count++;
    		}
    	}

    	for (int i=start; i<=end; i++) {
    		list[i] = sorted[i];
    	}
    	
    }
    
    public static void mergeSort(int list[], int start, int end) {
    	
    	int mid = (start+end)/2; // �߰����� ����
    	if (start<end) {
    		mergeSort(list, start, mid);
    		mergeSort(list, mid+1, end);
    		merge(list, start, mid, end);
    	}
    }


}
