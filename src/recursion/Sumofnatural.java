package recursion;

public class Sumofnatural {
	
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ans=sum(3);
 System.out.println(ans);
 
	}

}
