package stack;

public class Usingllstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Implementingllstack stack=new Implementingllstack();
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  stack.push(5);
  stack.push(6);
 
  while(!stack.isempty()) {
	  System.out.println(stack.pop());
	  
  }
	}

}
