import java.util.Scanner;
public class Fahtocel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	/* float fah=scan.nextFloat();
		float cel=(fah-32)*5/9;
		System.out.println("The temperature in celcius is  "+cel);  */
		
		
		//2)in this we are getting integer part
//		int fah=scan.nextInt();
//		int cel=(5*(fah-32))/9;
		
	//	3)in this we are doing explicit casting
	/* int fah=scan.nextInt();
     	int cel=(int)((fah-32)*(5.0/9));
        System.out.println("The temperature in celcius is  "+cel);
	*/
		
		/*fah to cel table
		int s=scan.nextInt();
		int e=scan.nextInt();
		int w=scan.nextInt();
		while(s<=e) {
			int cel=(5*(s-32))/9;
			System.out.println(s+"-"+cel);
			s=s+w;
		}
		*/
		
	}

}
