package tree;

import java.util.Scanner;

public class Identicaltrees {
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
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
 
		// Write your code here
		if(root1==null||root2==null){
			return false;
		}
		
		if(root1.children.size()!=root2.children.size()) {
			return false;
		}
		if(root1.data!=root2.data) {
			return false;
		}
		for(int i=0;i<root1.children.size();i++) {
			if(!checkIdentical(root1.children.get(i),root2.children.get(i))) {
				return false;
			}
		}
	   return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	       TreeNode<Integer> root1=takeinput(s);
	       TreeNode<Integer> root2=takeinput(s);
	       boolean result=checkIdentical(root1,root2);
	       System.out.println(result);
	}

}
