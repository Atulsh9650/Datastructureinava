package binarytree;

import java.util.Scanner;

public class Inorder {
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
	public static void printLevelWise(Binarytreenode<Integer> root) {
		if(root==null) {
			return;
		}
		Implementingllqueuee<Binarytreenode<Integer>> pendingnodes=new Implementingllqueuee<Binarytreenode<Integer>>();
		pendingnodes.enque(root);
		while(!pendingnodes.isEmpty()) {
			Binarytreenode<Integer> rootnode;
			try {
				rootnode=pendingnodes.deque();
				String result=rootnode.data+":";
				//Your code goes here
				if(rootnode.left!=null) {
				result+="L:"+rootnode.left.data+",";
				pendingnodes.enque(rootnode.left);
				}
				else {
				result+="L:-1"+",";
				}
				if(rootnode.right!=null) {
					result+="R:"+rootnode.right.data;
					pendingnodes.enque(rootnode.right);
					}
					else {
					result+="R:-1";
					}
				System.out.println(result);
				}
			catch(QueueEmptyException e){
				
			}
		}
	}
	public static void inorder(Binarytreenode<Integer> root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void preorder(Binarytreenode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(Binarytreenode<Integer> root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarytreenode<Integer> root=takeinput();
		inorder(root);
		System.out.println();
		preorder(root);
		postorder(root);
	}

}
