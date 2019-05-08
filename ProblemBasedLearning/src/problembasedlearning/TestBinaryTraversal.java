/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problembasedlearning;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Mild-TN
 */
public class TestBinaryTraversal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BstTraversal bst = new BstTraversal();
    System.out.print("Input : ");
    String line = sc.nextLine();
    StringTokenizer st = new StringTokenizer(line, " ");
    while (st.hasMoreTokens()) {
      String str = st.nextToken();
      for (int i = 0; i < str.length(); i++) {
        int num = Integer.parseInt(str);
        bst.insert(num);
      }
    }

    System.out.print("Inoder : ");
    bst.inOrder();
    System.out.print("\n");
    System.out.print("Postoder : ");
    bst.postOrder();
    System.out.print("\n");
    System.out.print("Preoder : ");
    bst.preOrder();
    System.out.print("\n");
  }
}
