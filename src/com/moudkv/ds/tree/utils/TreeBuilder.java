/**
 * 
 */
package com.moudkv.ds.tree.utils;

import com.moudkv.ds.tree.TreeNode;

/**
 * @author Vamsi
 *
 */
public class TreeBuilder {
	
	/**
	 * @return TreeNode - root node for the tree
	 * This method creates a binary search tree with sample values
	 * 
	 * 					7
	 *                 / \
	 *                /   \
	 *               /     \
	 *              1       9
	 *             / \     / \
	 *            /   \   /   \
	 *           0     3 8    10
	 *                / \
	 *               /   \
	 *              2     5
	 *                   / \
	 *                  /   \
	 *                 4     6
	 * 
	 */
	public TreeNode buildBinarySearchTree() {
		TreeNode four = new TreeNode(4, null, null);
		TreeNode six = new TreeNode(6, null, null);
		TreeNode five = new TreeNode(5, four, six);
		TreeNode two = new TreeNode(2, null, null);
		TreeNode three = new TreeNode(3, two, five);
		TreeNode zero = new TreeNode(0, null, null);
		TreeNode one = new TreeNode(1, zero, three);
		TreeNode eight = new TreeNode(8, null, null);
		TreeNode ten = new TreeNode(10, null, null);
		TreeNode nine = new TreeNode(9, eight, ten);
		TreeNode seven = new TreeNode(7, one, nine);
		return seven;
	}

}
