package tree;

import java.util.Scanner;

public class Secondlargest {
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

    private static int largest;
    private static int secondLargest;

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
        if (root == null || root.children.size() == 0) {
            return null;
        }

        largest = Integer.MIN_VALUE;
        secondLargest = Integer.MIN_VALUE;
        findLargestAndSecondLargest(root);
        if (secondLargest == Integer.MIN_VALUE) {
            return null;
        }
        return new TreeNode<>(secondLargest);
    }

    private static void findLargestAndSecondLargest(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        if (node.data > largest) {
            secondLargest = largest;
            largest = node.data;
        } else if (node.data < largest && node.data > secondLargest) {
            secondLargest = node.data;
        }

        for (TreeNode<Integer> child : node.children) {
            findLargestAndSecondLargest(child);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	       TreeNode<Integer> root1=takeinput(s);
	       TreeNode<Integer> sec= findSecondLargest(root1);
	       System.out.println(sec.data);
	}

}
