package com.cs.ajinkya.data_structures.tree;

public class RecursiveOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTreeNode root = App.getTree();
		
		System.out.println("Preorder traversal :");
		preorder(root);
		System.out.println();
		
	}
	
	public static void preorder(BinaryTreeNode root) {
		if(root!= null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	
	
	

}
