package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class a_2108 {

	public static void main(String[] args) throws Exception { // 예외처리가 반드시 필요

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 
        int n = Integer.parseInt(br.readLine());
		
		int list[] = new int [n];
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		int maxFreq=1;
		int sum=0;
		
		for (int i=0; i<n; i++) { 
			int tmp = Integer.parseInt(br.readLine());
			list[i] = tmp;
			sum += tmp; // 산술 평균을 구하기 위해
			if(map.containsKey(tmp)) {
				    if(maxFreq < map.get(tmp)+1) maxFreq = map.get(tmp)+1;
				    map.put(tmp, map.get(tmp)+1);
			 }
			 else {
				    map.put(tmp, 1);
			}
		}
		
		Arrays.sort(list); // 해당 배열을 정렬
		
		System.out.println(Math.round((float)sum/n)); // 산술 평균
		
		System.out.println(list[n/2]); // 중앙값
		
		System.out.println(getFreq(map, maxFreq)); // 최빈값
		
		System.out.println(list[n-1]-list[0]); // 범위

    }
	
	static int getFreq(Map map, int maxFreq) {
		List<Integer> freq = new ArrayList<Integer>();
		List<Integer> tmp = new ArrayList<Integer>(map.keySet()); // 키 값들을 모두 tmp에 저장
		for (int i=0; i<tmp.size(); i++) {
			if ((int)map.get(tmp.get(i))==maxFreq) {
				freq.add(tmp.get(i));
			}
		}
		Collections.sort(freq); // 값들을 모두 정렬
		if (freq.size()==1)return freq.get(0); // 원소가 1개인 경우
		else return freq.get(1); // 원소가 2개 이상일 때
	}

}
