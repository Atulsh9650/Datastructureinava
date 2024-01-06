package tree;

import java.util.Scanner;

public class Traversal {
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
public static void postorder(TreeNode<Integer> root) {
	if(root==null) {
		return;
	}
	
	for(int i=0;i<root.children.size();i++) {
		postorder(root.children.get(i));
	}
	System.out.print(root.data+" ");
}
public static void preorder(TreeNode<Integer> root) {
	if(root==null) {
		return;
	}
	System.out.print(root.data+" ");
	for(int i=0;i<root.children.size();i++) {
		preorder(root.children.get(i));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 TreeNode<Integer> root=takeinput(s);
		 preorder(root);
		 System.out.println();
		 postorder(root);
	}

}
