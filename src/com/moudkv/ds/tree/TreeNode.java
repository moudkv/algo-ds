/**
 * 
 */
package com.moudkv.ds.tree;

/**
 * @author Vamsi
 * Base TreeNode class, works as basis for constructing trees.
 */
public class TreeNode {
	
	private int value;
	private TreeNode left;
	private TreeNode right;

	/**
	 * Constructor using using children and values 
	 * @param value
	 * @param left
	 * @param right
	 */
	public TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * Default Constructor
	 */
	public TreeNode() {
		
	}
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * @return the left
	 */
	public TreeNode getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public TreeNode getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode right) {
		this.right = right;
	}	
	
}
