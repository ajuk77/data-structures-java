package com.cs.ajinkya.data_structures.tree;

public class App {
	
	public static void main(String[] args) {
		
	}
	
	public static BinaryTreeNode getTree() {
		BinaryTreeNode root = null;
		root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		root.left = node2;
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		root.right = node3;
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		node2.left = node4;
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		node2.right = node5;
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		node3.left = node6;
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		node3.right = node7;
		return root;
	}

}
