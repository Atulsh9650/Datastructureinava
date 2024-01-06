package recursion;

public class Geometricsum {
	public static double findGeometricSum(int k){
		if(k==0) {
			return 1;
		}
		double smallans=findGeometricSum(k-1);
		double ans=smallans+1/Math.pow(2,k);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double ans=findGeometricSum(4);
  System.out.println(ans);
	}

}
