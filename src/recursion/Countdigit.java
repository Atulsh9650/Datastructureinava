package recursion;

public class Countdigit {

	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		int small=count(n/10);
		int ans=small+1;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ans=count(345);
 System.out.println(ans);
	}

}
