package com.tech.ds.tree;

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

}
