package recursion;

public class Sumofdigit {
	public static int sumOfDigits(int input){
	if(input<=0) {
		return 0;
	}
   int smallans=input%10;
   return smallans+sumOfDigits(input/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int input=123;
    int sum=sumOfDigits(input);
    System.out.println(sum);
	}

}
