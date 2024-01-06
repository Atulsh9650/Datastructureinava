package tree;

import java.util.Scanner;

public class Checkx {
	public static TreeNode<Integer> takeinput(Scanner s){
		System.out.println("enter the root node");
		int n=s.nextInt();
Implementingllqueuee<TreeNode<Integer>> pendingnodes=new Implementingllqueuee<>();
TreeNode<Integer> root=new TreeNode<>(n);
pendingnodes.enque(root);
while(!pendingnodes.isEmpty()) {
	try {
	TreeNode<Integer> rootnode=pendingnodes.deque();
	System.out.println("enter the no. of child nodes");
	int n1=s.nextInt();
	for(int i=0;i<n1;i++) {
		System.out.println("enter the"+(i+1)+"node");
		int child=s.nextInt();
		TreeNode<Integer> children=new TreeNode<>(child);
		rootnode.children.add(children);
		pendingnodes.enque(children);
	}
	}
	catch(QueueEmptyException e) {
		System.out.println(e);
	}
	}
    return root;
	}
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
    if(root==null) {
    	return false;
    }
    boolean ispresent=false;
    if(root.data==x) {
    	ispresent=true;
    }
    for(int i=0;i<root.children.size();i++) {
    	boolean result=checkIfContainsX(root.children.get(i),x);
    	ispresent=result;
    }
    return ispresent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 TreeNode<Integer> root=takeinput(s);
		 boolean ispresent=checkIfContainsX(root,30);
		 System.out.println(ispresent);
	}

}
