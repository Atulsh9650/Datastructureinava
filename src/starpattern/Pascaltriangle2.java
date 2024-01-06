package starpattern;

import java.util.Scanner;

public class Pascaltriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);

        int n=scn.nextInt(),i,j;
      //work for each row
        for(i=1;i<=n;i++){
            int num=1;   //starting number

            

            for(j=1;j<=i;j++){
                if(j==1)
                    System.out.print(j+" ");
                else
                {
                    num=num*(i-j+1)/(j-1);      // updating number
                    System.out.print(num+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
