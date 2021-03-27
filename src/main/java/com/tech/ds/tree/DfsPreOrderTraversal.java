package com.tech.ds.tree;

public class DfsPreOrderTraversal {

	public static void main(String[] args) {
		   Node rootNode = TreeUtils.buildTree();
		   preOrder(rootNode);

	}
	
	public static void preOrder(Node root) {
		
		
		if(root==null) {
			return;
		}
		
		System.out.println(root.getData());
		preOrder(root.getLeftChild());
		preOrder(root.getRightChild());				
	}

}
