package org.arpit.java2blog.binarysearchtree;

public class SortedLinkedListToBSTMain {

	private Node head;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;

		}
	}

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public static void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// Find length of linked list using iterative method
	public int lengthOfLinkedList()
	{
		Node temp=head;
		int count = 0;
		while(temp!=null)
		{
			temp=temp.next;
			count++; 
		}
		return count;
	}

	public TreeNode convertSortedLinkedListToBST(int n)
	{
		/* Base Case for recursion*/
		if (n <= 0) 
			return null;

		/* Recursively creating the left subtree */
		TreeNode left = convertSortedLinkedListToBST(n / 2);

		/* Create a root node*/
		TreeNode root = new TreeNode(head.value);

		// Set pointer to left subtree
		root.left = left;
		head = head.next;
		/* Create right subtree with remaining nodes*/
		root.right = convertSortedLinkedListToBST(n - n / 2 - 1);

		return root;
	}
	public static void main(String[] args) {
		SortedLinkedListToBSTMain list = new SortedLinkedListToBSTMain();
		// Creating a linked list
		Node head = new Node(10);
		list.addToTheLast(head);
		list.addToTheLast(new Node(20));
		list.addToTheLast(new Node(30));
		list.addToTheLast(new Node(40));
		list.addToTheLast(new Node(50));
		list.addToTheLast(new Node(60));
		list.addToTheLast(new Node(70));
		list.addToTheLast(new Node(80));
		list.addToTheLast(new Node(90));
		System.out.println("Printing linked list :");
		list.printList(head);
		int n =list.lengthOfLinkedList();

		TreeNode bst=list.convertSortedLinkedListToBST(n);
		System.out.println("---------------");
		System.out.println("Pre order traversal of binary search tree :");
		preOrder(bst);

	}

}