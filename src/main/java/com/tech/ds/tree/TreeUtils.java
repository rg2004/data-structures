package com.tech.ds.tree;

public class TreeUtils {

	
	public static Node buildTree() {
		
		Node root=new Node();
		root.setData(10);
		
		Node leftChild1=new Node();
		leftChild1.setData(12);
		
		Node rightChild1=new Node();
		rightChild1.setData(6);
		
		root.setLeftChild(leftChild1);		
		root.setRightChild(rightChild1);
		
		
		
		Node leftChild2=new Node();
		leftChild2.setData(19);
		
		Node rightChild2=new Node();
		rightChild2.setData(17);
		
		leftChild1.setLeftChild(leftChild2);
		leftChild1.setRightChild(rightChild2);
		
		
		
		
		Node leftChild3=new Node();
		leftChild3.setData(13);
		
		Node rightChild3=new Node();
		rightChild3.setData(20);
		
		rightChild1.setLeftChild(leftChild3);
		rightChild1.setRightChild(rightChild3);
		
		return root;
		
		
	}
	
}
