package codingblock;
import java.util.*;
public class Alexgoesshopping {
	public static void main(String args[]){
	    Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] prices = new int[n];
	        for (int i = 0; i < n; i++) {
	            prices[i] = scanner.nextInt();
	        }
	        int q = scanner.nextInt();
	        int[][] queries = new int[q][2];
	        for (int i = 0; i < q; i++) {
	            queries[i][0] = scanner.nextInt();
	            queries[i][1] = scanner.nextInt();
	        }

	        for (int i = 0; i < q; i++) {
	            int A = queries[i][0];
	            int k = queries[i][1];
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	            	
	                if (A%prices[j] == 0) {
	                    count++;
	                }
	            	
	            }
	      
	            if (count>= k) {
	                System.out.println("Yes");
	            } else {
	                System.out.println("No");
	            }
	        }

	    }
	}