// 14889. �౸�� ����ְ� �ϱ� ���ؼ� ��ŸƮ ���� �ɷ�ġ�� ��ũ ���� �ɷ�ġ�� ���̸� �ּҷ� �Ϸ��� �Ѵ�. ���� ������ ���� ��쿡�� 1, 4���� ��ŸƮ ��, 2, 3�� ���� ��ũ ���� ���ϸ� ��ŸƮ ���� �ɷ�ġ�� 6, ��ũ ���� �ɷ�ġ�� 6�� �Ǿ ���̰� 0�� �ǰ� �� ���� �ּ��̴�.

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon14889 {

	static int N;
	static int[][] stat;
	static int diff_min = 10000;
	static int[] team;
	static int team0[], team1[];
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp;
		N = Integer.parseInt(br.readLine());
		stat = new int[N+1][N+1]; // ������� ���� �ó��� ���� ����
		team = new int[N+1]; // �ش� ����� ��� ���� ���ߴ°��� ����
		team0 = new int[N/2+1]; // 0�� ���� ���� ������� ���� : ������ ������ ����ϱ� ���� �ʿ�
		team1 = new int[N/2+1]; // 1�� ���� ���� ������� ����
		
		for (int i=1; i<=N; i++) { 
			temp = br.readLine().split(" ");
			for (int j=1; j<=N; j++) {
				stat[i][j]=Integer.parseInt(temp[j-1]);
			}
		}
		
		makeTeam(0,0);
		System.out.println(diff_min); // �̷��� ���� �ʰ� Collections.sort�� ��������� �ð� �ʰ��� �߻��ߴ�!!!
		
	}
	
	/* 0�� 1 �� ���� ������ ������
	 * �ʱ⿡�� ��� 0���� ���� �ִ�
	 * count�� 1���� ���� ����� ���� ���Ѵ�
	 * ������ 1������ �̵��� ��� �ɷ�ġ ���̸� ����ϰ� ��Ʈ��ŷ �� ��� �����Ѵ� 
	 * �� �� ������ �ּҰ��� ��� ���ŵȴ� */
	static void makeTeam(int count, int start) {

		if (count==N/2) { // ���� ��� �������� ���
			int diff=caldiff();
			if (diff<diff_min) diff_min=diff; // ���� �ּҰ����� �� ���� ��� ��ü�Ѵ�
			return;
		}
		
		for (int i=start+1; i<=N; i++) {
			if (team[i]==0) {
			team[i]=1; // �ش� ������ 1���� ��ġ�Ѵ�
			makeTeam(count+1, start+1);
			team[i]=0; // ��Ʈ��ŷ
			}
		}
		
	}
	
	static int caldiff() {  
		int team0_stat=0;
		int team1_stat=0;
		
		int index0=1, index1=1;

		for (int i=1; i<=N; i++) {
			if(team[i]==0) 
				team0[index0++]=i;
			
			else 
				team1[index1++]=i;
		}
		
		for(int i=1;i<=N/2-1;i++) {
			for(int j=i+1;j<=N/2;j++) {
				team0_stat += (stat[team0[i]][team0[j]]+stat[team0[j]][team0[i]]);
			}			
		}
		
		for(int i=1;i<=N/2-1;i++) {
			for(int j=i+1;j<=N/2;j++) { 
				team1_stat += (stat[team1[i]][team1[j]]+stat[team1[j]][team1[i]]);
			}			
		}
		
		int diff = Math.abs(team0_stat-team1_stat);
		if (diff==0) { // ���� ���̰� 0�� �Ǵ� �� �й谡 ���´ٸ� �� �̻� ���μ����� ������ �ʿ䰡 ����
			System.out.println(0);
			System.exit(0);
		}
		
		return diff;
	}

}
