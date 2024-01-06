package codingblock;
/*
 * Faculty at CodingBlocks loves to purchase smartphones and 
 * decides to play a game. Aayush and Harshit decides to shop for 
 * smartphones. Aayush purchases 1 smartphone, 
 * then Harshit purchases 2 smartphones, 
 * then Aayush purchases 3 smartphones, then Harshit
 *  purchases 4 smartphones, and so on. 
 * Once someone can't purchase more smartphones, he loses.
 */
import java.util.*;
public class Samrtphones {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int test=s.nextInt();
int i=1;
String arr[]=new String[test];
int j=0;
while(i<=test){
  int m=s.nextInt();
  int n=s.nextInt();
  int ayush=1;
  int harshit=2;
  while(true) {
	  if(ayush>m) {
		  arr[j]="Harshit";
		  j++;
		  i++;
		  break;
	  }
	  else if (harshit>n){
		 arr[j]="Aayush";
		 j++;
		 i++;
		  break;
	  }
	  ayush+=2;
	  harshit+=2;
	  
  }
}
for(int k=0;k<arr.length;k++) {
	System.out.println(arr[k]);
}
    }
}
