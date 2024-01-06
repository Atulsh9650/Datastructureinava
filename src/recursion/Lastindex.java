package recursion;

public class Lastindex {

	public static int lastIndex(int input[], int x) {
        //method overloading
        return lastIndex(input,x,input.length-1);		

    }
    private static int lastIndex(int input[],int x,int startIndex){
        if(startIndex<0)
            return -1;
        if(input[startIndex]==x)
            return startIndex;
        return lastIndex(input,x,startIndex-1);
        }
	


public static void main(String[] args) {
// TODO Auto-generated method stub
int arr[]= {2,2,4,7,2};
int check=lastIndex(arr,2);
System.out.println(check);
}

}
