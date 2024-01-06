package tree;

import java.util.Scanner;
import java.util.*;

public class Takinginputlevelwise {
	public static int largestnode(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int largest=root.data;
		for(int i=0;i<root.children.size();i++) {
			int islargest=largestnode(root.children.get(i));
			if(islargest>largest) {
				largest=islargest;
			}
			
		}
		return largest;
	}
	public static int countsumnodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int sum=root.data;
		for(int i=0;i<root.children.size();i++) {
			int smallsum=countsumnodes(root.children.get(i));
			sum=sum+smallsum;
			
		}
		return sum;
	}
	public static int countnodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			count+=countnodes(root.children.get(i));
		}
		return count;
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
	public static void print(TreeNode<Integer> root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
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
	public static int numNodeGreater(TreeNode<Integer> root,int x){
     if(root==null) {
    	 return 0;
     }
     int count=0;
      if(root.data>x) {
    	  count+=1;
      }
      for(int i=0;i<root.children.size();i++) {
    	  int smallans=numNodeGreater(root.children.get(i),x);
    	  count+=smallans;
      }
      return count;
	}
	public static int getHeight(TreeNode<Integer> root){
		if (root == null) {
	        return 0;
	    }
	    
	    int count = 0;

	    for (int i = 0; i < root.children.size(); i++) {
	        int childHeight = getHeight(root.children.get(i));
	        count = Math.max(count, childHeight);
	    }

	    return count + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		TreeNode<Integer> root=takeinput(s);
		printlevelwise(root); 
		int count=countnodes(root);
		System.out.println("the total no. of nodes is "+count);
		int sum=countsumnodes(root);
		System.out.println("the sum  of nodes is "+sum);
		int largest=largestnode(root);
		System.out.println("the largest  of nodes is "+largest);
		int numgreater=numNodeGreater(root,30);
		System.out.println("the nodes greater than 30 is"+numgreater);
	}

}
