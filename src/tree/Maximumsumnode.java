package tree;

import java.util.Scanner;

public class Maximumsumnode {
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
	 public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
	        if (root == null)
	            return null;

	        TreeNode<Integer> maxNode = root;
	        int maxSum = sum(root);

	        for (TreeNode<Integer> child : root.children) {
	            TreeNode<Integer> childMaxNode = maxSumNode(child);
	            int childSum = sum(childMaxNode);

	            if (childSum > maxSum) {
	                maxSum = childSum;
	                maxNode = childMaxNode;
	            }
	        }

	        return maxNode;
	    }

	    public static int sum(TreeNode<Integer> node) {
	        int sum = node.data;
	        for (TreeNode<Integer> child : node.children) {
	            sum += child.data;
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
       TreeNode<Integer> root=takeinput(s);
       TreeNode<Integer> maxnode=maxSumNode(root);
       System.out.println(maxnode.data);
	}

}
