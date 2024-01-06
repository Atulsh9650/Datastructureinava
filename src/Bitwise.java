import java.util.Scanner;
public class Bitwise {

	public static void main(String[] args) {
		System.out.println(2 & 3);
		System.out.println(2|3);
		System.out.println(2^3);
		System.out.println(~2);
        System.out.println(34<<1);
        System.out.println(34>>2);
        System.out.println(-2<<1);
        System.out.println(-2>>1);
        int a=1;
        System.out.println(a++);
        System.out.println(++a);
        
        int b=a++;
        System.out.println(b);
        System.out.println(a);
      
        int c=1;
        c+=2;
        System.out.println(c);
	}

}
