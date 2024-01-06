package recursion;

public class Multiplication {

	public static int multiplyTwoIntegers(int m, int n){
		if(n==1) {
			return m;
		}
		return m+multiplyTwoIntegers(m,n-1);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int ans=multiplyTwoIntegers(5,3);
    System.out.println(ans);
	}

}
