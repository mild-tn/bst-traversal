/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weel2;

import java.util.*;

/**
 *
 * @author Mild-TN
 */
class Node {

  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

public class BinaryTree {

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node current;
      if (data <= root.data) {
        current = insert(root.left, data);
        root.left = current;
      } else {
        current = insert(root.right, data);
        root.right = current;
      }
      return root;
    }
  }

  public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int t = scan.nextInt();
//    Node root = null;
//    while (t-- != 0) {
//      int data = scan.nextInt();
//      root = insert(root, data);
//    }
//    scan.close();
//    inOrder(root);
    BST<Integer> b = new BST<>();
//      
//      b.insert(10);
//      b.insert(1);
//      b.insert(2);
//      b.insert(4);
//      b.inorder();
    b.insert(3);
    b.insert(10);
    b.insert(1);
    b.insert(14);
    b.insert(7);
    b.inorder();
  }

  public static void inOrder(Node root) {
    if (root == null) {
      return ;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }
}
