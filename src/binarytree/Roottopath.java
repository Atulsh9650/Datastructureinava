package binarytree;
import java.util.ArrayList;
import java.util.Scanner;
public class Roottopath {

	public static ArrayList<Integer> getpath(Binarytreenode<Integer> root,int data){
		if(root==null) {
			return null;
		}
		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> loutput=getpath(root.left,data);
		
		if(loutput!=null) {
			loutput.add(root.data);
			return loutput;
		}
		
		ArrayList<Integer> routput=getpath(root.right,data);
		if(routput!=null) {
			routput.add(root.data);
			return routput;
		}
		else {
			return null;
		}
	}
	public static Binarytreenode<Integer> takeinput(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the root node:");
		int root=s.nextInt();
		if(root==-1) {
			return null;
		}
		Implementingllqueuee<Binarytreenode<Integer>> pendingnodes=new Implementingllqueuee<Binarytreenode<Integer>>();
		Binarytreenode<Integer> rootnode=new Binarytreenode<>(root);
		pendingnodes.enque(rootnode);
		while(!pendingnodes.isEmpty()) {
			Binarytreenode<Integer> firstnode;
			try {
				firstnode=pendingnodes.deque();
				System.out.println("enter the left node of "+firstnode.data);
				int leftnode=s.nextInt();
				if(leftnode!=-1) {
					Binarytreenode<Integer> leftnodes=new Binarytreenode<>(leftnode);
					firstnode.left=leftnodes;
					pendingnodes.enque(leftnodes);
				}
				System.out.println("enter the right node of "+firstnode.data);
				int rightnode=s.nextInt();
				if(rightnode!=-1) {
					Binarytreenode<Integer> rightnodes=new Binarytreenode<>(rightnode);
					firstnode.right=rightnodes;
					pendingnodes.enque(rightnodes);
				}
				
				}
			catch(QueueEmptyException e){
				System.out.println(e);
			}
			
		}
		return rootnode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Binarytreenode<Integer> root=takeinput();
    ArrayList<Integer> ans=getpath(root,6);
    for(int ele:ans) {
    	System.out.print(ele+" ");
    }
	}

}
