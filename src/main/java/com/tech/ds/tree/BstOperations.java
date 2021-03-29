package com.tech.ds.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BstOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int minimumValue(Node root) {
              if(root==null) {
            	  return Integer.MIN_VALUE;
              }
		      if(root.getLeftChild()==null) {
		    	  return (Integer) root.getData();
		      }
		      return minimumValue(root.getLeftChild());
	}

	
	public static int maxDepth(Node root) {
		if(root==null)
			 return 0;
		
		if(root.getLeftChild()==null && root.getRightChild()==null) {
			return 0;
		}
		int leftDepth = 1 + maxDepth(root.getLeftChild());
		int rightDepth = 1 + maxDepth(root.getRightChild());
		
		return Math.max(leftDepth, rightDepth);
		
	}
	
	public static void mirror(Node root) {
		if(root==null) {
			return;
		}
		
		mirror(root.getLeftChild());
		mirror(root.getRightChild());
		
		Node temp = root.getLeftChild();
		root.setLeftChild(root.getRightChild());
		root.setRightChild(temp);				
	}
	
	
	public static int countTrees(int numNodes) {
		if(numNodes<=1) {
			return 1;
		}
		
		int sum=0;
		
		for(int i=0;i<=numNodes;i++) {
			int countLeftTres = countTrees(i-1);
			int countRightTres = countTrees(numNodes-i);
			sum=sum+(countLeftTres * countRightTres);
			
		}
		return sum;	
		
	}
	
	
	public static void printRange(Node root,int low, int high) {
		
		if(root==null) {
			return;
		}		
		
		if(low <= (Integer)root.getData()) {
			printRange(root.getLeftChild(),low,high);
		}
		
		if(low <=  (Integer)root.getData()  && (Integer)root.getData() <= high ) {
			printRange(root.getLeftChild(),low,high);
		}
		
		if(high > (Integer)root.getData()) {
			 printRange(root.getRightChild(),low,high);
		}			
	}
	
	public static boolean isBinarySearchTree(Node root,int min,int max) {
		
		if(root==null) {
			return true;
		}
		
		if((Integer)root.getData()<=min || (Integer)root.getData()> max) {
			return false;
		}
		
		return isBinarySearchTree(root.getLeftChild(), min, (Integer)root.getData())
				    && isBinarySearchTree(root.getRightChild(),(Integer)root.getData(), max);
				
	}
	
	
	public static boolean hasPathSum(Node<Integer> root, int sum) {
		
		if (root.getLeftChild()==null && root.getRightChild()==null) {
			return sum == root.getData();
		}
		int subSum = sum - root.getData();
		
		if(root.getLeftChild()!=null) {
			boolean hasPathSum = hasPathSum(root.getLeftChild(),subSum);
			 if(hasPathSum)
				 return true;
			
		}
		

		if(root.getRightChild()!=null) {
			boolean hasPathSum = hasPathSum(root.getRightChild(),subSum);
			 if(hasPathSum)
				 return true;
			
		}
		
		return false;
	}
	
	public static void printPaths(Node<Integer>  root,List<Node<Integer>> pathList) {
		
		if(root==null) {
			return;
		}
		
		pathList.add(root);
		
		printPaths(root.getLeftChild(),pathList);
		printPaths(root.getRightChild(),pathList);
		
		if(root.getLeftChild()== null && root.getRightChild() ==null){
			System.out.println(pathList);
		}
		
		pathList.remove(root);
	}
	
	public static Node<Integer> leadCommonAncestor(Node<Integer> root,Node<Integer> a,Node<Integer> b){
		
		if(root == null)
			return null;
		
		if(root== a || root == b) {
			return root;
		}
		
		Node<Integer> leftLCA = leadCommonAncestor(root.getLeftChild(),a,b);
		
		Node<Integer> rightLCA = leadCommonAncestor(root.getRightChild(),a,b);
		
		if(leftLCA!=null && rightLCA!=null) {
			 return root;
		}
		
		if(leftLCA!= null) {
			return leftLCA;
		}		
		return rightLCA;
	}
	
   public void printLevelByLevel(Node root){
		
		if(root==null) {
			return;
		}
		
		Queue<Node> q = new LinkedList();

		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node current = q.poll();
			
			System.out.print(current.getData()+" ");
			
			if(current.getLeftChild()!=null)
				q.add(current.getLeftChild());
			
			if(current.getRightChild()!=null)
				q.add(current.getRightChild());
		  }
			
		}
	
		public  void insert(Node<Integer> node,Node<Integer> head) {
			
			if(head==null) {
				head=node;
			}
			else if(node.getData() <head.getData()) {
				if(head.getLeftChild()==null)
				{
					head.setLeftChild(node);
				}
				 else {
				  insert(node,head.getLeftChild());
				}
			}
			else if(node.getData() >head.getData()) {
				if(head.getRightChild()==null)
				{
					head.setRightChild(node);
				}
				 else {
				  insert(node,head.getRightChild());
				}
			}
			
		}

		
		public int depth(Node root) {
			
			if(root==null)
				return 0;
			
			int left = depth(root.getLeftChild());
			int right =depth(root.getRightChild());
			
			if(left>right){
				return 1+left;
			}
			else{
				return 1+right;
			}	        
		}
}
