import java.lang.Math; 
import java.util.Scanner;
public class QUESTINONS {
	
	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	 public static void main(String[] args) {
		 
		 
//		 total salary
		 //Scanner s=new Scanner(System.in);
//		 int basic=s.nextInt();
//		 char grade=s.next().charAt(0);
//		 double hra=basic*0.2;
//		 double da=basic*0.5;
//		 int allow=0;
//		 double pf=basic*0.11;
//		 if(grade=='A') {
//			 allow=1700;
//		 }
//		 else if(grade=='B'){
//			 allow=1500;
//		 }
//		 else {
//			 allow=1300;
//		 }
//		 double totalsalary= basic+da+hra+allow-pf;
//		 System.out.println(Math.round(totalsalary));
		 
		 //maths table
//		 Scanner s=new Scanner(System.in);
//		 int n=s.nextInt();
//		 for(int i=1;i<=10;i++) {
//            int j=n*i;
//            System.out.println(j);
            
//		 }
	 
	 //sum of even and aodd
//		 Scanner s=new Scanner(System.in);
//		 int n=s.nextInt();
//		 int even=0;
//		 int odd=0;
//		 while(n>0) {
//			 int j=n%10;
//			 if(j%2==0) {
//				 even=even+j;
//			 }
//			 else {
//				 odd=odd+j;
//			 }
//			 n=n/10;
//		 }
//		 System.out.print(even+" ");
//		 System.out.println(odd);
		 
//		 Scanner s=new Scanner(System.in);
//		 int n=s.nextInt();
//		 int num=2;
//		 while(num<n) {
//			 if(n%num==0) {
//				 System.out.print(num+" ");
//			 }
//	       num++;
//		 }
		 
//		 Scanner s=new Scanner(System.in);
//		 int x=s.nextInt();
//		 int n=s.nextInt();
//		 int result=1;
//		 for (int i=1;i<=n;i++) {
//			 result=x*result;
//		 }
//		 System.out.println(result);
		 
		 //for square no, patterm
		/* Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 System.out.print(n);
			 }
			 System.out.println();
		 }*/
		 
		 //output 1 1 1 1
		     //2222
		 //3333
		 //4444
		 
		/* Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 System.out.print(n-j+1);
			 }
			 System.out.println();
		 }*/
		 
		 
		 //for triangle pattren
		 /*1)
		  * 1
		  * 1 2
		  * 1 2 3
		  * 1 2 3 4
		 
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1;
		 		 while(i<=n){
		 			 int j=1;
		 			 while(j<=i) {
		 				 System.out.print(j);
		 				 j++;
		 			 }
		 			 System.out.println();
		 			 i++;
		 		 }
		 		  */
		 		//for triangle pattren
				 /*1)
				  * 1
				  * 2 3
				  * 3 4 5
				  * 4 5 6 7
				  */

		/* Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1;
		 while(i<=n) {
		 int j=1;
		 int temp=i;
		 while(j<=i) {
			 
			 System.out.print(" "+ temp+ " " );
			 temp++;
			 j++;
		 }
		 		System.out.println();
		 		 i++;
		 		 
		 		 }*/
		 		 
		//for triangle pattren
		 /*3)
		  * 1
		  * 2 3
		  * 4 5 6
		  * 7 8 9 10
		  /*
		 
		 /*	 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1;
		 int temp=1;
		 while(i<=n) {
			 int j=1;
			 while(j<=i) {	 
				 System.out.print(temp);
				 temp++;
				 j++;
			 }
			 		System.out.println();
			 		 i++;
			 		 
		 }*/
		 
		 /*4)
		  * *
		  * **
		  * ***
		  * ****
		  
	 
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1;
		 while(i<=n) {
			 int j=1;
			 while(j<=i) {
				 System.out.print("*");
				 j++;
			 }
			 System.out.println();
			 i++;
		 }*/
		 
		 /*4)
		  * 1
		  * 22
		  * 333
		  * 4444
		 
	 
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1;
		 while(i<=n) {
			 int j=1;
			 while(j<=i) {
				 System.out.print(i);
				 j++;
			 }
			 System.out.println();
			 i++;
		 } */
		 
		 
		//for triangle pattren
		 /*3)
		  * 1
		  * 2 3
		  * 4 5 6
		  * 7 8 9 10
		  */
		 
		/*  Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int i=1;
		 
		 while(i<=n) {
			 int temp=i;
			 int j=1;
			 while(j<=i) {	 
				 System.out.print(temp);
				 temp--;
				 j++;
			 }
			 		System.out.println();
			 		 i++;
			 		 
		 }*/
		/*ABCD
		 * ABCD
		 * ABCD
		 * ABCD 
		
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 
		 int i=1;
		 while(i<=n) {
			 char c ='A';
			 int j=1;
			 while(j<=n) {
				 System.out.print(c);
				 j++;
				 c++;
			 }
			 System.out.println();
			 i++;
		 }
		 */
		 
		 
		     /*ABCD
			 * BCDE
			 * CDEF
			 * GHIJ
			  */
		 
		 
			/* Scanner s=new Scanner(System.in);
			 int n=s.nextInt();
			 
			 int i=1;
			 while(i<=n) {
				 char c ='A';
				 int j=1;
				 while(j<=n) {
					 System.out.print(c);
					 j++;
					 c++;
				 }
				 System.out.println();
				 i++;
				 c++;
			 }
			
			*/
		/*Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 sum=sum+i;
		 }
		 System.out.println(sum);
		 */
		 
		 /*inverted half pyramid
		    ****
		    ***
		    **
		    *
		
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=n;i>=1;i--) {
			 for(int j=1;j<=i;j++) {
				System.out.print("*");
				 			 }
				
				 System.out.println();
		 }
		     */
		 
		 /*inverted half pyramid rotaded by 180
		      *
		     **
		    ***
		   ****
		
		 
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				 			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
				 System.out.println();
		 }*/
		 
		 /*
		  1
		  01
		  010
		  0101
		  01010
		  
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 if((i+j)%2==0) {
					 System.out.print(1);
				 }
				 else {
					 System.out.print(0);
				 }
  	
			 }
			    
				 System.out.println();
		 }
		 */
		 
		 /*
		      ****
		     ****
		    ****
	       ****
		  
		  		  
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=n;j++) {
				 System.out.print("*");
			 }
			    
				 System.out.println();
		 }
		 */
		 /*
	      ****
	     ****
	    ****
       ****
	  
	  		  
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n-i;j++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=n;j++) {
			 System.out.print("*");
		 }
		    
			 System.out.println();
	 }*/
		 
		 /*
	     *
	     **
	     ***
	     ****
	     *****
	     ****
	     ***
	     **
	     *
	  
	  		  
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 for(int row=0;row<2 *n;row++) {
		 int totalcolsrow=row > n ?2 *n-row:row;
		 for(int column=0;column<totalcolsrow;column++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }*/
		 
		 /*
	     *
	    * *
	   * * *
	  * * * *
     * * * * *
      * * * *
	   * * *
	    * *
	     *
	  
	  		  
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 for(int row=0;row<2 *n;row++) {
		 int totalcolsrow=row > n ?2 *n-row:row;
		 int totalsp=n-totalcolsrow;
		 for(int k=0;k<totalsp;k++) {
			 System.out.print(" ");
		 }
		
		 
		 for(int column=0;column<totalcolsrow;column++) {
			 System.out.print("* ");
			 
			 
		 }
		 System.out.println();
	 }*/
		 
		/*
		 ABCD
		 BCDE
		 CDEF
		 DEFG
		 
		 Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		 for(int i=1;i<=n;i++) {
			 char temp=((char)('A'+i-1));
			 for(int j=1;j<=n;j++) {
				 
				 System.out.print(temp);
				 temp=(char)(temp+1);
			 }
			 System.out.println();
		 }*/
		 /*
		 A
		 BC
		 CDE
		 DEF
		 
		 Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
     
	        for(int i=1;i<=n;i++){
             char temp=(char)('A'+i-1);
	            for(int j=1;j<=i;j++){
	                System.out.print(temp);
                 temp++;
	            }
	           
	            System.out.println();
	     }*/
		 /*
		  E
		  DE
		  CDE
		  BCDE
		  ABCDE
		 
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			 char temp=(char)('A'+n-i);
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(temp);
				 temp++;
			 }
			
			 System.out.println();
		 }*/
		 
		 /*
		  1
		 121
		12321
	   1234321 
		   
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
				 
			 }	
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
				 
			 }	
			 int temp=i-1;
			 for(int j=1;j<=i-1;j++) {
				 
				 System.out.print(temp);
				 temp--;
				 
			 }	
			 System.out.println();
		 }
		 
		 
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
				 
			 }	
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
				 
			 }	
			 for(int j=1;j<=i-1;j++) {
				 
				 System.out.print("*");
				 
				 
			 }	
			 System.out.println();
		 }
		 */
		/*
		 1
		232
	   34543
	  4567654	  
		   
		
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			 int temp=i;
			
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
				 
			 }	
			 for(int j=1;j<=i;j++) {
				 System.out.print(temp);
				 temp++;
			 }	
			 int k=(2*i)-2;
			 for(int j=1;j<=i-1;j++) {
				 
				 System.out.print(k);
				 
				 k--;
				 
			 }	
			 System.out.println();
		 } */
		 /*
		  *
		 ***
        ***** 
         ***
          *		  
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int n1=(n+1)/2;
		 int n2=n1-1;
		 for(int i=1;i<=n1;i++) {
		
			 for(int j=1;j<=n1-i;j++) {
				 System.out.print(" ");
				 
			 }	
			 for(int j=1;j<=2*i-1;j++) {
				 System.out.print("*");
				 
			 }	
			 
			 System.out.println();
		 }
	 
		 for(int i=n2;i>=1;i--) {
				
			 for(int j=1;j<=n2-i+1;j++) {
				 System.out.print(" ");
				 
			 }	
			 for(int j=1;j<=2*i-1;j++) {
				 System.out.print("*");
				 
			 }	
			 
			 System.out.println();
		 }*/
		 /*
		  ****
		   ****
		    ****
		     ****
		  
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			 
			 for(int j=1;j<=i-1;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=n;j++)
			 {
				 System.out.print("*");
				 }
			 System.out.println();
			 }
	*/
		 /*
		  1=1
		  1+2=3
		  1+2+3=6 
		   
		  
		 Scanner s=new Scanner(System.in) ;
		 int n=s.nextInt();
		 
		 for(int i=1;i<=n;i++) {
			 int sum=0;
			 int num=1;
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(num);
				 if(num<i){
					System.out.print("+"); 
				 }
				 
				sum=sum+num;
				num++;
				
			 }
			 System.out.print("="+sum);
			 System.out.println();
		 }
		 */
		 /*
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 
		 for(int i=1;i<=n;i++) {
			int odd=2*i-1;
			int p=1;
			for(int j=n;j>=i;j--) {
				System.out.print(odd);
				odd=odd+2;
			}
			for(int j=1;j<=i-1;j++) {
				
				System.out.print(p);
				p=p+2;
			}
			 System.out.println();
			 
			 
			 
			 
			 import java.util.Scanner;
public class Solution {

    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
    System.out.println(fib(n)); 
    } 
        
		
	}

		 }*/
		 /*
		  * 3n+2 ap
		  
		 Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			int N=1;
			int count=0;
		    while(count<x) {
		    	int term=3*N+2;
		    	if(term%4==0) {
		    		System.out.print("");
		    	}
		    	else {
		    		System.out.print(term+" ");
		    		count++;
		    	}
		    	N++;
		    }*/
		 /*
		  *Reversing a number
		  
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int rev=0;
		 while(n>0) {
		 int rever=n%10;
		 rev=rev*10+rever;
		 n=n/10;
		 }
		 System.out.println(rev);
	     */
	/*binary to decimal
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int decimal=0;
		 int i=1;
		 while(n>0) {		 	 
		 int deci=n%10;
		 decimal=decimal+deci*i;
		 i=i*2;
		 n=n/10;
		 }
		 System.out.println(decimal);
		*/
		 /*decimal to binary
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 long binary=0;
		 int pv=1;
		 while(n>0) {		 	 
		 int rem=n%2;
		 binary=binary+rem*pv;
		 pv=pv*10;
		 n=n/2;
		 }
		 System.out.println(binary);
		 */
		 /*
		  * sqrt integral
		 Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int i=1;
	        int sqrt=0;
	     while(i*i<=n){
	         sqrt=sqrt+1;
	         i=i+1;
	     }
	        System.out.println(sqrt);
*/
		 /*difficult
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if(n==0) {
				System.out.print("false");
				return;
			}
			int b = 0;
			int pre = s.nextInt();
			int i = 1;
			boolean isDec = true;
			int a = 0;
			if(n<=0||n==1) {
				a=1;
			}
			while(i<n) {
				int current = s.nextInt();
				if(pre == current) {
					a=1;
				}else if(pre>current) {
					if(isDec) {
						pre = current;
					}else if(b==1){
					
						a = 1;
					}else {
						a=1;
					}
				}else if(pre<current) {
					isDec = false;
					pre = current;
					b=1;
				}
				i++;
			}
			if(a==0) {
				System.out.print("true");
			}else {
				System.out.print("false");
			}
			*/
	 } 
	 }
 


	 



