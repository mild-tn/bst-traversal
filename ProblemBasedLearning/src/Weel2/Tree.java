/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weel2;

/**
 *
 * @author Mild-TN
 */
interface Tree<E> {

  public boolean search(E e);

  public boolean insert(E e);

  public void inorder();

  public void postorder();

  public void preorder();

  public int getSize();

  public boolean delete(E e);

  public java.util.Iterator<E> iterator();
  public void clear();

}
