package binarytree;

import java.util.Scanner;

public class Diameteroftree {
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
	public static int height(Binarytreenode<Integer> root) {
		//Your code goes here
		if(root==null) {
			return 0;
		}
		
		int leftcount=height(root.left);
		int rightcount=height(root.right);
		return 1+Math.max(leftcount, rightcount);
			
	}
	public static int diameter(Binarytreenode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int option1=height(root.left)+height(root.right);
		int option2=diameter(root.left);
		int option3=diameter(root.right);
		return 1+Math.max(option1,Math.max(option2, option3));
	}
	public static Pair<Integer,Integer> diameterbetter(Binarytreenode<Integer> root){
	if(root==null) {
		Pair<Integer,Integer> ans=new Pair<>();
		ans.first=0;
		ans.second=0;
		return ans;
	}
	Pair<Integer,Integer> lo= diameterbetter(root.left);
	Pair<Integer,Integer> ro=diameterbetter(root.right); 
	int height=1+Math.max(lo.first,ro.first);
	int option1=lo.first+ro.first;
	int option2=lo.second;
	int option3=ro.second;
	int diameter=1+Math.max(option1,Math.max(option2, option3));
	Pair<Integer,Integer> ans=new Pair<>(); 
	ans.first=height;
	ans.second=diameter;
	return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Binarytreenode<Integer> root=takeinput();
      printLevelWise(root);
      Pair<Integer,Integer> ans=diameterbetter(root);
      System.out.println("the height of tree is "+ans.first);
      System.out.println("the diameter of tree is "+ans.second);
	}

}
