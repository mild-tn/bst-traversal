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
 */
public class BST<E extends Comparable<E>> {
  protected TreeNode<E> root;
  protected int size = 0;

  public BST() {
  }

  public BST(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

//  public boolean search(E e) {
//    TreeNode<E> current = root; // Start from the root
//
//    while (current != null) {
//      if (e.compareTo(current.element) < 0) {
//        current = current.left;
//      }
//      else if (e.compareTo(current.element) > 0) {
//        current = current.right;
//      }
//      else // element matches current.element
//        return true; // Element is found
//    }
//
//    return false;
//  }

  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e); // Create a new root
    else {
      TreeNode<E> parent = null;
      TreeNode<E> current = root;
      while (current != null)
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

      if (e.compareTo(parent.element) < 0)
        parent.left = createNewNode(e);
      else
        parent.right = createNewNode(e);
    }

    size++;
    return true; // Element inserted successfully
  }

  protected TreeNode<E> createNewNode(E e) {
    return new TreeNode<>(e);
  }
  
  private ArrayList<E> result = new ArrayList<E>();
  
  public void inorder() {
    inorder(root);
  }
  
  protected ArrayList<E> inorder(TreeNode<E> root) {
    if (root == null) return result;
    inorder(root.left);
    System.out.print(root.element + " ");
    inorder(root.right);
    return  result;
  }

//  public void postorder() {
//    postorder(root);
//  }
//
//  protected void postorder(TreeNode<E> root) {
//    if (root == null) return;
//    postorder(root.left);
//    postorder(root.right);
//    System.out.print(root.element + " ");
//  }
//
//  public void preorder() {
//    preorder(root);
//  }
//
//  protected void preorder(TreeNode<E> root) {
//    if (root == null) return;
//    System.out.print(root.element + " ");
//    preorder(root.left);
//    preorder(root.right);
//  }

  private void add(E object) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public static class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
      element = e;
    }
  }

  public int getSize() {
    return size;
  }

  public TreeNode<E> getRoot() {
    return root;
  }

//  public java.util.ArrayList<TreeNode<E>> path(E e) {
//    java.util.ArrayList<TreeNode<E>> list =
//      new java.util.ArrayList<>();
//    TreeNode<E> current = root; // Start from the root
//
//    while (current != null) {
//      list.add(current); // Add the node to the list
//      if (e.compareTo(current.element) < 0) {
//        current = current.left;
//      }
//      else if (e.compareTo(current.element) > 0) {
//        current = current.right;
//      }
//      else
//        break;
//    }
//
//    return list; // Return an array list of nodes
//  }


//  public boolean delete(E e) {
//    TreeNode<E> parent = null;
//    TreeNode<E> current = root;
//    while (current != null) {
//      if (e.compareTo(current.element) < 0) {
//        parent = current;
//        current = current.left;
//      }
//      else if (e.compareTo(current.element) > 0) {
//        parent = current;
//        current = current.right;
//      }
//      else
//        break; // Element is in the tree pointed at by current
//    }
//
//    if (current == null)
//      return false; // Element is not in the tree
//
//    if (current.left == null) {
//      if (parent == null) {
//        root = current.right;
//      }
//      else {
//        if (e.compareTo(parent.element) < 0)
//          parent.left = current.right;
//        else
//          parent.right = current.right;
//      }
//    }
//    else {
//      TreeNode<E> parentOfRightMost = current;
//      TreeNode<E> rightMost = current.left;
//
//      while (rightMost.right != null) {
//        parentOfRightMost = rightMost;
//        rightMost = rightMost.right; // Keep going to the right
//      }
//
//      current.element = rightMost.element;
//
//      if (parentOfRightMost.right == rightMost)
//        parentOfRightMost.right = rightMost.left;
//      else
//        parentOfRightMost.left = rightMost.left;     
//    }
//
//    size--;
//    return true; // Element deleted successfully
//  }

//  public java.util.Iterator<E> iterator() {
//    return new InorderIterator();
//  }

//  private class InorderIterator implements java.util.Iterator<E> {
//    private java.util.ArrayList<E> list =
//      new java.util.ArrayList<>();
//    private int current = 0; // Point to the current element in list
//
//    public InorderIterator() {
//      inorder(); // Traverse binary tree and store elements in list
//    }
//
//    private void inorder() {
//      inorder(root);
//    }
//
//    private void inorder(TreeNode<E> root) {
//      if (root == null)return;
//      inorder(root.left);
//      list.add(root.element);
//      inorder(root.right);
//    }
//
//    @Override /** More elements for traversing? */
//    public boolean hasNext() {
//      if (current < list.size())
//        return true;
//
//      return false;
//    }
//
//    @Override /** Get the current element and move to the next */
//    public E next() {
//      return list.get(current++);
//    }
//
//    @Override /** Remove the current element */
//    public void remove() {
//      delete(list.get(current)); // Delete the current element
//      list.clear(); // Clear the list
//      inorder(); // Rebuild the list
//    }
//  }
  
  public void clear() {
    root = null;
    size = 0;
  }
}