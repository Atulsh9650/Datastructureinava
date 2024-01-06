package functions;

import java.util.Scanner;

public class Fahtoceltable {

	public static void conversion(int s,int e,int w ) {
		while(s<=e) {
			
			int cel=(5*(s-32))/9;
			System.out.println(s+" "+cel);
			s+=w;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner se=new Scanner(System.in);
       int s=se.nextInt();
       int e=se.nextInt();
       int w=se.nextInt();
       conversion(s,e,w);
	}

}
