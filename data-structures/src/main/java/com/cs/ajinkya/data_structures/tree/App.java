package com.cs.ajinkya.data_structures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {

	public static void main(String[] args) {

	}

	public static BinaryTreeNode getTree() {
		List<Integer> treeNodes = new ArrayList<Integer>();
		treeNodes.add(1);
		treeNodes.add(2);
		treeNodes.add(3);
		treeNodes.add(4);
		treeNodes.add(5);
		treeNodes.add(6);
		treeNodes.add(7);

		BinaryTreeNode root = null;
		for (int data : treeNodes) {
			root = createBinaryTree(root, data);
		}
		return root;

	}

	public static BinaryTreeNode createBinaryTree(BinaryTreeNode root, int data) {
		if (root == null) {
			root = new BinaryTreeNode(data);
			return root;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		BinaryTreeNode temp = null;
		while (!queue.isEmpty()) {
			temp = queue.poll();
			if (temp != null) {
				if (temp.left != null) {
					queue.offer(temp.left);
				} else {
					temp.left = new BinaryTreeNode(data);
					return root;
				}
				if (temp.right != null) {
					queue.offer(temp.right);
				} else {
					temp.right = new BinaryTreeNode(data);
					return root;
				}

			}

		}
		return root;

	}

	public static BinaryTreeNode getStaticTree() {

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
