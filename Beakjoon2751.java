// 2751. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
// Mergesort를 이용해서 구현 O(nlogn)

import java.util.*;

public class Beakjoon2751 {
	
	static int sorted[] = new int[1000000];
	
    public static void main(String args[]) {
      
    	Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // 수의 개수
		
		int list[] = new int[n];
		
		for (int i=0; i<n; i++) list[i]=sc.nextInt();
		
		mergeSort(list, 0, n-1);
		
		for (int i=0; i<n; i++) System.out.println(list[i]);
			
    }
    
    public static void merge(int list[], int start, int mid, int end) {
    
    	int count = start;
    	int st1 = start;
    	int st2 = mid+1;
    	
    	while (st1<=mid && st2<=end) { // 한 배열이 끝나면 반복문 종료
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
    	
    	if (st1>mid) { // 앞의 배열을 모두 다 소진한 경우
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
    	
    	int mid = (start+end)/2; // 중간점을 지정
    	if (start<end) {
    		mergeSort(list, start, mid);
    		mergeSort(list, mid+1, end);
    		merge(list, start, mid, end);
    	}
    }


}
