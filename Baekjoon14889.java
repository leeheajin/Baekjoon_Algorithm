// 14889. 축구를 재미있게 하기 위해서 스타트 팀의 능력치와 링크 팀의 능력치의 차이를 최소로 하려고 한다. 위의 예제와 같은 경우에는 1, 4번이 스타트 팀, 2, 3번 팀이 링크 팀에 속하면 스타트 팀의 능력치는 6, 링크 팀의 능력치는 6이 되어서 차이가 0이 되고 이 값이 최소이다.

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
		stat = new int[N+1][N+1]; // 사람들의 스탯 시너지 값을 저장
		team = new int[N+1]; // 해당 사람이 어느 팀에 속했는가를 저장
		team0 = new int[N/2+1]; // 0번 팀에 속한 사람들의 묶음 : 빠르게 조합을 계산하기 위해 필요
		team1 = new int[N/2+1]; // 1번 팀에 속한 사람들의 묶음
		
		for (int i=1; i<=N; i++) { 
			temp = br.readLine().split(" ");
			for (int j=1; j<=N; j++) {
				stat[i][j]=Integer.parseInt(temp[j-1]);
			}
		}
		
		makeTeam(0,0);
		System.out.println(diff_min); // 이렇게 하지 않고 Collections.sort를 사용헀더니 시간 초과가 발생했다!!!
		
	}
	
	/* 0과 1 두 개의 팀으로 나눈다
	 * 초기에는 모두 0팀에 속해 있다
	 * count는 1팀에 속한 사람의 수를 뜻한다
	 * 절반이 1팀으로 이동할 경우 능력치 차이를 계산하고 백트래킹 해 계속 수행한다 
	 * 이 때 차이의 최소값은 계속 갱신된다 */
	static void makeTeam(int count, int start) {

		if (count==N/2) { // 팀이 모두 나누어진 경우
			int diff=caldiff();
			if (diff<diff_min) diff_min=diff; // 현재 최소값보다 더 작을 경우 교체한다
			return;
		}
		
		for (int i=start+1; i<=N; i++) {
			if (team[i]==0) {
			team[i]=1; // 해당 팀원을 1팀에 배치한다
			makeTeam(count+1, start+1);
			team[i]=0; // 백트래킹
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
		if (diff==0) { // 만약 차이가 0이 되는 팀 분배가 나온다면 더 이상 프로세스를 수행할 필요가 없다
			System.out.println(0);
			System.exit(0);
		}
		
		return diff;
	}

}
