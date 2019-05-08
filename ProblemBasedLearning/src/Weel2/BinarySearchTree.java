/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weel2;

import java.util.ArrayList;

/**
 *
 * @author Mild-TN
 * http://www.cs.armstrong.edu/liang/intro10e/html/BST.html? 
 */
public class BinarySearchTree<E extends Comparable<E>> {

  public static class Node<E> {

    protected E element;
    protected Node<E> left;
    protected Node<E> right;

    public Node(E e) {
      element = e;
    }
  }

  protected Node<E> root;
  protected int size = 0;

  public BinarySearchTree() {
  }

//  public BinarySearchTree(E[] obj) {
//    for (int i = 0; i < obj.length; i++) {
//      add(obj[i]);
//    }
//  }

  public int getSize() {
    return size;
  }

  public Node<E> getRoot() {
    return root;
  }

  private void add(E name) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public boolean insert(E e) {
    if (root == null) {
      root = createNode(e); // Create a new root
    } else {
      Node<E> parent = null;
      Node<E> current = root;
      while (current != null){
        if (e.compareTo(current.element) < 0) {
          parent = current;
          current = current.left;
        }
        else if (e.compareTo(current.element) > 0) {
          parent = current;
          current = current.right;
        }
        else
          return false; // Duplicate node not inserted
      }
      if (e.compareTo(parent.element) < 0)
        parent.left = createNode(e);
      else
        parent.right = createNode(e);
    }

    size++;
    return true; // Element inserted successfully
  }
  

  protected Node<E> createNode(E e) {
    return new Node<>(e);
  }

  private ArrayList<E> result = new ArrayList<E>();

  public void inorder() {
    inorder(root);
  }

  protected ArrayList<E> inorder(Node<E> root) {
    if (root == null) {
      return result;
    }
    inorder(root.left);
    System.out.print(root.element + " ");
    inorder(root.right);
    return result;
  }
  
   public void preorder() {
    preorder(root);
  }

  protected ArrayList<E> preorder(Node<E> root) {
    if (root == null) return result;
    System.out.print(root.element + " ");
    preorder(root.left);
    preorder(root.right);
    return  result;
  }
  
  public void postorder() {
    postorder(root);
  }

  protected ArrayList<E> postorder(Node<E> root) {
    if (root == null) return result;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.element + " ");
    return  result;
  }

}
