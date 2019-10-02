package ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class a_2108 {

	public static void main(String[] args) throws Exception { // ����ó���� �ݵ�� �ʿ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 
        int n = Integer.parseInt(br.readLine());
		
		int list[] = new int [n];
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		int maxFreq=1;
		int sum=0;
		
		for (int i=0; i<n; i++) { 
			int tmp = Integer.parseInt(br.readLine());
			list[i] = tmp;
			sum += tmp; // ��� ����� ���ϱ� ����
			if(map.containsKey(tmp)) {
				    if(maxFreq < map.get(tmp)+1) maxFreq = map.get(tmp)+1;
				    map.put(tmp, map.get(tmp)+1);
			 }
			 else {
				    map.put(tmp, 1);
			}
		}
		
		Arrays.sort(list); // �ش� �迭�� ����
		
		System.out.println(Math.round((float)sum/n)); // ��� ���
		
		System.out.println(list[n/2]); // �߾Ӱ�
		
		System.out.println(getFreq(map, maxFreq)); // �ֺ�
		
		System.out.println(list[n-1]-list[0]); // ����

    }
	
	static int getFreq(Map map, int maxFreq) {
		List<Integer> freq = new ArrayList<Integer>();
		List<Integer> tmp = new ArrayList<Integer>(map.keySet()); // Ű ������ ��� tmp�� ����
		for (int i=0; i<tmp.size(); i++) {
			if ((int)map.get(tmp.get(i))==maxFreq) {
				freq.add(tmp.get(i));
			}
		}
		Collections.sort(freq); // ������ ��� ����
		if (freq.size()==1)return freq.get(0); // ���Ұ� 1���� ���
		else return freq.get(1); // ���Ұ� 2�� �̻��� ��
	}

}
