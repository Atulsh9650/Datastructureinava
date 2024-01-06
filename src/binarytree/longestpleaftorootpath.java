package binarytree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class longestpleaftorootpath {
	public static int findLevel(Binarytreenode<Integer> root, int target) {
        if (root == null) {
            return -1; // Target not found in the tree
        }
        
        Queue<Binarytreenode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
            	Binarytreenode<Integer> node = queue.poll();
                
                if (node.data == target) {
                    return level; // Return the level when the target is found
                }
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            level++;
        }
        
        return -1; // Target not found in the tree
    }
	public static ArrayList<Integer> longestRootToLeafPath(Binarytreenode<Integer> root){
		// Write your code here
		if(root==null) {
			ArrayList<Integer> output=new ArrayList<>();
		    return output;
		}
		if(root.left==null && root.right==null) {
			int level=findLevel(root,root.data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
