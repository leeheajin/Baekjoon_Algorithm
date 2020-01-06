
public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int GCD (int a, int b) { // 최대 공약수
		
		int tmp1 = a, tmp2 = b;
		int r = 1;
		
		if(a<b){ // b가 클 경우 큰수를 a으로 변경
			a = tmp2;
			b = tmp1;
	         }
	 
		while (r>0) {
			r = a % b;
			a = b;
			b = r;
		}
	        return a;
	        
	}
	
	public static int LCM (int a, int b) { // 최소공배수
		
		int tmp1 = a, tmp2 = b;
		int r = 1;
		int LCM;
		
		if(a<b){ // b가 클 경우 큰수를 a으로 변경
			a = tmp2;
			b = tmp1;
	         }
	 
		while (r>0) {
			r = a % b;
			a = b;
			b = r;
		}
	        LCM = tmp1* tmp2/a; 
	        return LCM;
	        
	}
	
}


