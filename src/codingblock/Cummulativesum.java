package codingblock;
import java.util.*;
import java.util.ArrayList;
public class Cummulativesum {
    public static void main(String args[]) {
   Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int cumulativeSum = 0;
        
        while (true) {
            int num = scanner.nextInt();
			if(num>-1000 && num<1000){
            numbers.add(num);
			}
           else{
			   break;
		   }
        }
        
        for (int num : numbers) {
			cumulativeSum+=num;
            if (cumulativeSum >= 0) {
                System.out.println(num);
            }
           else{
			   break;
		   }
        }
        
        scanner.close();
    }
}