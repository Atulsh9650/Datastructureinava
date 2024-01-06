package codingblock;
import java.util.Scanner;
public class Lowerupper {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Invalid");
        }
    }

}
