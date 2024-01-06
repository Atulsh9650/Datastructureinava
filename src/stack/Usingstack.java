package stack;

public class Usingstack {

	public static void main(String[] args) throws Stackfullexception{
		// TODO Auto-generated method stub
        Implementingstack a=new Implementingstack(3);
        a.push(4);
        a.push(3);
        a.push(5);
        a.push(6);
        try {
            System.out.println("top element="+a.top());
            }
            catch(Stackempty e) {
            	//never
            	System.out.println("stack is empty");
            }
        System.out.println("size of stack="+a.size());
        while(!a.isempty()) {
        	try {
        		System.out.println(a.pop());
        	}
        	catch(Stackempty e) {
        		//never reach here
        	}
        }
        
	}

}
