/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problembasedlearning;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mild-TN
 */
public class BstTraversal<E extends Comparable<E>> {

  public int size;
  public Node<E> root;

  public Node<E> getRoot() {
    return root;
  }

  public int getSize() {
    return size;
  }

  public class Node<E> {

    private E element;
    private Node<E> left;
    private Node<E> right;

    public Node(E element) {
      this.element = element;
    }
  }

  public Node<E> createNode(E e) {
    return new Node<>(e);
  }

  public boolean insert(E e) {
    if (root == null) {
      root = createNode(e);
    } else {
      Node<E> parent = null;
      Node<E> current = root;
      while (current != null) {
        if (e.compareTo(current.element) < 0) {
          parent = current;
          current = current.left;
        } else if (e.compareTo(current.element) > 0) {
          parent = current;
          current = current.right;
        } else {
          return false;
        }
      }

      if (e.compareTo(parent.element) < 0) {
        parent.left = createNode(e);
      } else {
        parent.right = createNode(e);
      }

    }

    size++;
    return true;
  }

  private ArrayList<E> result = new ArrayList<>();

  public void inOrder() {
    inOrder(root);
  }

  private ArrayList<E> inOrder(Node<E> root) {
    if (root == null) {
      return result;
    }

    inOrder(root.left);
    System.out.print(root.element + " ");
    inOrder(root.right);

    return result;
  }
  
  public void postOrder() {
    postOrder(root);
  }

  private ArrayList<E> postOrder(Node<E> root) {
    if (root == null) {
      return result;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.element + " ");

    return result;
  }
  
  public void preOrder() {
    preOrder(root);
  }

  private ArrayList<E> preOrder(Node<E> root) {
    if (root == null) {
      return result;
    }

    System.out.print(root.element + " ");
    preOrder(root.left);
    preOrder(root.right);

    return result;
  }

}
