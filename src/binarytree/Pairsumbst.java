package binarytree;

import java.util.Scanner;

public class Pairsumbst {

	public static void pair(Binarytreenode<Integer> root,Binarytreenode<Integer> root1,int sum) {
		if(root1==null) {
			return;
		}
	 pair(root,root1.left,sum);
	 int com=sum-root1.data;
	 if(root1.data<com) {
		 if(find(root,com)==true) {
			 System.out.println(root1.data+" "+com);
		 }
	 }
	 pair(root,root1.right,sum);
	}
	public static boolean find(Binarytreenode<Integer> root,int sum) {
		if(root==null) {
			return false;
		}
		if(root.data==sum) {
			return true;
		}
		else if(sum>root.data) {
			return find(root.right,sum);
		}
		else {
			return find(root.left,sum);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Binarytreenode<Integer> root=takeinput();
     pair(root,root,35);
	}

}
