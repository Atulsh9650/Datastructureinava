
public class Ispallindrome {
	public static boolean isPalindrome(int x) {
        int palnum=0;
        int temp=x;
        int i=1;
        while(temp>0){
            int carry=temp%10;
            palnum=palnum*i+carry;
            temp=temp/10;
            i=i*10;
        }
        if(palnum==x){
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(isPalindrome(121));
	}

}
