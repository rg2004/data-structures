package com.tech.ds.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BfsTraversal {

	public static void main(String[] args) {
	   	
       Node rootNode = TreeUtils.buildTree();
       breadthFirst(rootNode);
       
	}
	
	
	public static void breadthFirst(Node root) {
		if(root==null) {
			return;
		}
		
		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		
		queue.add(root);
		while(!queue.isEmpty()) {
			
			Node node = queue.poll();
			
			System.out.println(node.getData());
			
			if(node.getLeftChild()!=null) {
				queue.add(node.getLeftChild());
			}
			
			if(node.getRightChild()!=null) {
				queue.add(node.getRightChild());
			}			
		}			
	}
	

}
