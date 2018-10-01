package com.cs.ajinkya.data_structures.tree;

public class RecursiveOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTreeNode root = App.getTree();
		
		System.out.println("Preorder traversal :");
		preorder(root);
		System.out.println();
		
		System.out.println("Inorder traversal :");
		inorder(root);
		System.out.println();
		
		System.out.println("Postorder traversal :");
		postorder(root);
		System.out.println();
		
	}
	
	public static void preorder(BinaryTreeNode root) {
		if(root!= null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public static void inorder(BinaryTreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public static void postorder(BinaryTreeNode root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	
	
	

}
