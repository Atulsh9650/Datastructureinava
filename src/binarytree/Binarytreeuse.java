package binarytree;
import java.util.Scanner;
public class Binarytreeuse {
	public static void print(Binarytreenode<Integer> root) {
		if(root==null) {
			return;
		}
		String tobeprinted=root.data+": ";
		if(root.left!=null) {
			tobeprinted+="L"+root.left.data+",";
		}
		if(root.right!=null) {
			tobeprinted+="R"+root.right.data;
		}
		System.out.println(tobeprinted);
		print(root.left);
		print(root.right);
	}
	
 public static Binarytreenode<Integer> takeinput(Scanner s){
	 int rootnode;
	 System.out.println("enter the root node");
	 rootnode=s.nextInt();
	 if(rootnode==-1) {
		 return null;
	 }
	 Binarytreenode<Integer> root=new Binarytreenode<Integer>(rootnode);
	 root.left=takeinput(s);
	 root.right=takeinput(s);
	 return root;
 }
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*
		Binarytreenode<Integer> root=takeinput(s);
		print(root);
		// TODO Auto-generated method stub
	/*	Binarytreenode<Integer> root=new Binarytreenode<>(1);
		Binarytreenode<Integer> node1=new Binarytreenode<>(2);
		Binarytreenode<Integer> node2=new Binarytreenode<>(3);
		root.left=node1;
		root.right=node2;
		*/
		
		
	}

}
