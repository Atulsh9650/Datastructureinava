package tree;

import java.util.Scanner;

public class Countleafnodes {
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
	public static int countleaf(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count=0;
		if(root.children.size()==0) {
			count=1;
		}
		for(int i=0;i<root.children.size();i++) {
		int childcount=countleaf(root.children.get(i));
		count+=childcount;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		TreeNode<Integer> root=takeinput(s);
		printlevelwise(root); 
		int count=countleaf(root);
		System.out.println(count);
	}

}
