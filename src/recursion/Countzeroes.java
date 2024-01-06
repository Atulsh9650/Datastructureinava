package recursion;

public class Countzeroes {
	public static int countZerosRec(int input){
		if(input==0) {
			return 1;
		}
		if(input<10) {
			return 0;
		}
		if(input%10==0) {
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ans=countZerosRec(01034);
 System.out.println(ans);
	}

}
