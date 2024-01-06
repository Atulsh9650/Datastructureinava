package binarytree;

import java.util.Scanner;

public class Checkbst {
	
	public static boolean isBST(Binarytreenode<Integer> root) {
    if(root==null) {
    	return true;
    }
    int leftmax=maximum(root.left);
    int rightmin=minimum(root.right);
    if(root.data<=leftmax) {
    	return false;
    }
    if(root.data>=rightmin) {
    	return false;
    }
    
    boolean lans=isBST(root.left);
    boolean rans=isBST(root.right);
   if(lans && rans) {
	   return true;
   }
   else {
	   return false;
   }
	}
	public static int maximum(Binarytreenode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data,Math.max(maximum(root.left), maximum(root.right)));
	}
	public static int minimum(Binarytreenode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data,Math.min(minimum(root.left), minimum(root.right)));
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
	public static Pair<Boolean,Pair<Integer,Integer>> isbst2(Binarytreenode<Integer> root){
	if(root==null) {
		Pair<Boolean,Pair<Integer,Integer>> ans=new Pair<>();
		ans.first=true;
		ans.second =new Pair<Integer,Integer>();
		ans.second.first=Integer.MAX_VALUE;
		ans.second.second=Integer.MIN_VALUE;
		return ans;
	}
	Pair<Boolean,Pair<Integer,Integer>> lans=isbst2(root.left);
	Pair<Boolean,Pair<Integer,Integer>> rans=isbst2(root.right);
	int min=Math.min(root.data,Math.min(lans.second.first, rans.second.first) );
	int max=Math.max(root.data,Math.max(lans.second.second, rans.second.second));
	boolean isbst=(root.data>lans.second.second) && 
			(root.data<=rans.second.first) 
		&& (lans.first) && (rans.first); 
	Pair<Boolean,Pair<Integer,Integer>> ans=new Pair<>();
	ans.first=isbst;
	ans.second =new Pair<Integer,Integer>();
	ans.second.first=min;
	ans.second.second=max;
	return ans;
		
	}
	public static boolean isbst3(Binarytreenode<Integer> root,int min,int max) {
		if(root==null) {
			return true;
		}
		if(root.data<min && root.data>max) {
			return false;
		}
		boolean isleftok=isbst3(root.left,min,root.data-1);
		boolean isrightok=isbst3(root.right,root.data,max);
		return (isleftok && isrightok);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Binarytreenode<Integer> root=takeinput();
Pair<Boolean,Pair<Integer,Integer>> ans	=isbst2(root);
System.out.println(ans.first);
	}

}
