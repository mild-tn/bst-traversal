/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weel2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mild-TN
 */
public class TestBinarytree {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BinarySearchTree<Integer> b = new BinarySearchTree<>();
    System.out.print("Input : ");
    String str = scan.nextLine();
    String[] number = str.split(" ");//cute white space
    for (int i = 0; i < number.length; i++) {
      int n = Integer.parseInt(number[i]);
      b.insert(n);
    }

    System.out.print("InOder : ");
    b.inorder();
    System.out.print("\n");
    System.out.print("PreOder : ");
    b.preorder();
    System.out.print("\n");
    System.out.print("PostOder : ");
    b.postorder();
    System.out.print("\n");
  }
}
