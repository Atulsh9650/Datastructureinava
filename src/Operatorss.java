import java.util.Scanner;
public class Operatorss {

	public static void main(String[] args) {
/*		//int/int=int
				//double/int=double
		        System.out.println(9/5);
		        System.out.println(9.0/5);
		   //ARITHMETIC OPERATORS
		        System.out.println(9+5);
		        System.out.println(9-5);
		        System.out.println(9/5);
		        System.out.println(9*5);
		        System.out.println(9%5);
		       //Ascii value
		        System.out.println('A'+1);
		        	
		        System.out.println("abcd  "+1);
		        System.out.println('a'/3);
		       char c='a';
		       char i=(char)(c+3);
		       System.out.println(i);
			
		       //RELATIONAL OPERATORS
		       /**
		        * a>=b
		        * a>b
		        * a<=b
		        * a<b
		        * a==b
		        * a!=b is a not equal to b
		        */
		       Scanner num=new Scanner(System.in);
		       int i=num.nextInt();
		       int j=num.nextInt();
		      /* if(a>=b) {
		    	   System.out.println("a");
		       }else {
		    	   System.out.println("you are great");
		       } */
		       boolean isEq = (i == j);
				boolean neq = (i != j);
				boolean isgr = (i > j);
				boolean isgreq = (i >= j);
				boolean isless = (i < j);
				boolean isLessEq = (i <= j);
				System.out.println("Is Equal " + isEq);
				System.out.println("Is Not Equal " + neq);
				System.out.println("Is Greater " + isgr);
				System.out.println("Is Greater Equal " + isgreq);
				System.out.println("Is Less " + isless);
				System.out.println("Is Less Equal " + isLessEq);
	}

}
