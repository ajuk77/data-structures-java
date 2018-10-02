package com.cs.ajinkya.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

public class NonRecursiveOrderTraversal {

	public static void main(String[] args) {
		
		BinaryTreeNode root = App.getTree();
		List<Integer> treeNodes = inorder(root);
		System.out.println(treeNodes);
		

	}

	public static List<Integer> inorder(BinaryTreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (null == root) {
			return result;
		}
		BinaryTreeNode temp = root;
		java.util.Stack<BinaryTreeNode> nodes = new java.util.Stack<BinaryTreeNode>();
		while (temp != null || !nodes.isEmpty()) {
			while (temp != null) {
				nodes.push(temp);
				temp = temp.left;
			}
			temp = nodes.pop();
			result.add(temp.data);
			temp = temp.right;
		}

		return result;

	}

}
