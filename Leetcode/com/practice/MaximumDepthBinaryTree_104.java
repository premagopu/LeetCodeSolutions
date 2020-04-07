package com.practice;

import com.practice.helper.Node;

public class MaximumDepthBinaryTree_104 {
	
	Node root;

	int maxDepth(Node root) {
		if (root == null)
			return 0;

		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);

		if (leftDepth > rightDepth)
			return (leftDepth + 1);
		else
			return (rightDepth + 1);

		// return (root == null)? 0 : Math.max(maxDepth(root.left) +1, maxDepth(root.right)+1);
	}

	public static void main(String[] args) {
		MaximumDepthBinaryTree_104 tree = new MaximumDepthBinaryTree_104();
		tree.root = new Node(3);
		tree.root.left = new Node(9);
		tree.root.right = new Node(20);
		tree.root.right.left = new Node(15);
		tree.root.right.right = new Node(7);
		System.out.println("Max depth: " + tree.maxDepth(tree.root));
	}

}
