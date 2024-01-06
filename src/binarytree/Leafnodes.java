package binarytree;
import java.util.*;
import java.util.Scanner;

public class Leafnodes {
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
public static int leaf(Binarytreenode<Integer> root) {
	if(root==null) {
		return 0;
	}
	if(root.left==null && root.right==null) {
		return 1;
	}
	return leaf(root.left)+leaf(root.right);
}

public static void depth(Binarytreenode<Integer> root,int k) {
	if(root==null) {
		return;
	}
	if(k==0) {
		System.out.print(root.data+" ");
		return;
	}
	depth(root.left,k-1);
	depth(root.right,k-1);
}
public static void changeToDepthTree(Binarytreenode<Integer> root) {
    //Your code goes here
	if(root==null) {
		return;
	}
	
	int depth=0;
	root.data=depth;
	Queue<Binarytreenode<Integer>> queue=new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()) {
		Binarytreenode<Integer> node=queue.poll();
		if(node.left!=null) {
		node.left.data=node.data+1;
		queue.add(node.left);
		}
		if(node.right!=null) {
		node.right.data=node.data+1;
		queue.add(node.right);
		}
		
	}
}
public static boolean isNodePresent(Binarytreenode<Integer> root, int x) {
	
    //Your code goes here
	if(root==null) {
		return false;
	}
	if(root.data==x) {
		return true;
	}
	boolean result=false;
	if(isNodePresent(root.left,x)) {
		result=true;
	}
	if(isNodePresent(root.right,x)) {
		result=true;
	}
	return result;
}
public static void printNodesWithoutSibling(Binarytreenode<Integer> root) {
	//Your code goes here
	if(root==null) {
		return;
	}
	if(root.left==null && root.right!=null) {
		System.out.print(root.right.data+" ");
	}
	if(root.left!=null && root.right==null) {
		System.out.print(root.left.data+" ");
	}
	printNodesWithoutSibling(root.left);
	printNodesWithoutSibling(root.right);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarytreenode<Integer> root=takeinput();
		
	//	int count=leaf(root);
	//	System.out.println(count);
	//	depth(root,2);
		//changeToDepthTree(root);
		printLevelWise(root);
		printNodesWithoutSibling(root);
	}

}
