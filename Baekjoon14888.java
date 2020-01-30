// 14888. N개의 수와 N-1개의 연산자가 주어졌을 때, 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.

import java.util.*;

public class Baekjoon14888 {

	static int N;
	static int num[];
	static int op[]; // +, -, x, ÷ 순서로 연산자 저장
	static int pick[];
	static ArrayList<Integer> list;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		N = sc.nextInt();
		num = new int[N]; // N개의 수로 이루어진 수열
		op = new int[4]; // 4개의 연산자를 순서대로 저장
		pick = new int[N-1]; // 배열한 연산자를 순서대로 저장
		list = new ArrayList<>(); // 모든 계산 결과를 저장
		
		for (int i=0; i<N; i++) {
			num[i]=sc.nextInt();
		}
		
		for (int i=0; i<4; i++) {
			op[i]=sc.nextInt();
		}
		
		dfs(0);

		Collections.sort(list); // 해당 ArrayList를 오름차순 정렬
		System.out.println(list.get(list.size()-1)); // 최대값 출력
		System.out.println(list.get(0)); // 최소값 출력
	}
	
	static void dfs (int opCount) {
		if (opCount==N-1) {
			list.add(cal());
		}
		
		for (int i=0; i<4; i++) {
			if(op[i]==0) continue; // 해당 연산자가 남아 있지 않은 경우
			op[i]--;
			pick[opCount]=i; // 어떤 연산자를 사용할 것인지 저장
			dfs(opCount+1);
			op[i]++;
			pick[opCount]=-1; // 해당 배열의 연산자를 삭제 (백트래킹)
		}
	}
	
	static int cal () {
		int result=num[0];
		for (int i=0; i<N-1; i++) {
			if (pick[i]==0) {
				result += num[i+1];
			}
			else if (pick[i]==1) {
				result -= num[i+1];
			}
			else if (pick[i]==2) {
				result *= num[i+1];
			}
			else if (pick[i]==3) {
				result /= num[i+1];
			}
		}
		return result;
	}

}
