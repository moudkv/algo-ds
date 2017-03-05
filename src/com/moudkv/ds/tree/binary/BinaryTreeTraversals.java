/**
 * 
 */
package com.moudkv.ds.tree.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import com.moudkv.ds.tree.TreeNode;

/**
 * @author Vamsi
 * Class contains various ways to traverse a binary tree
 */
public class BinaryTreeTraversals {
	
	// RECURSIVE

	/**
	 * PreOrder traversal using recursive calls - V.L.R
	 * @param root
	 */
	public static void preOrderTraversalRecursive(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.getValue() + " ");
		preOrderTraversalRecursive(root.getLeft());
		preOrderTraversalRecursive(root.getRight());
	}
	
	/**
	 * InOrder traversal using recursive calls - L.V.R
	 * @param root
	 */
	public static void inOrderTraversalRecursive(TreeNode root) {
		if(root == null) {
			return;
		}		
		inOrderTraversalRecursive(root.getLeft());
		System.out.print(root.getValue() + " ");
		inOrderTraversalRecursive(root.getRight());
	}
	
	/**
	 * PostOrder traversal using recursive calls - L.R.V
	 * @param root
	 */
	public static void postOrderTraversalRecursive(TreeNode root) {
		if(root == null) {
			return;
		}		
		postOrderTraversalRecursive(root.getLeft());
		postOrderTraversalRecursive(root.getRight());
		System.out.print(root.getValue() + " ");
	}
	
	// ITERATIVE
	
	/**
	 * PreOrder traversal with iterative calls using a stack - V.L.R
	 * @param root
	 */
	public static void preOrderTraversalIterative(TreeNode root) {
		if(root == null) {
			return;
		}		
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		
		while(!s.isEmpty()) {
			TreeNode currentNode = s.pop();
			System.out.print(currentNode.getValue() + " ");
			
			if(currentNode.getRight()!=null) {
				s.push(currentNode.getRight());
			}
			if(currentNode.getLeft()!=null) {
				s.push(currentNode.getLeft());			
			}			
		}
	}
	
	/**
	 * InOrder traversal with iterative calls using a stack - L.V.R
	 * @param root
	 */
	public static void inOrderTraversalIterative(TreeNode root) {
		if(root == null) {
			return;
		}		
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode currentNode = root;
		while(!s.isEmpty() || currentNode!=null) {

			if(currentNode!=null) {
				s.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				currentNode = s.pop();
				System.out.print(currentNode.getValue() + " ");
			    currentNode = currentNode.getRight();
			}
			
		}		
	}
	
	/**
	 * PostOrder traversal with iterative calls using a stack - L.R.V
	 * @param root
	 */
	public static void postOrderTraversalIterative(TreeNode root) {
		if(root == null) {
			return;
		}		
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()) {
			TreeNode tempNode = s.peek();
			if(tempNode.getLeft()==null && tempNode.getRight()==null) {
				TreeNode poppedNode = s.pop();
				System.out.print(poppedNode.getValue() + " ");
			} else {
				if(tempNode.getRight()!=null) {
					s.push(tempNode.getRight());
					tempNode.setRight(null);
				}
				if(tempNode.getLeft()!=null) {
					s.push(tempNode.getLeft());
					tempNode.setLeft(null);
				}
			}
			
		}		
	}
	
	/**
	 * Level Order traversal 
	 * @param root
	 */
	public static void levelOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		TreeNode currentNode = root;
		List<List<TreeNode>> levelList = new ArrayList<List<TreeNode>>();
		List<TreeNode> currentLevel = new LinkedList<TreeNode>();
		currentLevel.add(currentNode);
		levelList.add(currentLevel);
		
		getNextLevel(currentLevel, levelList);

		ListIterator<List<TreeNode>> itr = levelList.listIterator();
		while(itr.hasNext())	{
			List<TreeNode> lst = (List<TreeNode>) itr.next();
			ListIterator<TreeNode> itrLst = lst.listIterator();
			System.out.print("[ ");
			while(itrLst.hasNext()) {
				System.out.print(itrLst.next().getValue() + " ");
			}
			System.out.println("]");
		}
 	}
	
	private static void getNextLevel(List<TreeNode> currentlevel, 
			List<List<TreeNode>> levelList) {
		ListIterator<TreeNode> itr = currentlevel.listIterator();
		List<TreeNode> nextLevel = new LinkedList<TreeNode>();
		while(itr.hasNext()) {
			TreeNode currentNode = (TreeNode) itr.next();
			if(currentNode.getLeft()!=null) nextLevel.add(currentNode.getLeft());
			if(currentNode.getRight()!=null) nextLevel.add(currentNode.getRight());
		}
		if(nextLevel.size() > 0)	{
			levelList.add(nextLevel);
			getNextLevel(nextLevel, levelList);
		}		
	}
}
