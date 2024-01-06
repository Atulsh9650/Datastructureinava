
public class Polymorphism {
	public static void display(int a,int b) {
		System.out.println("hello2");
	}
public static void display(float a,int b) {
	System.out.println("hello1");
}
public static void display(float a,float b) {
	System.out.println("hello2");
}
public static void display(double a,double b) {
	System.out.println("hello2");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
display(2.5,3.5);
	}

}
