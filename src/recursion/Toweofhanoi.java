package recursion;

public class Toweofhanoi {

	public static void hanoi(int n,char s,char h,char d) {
		if(n==1) {
			System.out.println("move 1st disk from "+s+" to "+d);
         return;
		}
		hanoi(n-1,s,d,h);
		System.out.println("move "+n+"th disk from "+s+" to "+d);
		hanoi(n-1,h,s,d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     hanoi(3,'s','h','d');
	}

}
