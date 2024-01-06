package recursion;

public class Power {
	
	public static int pow(int n,int p) {
		if(p==0) {
			return 1;
		}
		if(p==1) {
			return n;
		}
		return n*pow(n,p-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int ans=pow(2,5);
    System.out.println(ans);
	}

}
