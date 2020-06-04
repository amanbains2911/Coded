/**
 * 
 */
package com.main.java;
/**
 * @author amanb
 *
 */
public class BinarySearchTreeSorting {

//Node declaration 
 class Node 
{ 
	int data; 
	public Node left; 
	public Node right; 
	Node(int data) 
	{ 
		this.data = data; 
		left = right = null; 
	} 
} 

 static class GFG 
{ 

	// Function to insert data in BST 
	public static Node insert(Node root, int data) 
	{ 
		if (root == null) 
			return root; 
		if (data < root.data) 
			root.left = insert(root.left, data); 
		if (data > root.data) 
			root.right = insert(root.right, data); 
		return root; 
	} 

	// InOrder function to display value of array 
	// in sorted order 
	public static void inOrder(Node root) 
	{ 
		if (root == null) 
			return; 
		inOrder(root.left); 
		System.out.print(root.data+" "); 
		inOrder(root.right); 
	} 

	// Driver Code 
	public static void main(String []args){ 
		int arr[] = { 1, 2, 3, 2, 5, 4, 4 }; 
		int n = arr.length; 
		Node root = null; 
		for (int i = 0; i < n; i++) 
		{ 
			root = insert(root,arr[i]); 
		} 

		inOrder(root); 
	} 
   } 
}
//This code is contributed by anishma 
