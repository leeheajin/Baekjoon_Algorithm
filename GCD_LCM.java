package �Լ�;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int GCD (int a, int b) { // �ִ� �����
		
		int tmp1 = a, tmp2 = b;
		int r = 1;
		
		if(a<b){ // b�� Ŭ ��� ū���� a���� ����
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
	
	public static int LCM (int a, int b) { // �ּҰ����
		
		int tmp1 = a, tmp2 = b;
		int r = 1;
		int LCM;
		
		if(a<b){ // b�� Ŭ ��� ū���� a���� ����
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


