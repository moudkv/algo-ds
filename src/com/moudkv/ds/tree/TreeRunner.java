/**
 * 
 */
package com.moudkv.ds.tree;

import com.moudkv.ds.tree.binary.BinaryTreeTraversals;
import com.moudkv.ds.tree.utils.TreeBuilder;

/**
 * @author Vamsi
 * Main class to run tree based problems
 */
public class TreeRunner {
	
	TreeBuilder builder = new TreeBuilder();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeRunner runner = new TreeRunner();
		runner.traversals();
	}
	
	private void traversals() {				
		TreeNode root = builder.buildBinarySearchTree();
		
		/*System.out.println("Recursive Pre Order traversal");
		BinaryTreeTraversals.preOrderTraversalRecursive(root);
		System.out.println(" ");
		
		System.out.println("Iterative Pre Order traversal");
		BinaryTreeTraversals.preOrderTraversalIterative(root);
		System.out.println(" ");
		
        System.out.println("Recursive In Order traversal");
		BinaryTreeTraversals.inOrderTraversalRecursive(root);
		System.out.println(" ");
		
		System.out.println("Iterative In Order traversal");
		BinaryTreeTraversals.inOrderTraversalIterative(root);
		System.out.println(" ");*/
		
		System.out.println("Recursive Post Order traversal");
		BinaryTreeTraversals.postOrderTraversalRecursive(root);
		System.out.println(" ");		
		
		System.out.println("Iterative Post Order traversal");
		BinaryTreeTraversals.postOrderTraversalIterative(root);
		System.out.println(" ");
				
	}

}
