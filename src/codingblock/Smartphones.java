package codingblock;
/*
import java.util.Scanner;
public class Smartphones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  int t=s.nextInt();
  for(int i=1;i<=t;i++) {
  int m=s.nextInt();
  int n=s.nextInt();
  
  
  int ayush=1;
  int harshit=2;
  while(ayush<=m || harshit<=n) {
	  ayush+=2;
	  harshit+=2;
	  if(ayush>m) {
		  System.out.println("Ayush");
		  return;
	  }
	  if (harshit>n){
		  System.out.println("Harshit");
		  return;
	  }
  }
  }
	}

}
*/
import java.util.Scanner;

public class Smartphones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int numTests = scanner.nextInt();

        for (int i = 0; i < numTests; i++) {
            System.out.print("Enter the maximum number of phones Aayush can buy: ");
            int m = scanner.nextInt();
            System.out.print("Enter the maximum number of phones Harshit can buy: ");
            int n = scanner.nextInt();

            int aayushPurchases = 1;
            int harshitPurchases = 2;

            while (true) {
                // Aayush's turn
                if (aayushPurchases > 0) {
                    int numPhonesToBuy = Math.min(m, aayushPurchases);
                    aayushPurchases += numPhonesToBuy;
                } else {
                    System.out.println("Harshit");
                    break;
                }

                // Harshit's turn
                if (harshitPurchases > 0) {
                    int numPhonesToBuy = Math.min(n, harshitPurchases);
                    harshitPurchases += 2 * numPhonesToBuy;
                } else {
                    System.out.println("Aayush");
                    break;
                }
            }
        }
    }
}
