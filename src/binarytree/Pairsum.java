package binarytree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pairsum {
    public static void pairSum(Binarytreenode<Integer> root, int sum) {
        if (root == null) {
            return;
        }
        
        ArrayList<Integer> tree = new ArrayList<>();
        inorderTraversal(root, tree);
        Collections.sort(tree);
        
        int start = 0;
        int end = tree.size() - 1;
        
        while (start < end) {
            int total = tree.get(start) + tree.get(end);
            if (total == sum) {
                System.out.println(tree.get(start) + " " + tree.get(end));
            }
            
            if (total > sum) {
                end--;
            } else {
                start++;
            }
        }
    }
    
    public static void inorderTraversal(Binarytreenode<Integer> root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
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
   printLevelWise(root);
   pairSum(root,6);
	}

}
