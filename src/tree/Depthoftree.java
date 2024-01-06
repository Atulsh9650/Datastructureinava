package tree;

import java.util.Scanner;

public class Depthoftree {
	public static void printlevelwise(TreeNode<Integer> root) {
		Implementingllqueuee<TreeNode<Integer>> queue=new Implementingllqueuee<>();
		queue.enque(root);
		
		
		while(!queue.isEmpty()) {
			try {
		TreeNode<Integer> frontnode=queue.deque();
		String s=frontnode.data+":";
		  for(int i=0;i<frontnode.children.size();i++) {
			  queue.enque(frontnode.children.get(i));
			  s=s+frontnode.children.get(i).data+",";
		  }
		  System.out.println(s);
			}
		  catch(QueueEmptyException e) {
				System.out.println(e);
			}
		  }
		
	}
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
	public static void depth(TreeNode<Integer> root,int k) {
		if(k<0) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
		}
		for(int i=0;i<root.children.size();i++) {
			depth(root.children.get(i),k-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		TreeNode<Integer> root=takeinput(s);
		printlevelwise(root); 
		depth(root,0);
	}

}
