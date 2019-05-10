package problembasedlearning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BSTTest {

  public static void main(String[] args) {
//    binarySearchTreeToString();
    Integer x[] = {9, 2, 31, 3, 10, 2};
//    Arrays.sort(x);
    BSTTest.InsertionSort(x);
//    int n = removeDuplicates(x, x.length);
//    for (int i = 0; i < n; i++) {
//      System.out.print(x[i] + " ");
//    }

    
  }

  private static void binarySearchTreeToString() {

    BinarySearchTree<X> bst = new BinarySearchTree<>();
    bst.add(new X(7));
    bst.add(new X(2));
    bst.add(new X(11));
    bst.add(new X(1));
    bst.add(new X(6));
    bst.add(new X(8));
    bst.add(new X(12));
    System.out.print("Inorder : ");
    bst.inorder();
    System.out.print("\n");
    System.out.print("Preorder : ");
    bst.preorder();
    System.out.print("\n");
    System.out.print("Postorder : ");
    bst.postorder();
    System.out.print("\n");

  }

  public static void InsertionSort(Comparable x[]) {
    //Integer[] x = {9, 2, 31, 3, 10, 2};
    for (int i = 1; i < x.length; i++) {
      Comparable tmp = x[i];
      int j = i;
      for (; j > 0 && tmp.compareTo(x[j - 1]) < 0; j--) {
        if (tmp.compareTo(x[j - 1]) == 0) {
          tmp = -1;
        }
        x[j] = x[j - 1];
      }
      x[j] = tmp;
    }
  }

  static int removeDuplicates(int arr[], int n) {
    // Return, if array is empty 
    // or contains a single element 
    if (n == 0 || n == 1) {
      return n;
    }

    int[] temp = new int[n];

    // Start traversing elements 
    int j = 0;
    for (int i = 0; i < n - 1; i++) // If current element is not equal 
    // to next element then store that 
    // current element 
    {
      if (arr[i] != arr[i + 1]) {
        temp[j++] = arr[i];
      }
    }

    // Store the last element as whether 
    // it is unique or repeated, it hasn't 
    // stored previously 
    temp[j++] = arr[n - 1];

    // Modify original array 
    for (int i = 0; i < j; i++) {
      arr[i] = temp[i];
    }

    return j;
  }

  private static X randomX() {
    Random rand = new Random();
    return new X(rand.nextInt(900) + 100);
  }

}

class X implements Comparable<X> {

  private final int id;
  private final int seq;
  private static int next;

  public X(int id) {
    this.id = id;
    this.seq = next++;
  }

  public int getId() {
    return id;
  }

  public int getSeq() {
    return seq;
  }

  @Override
  public int compareTo(X x) {
    return this.id - x.id;
  }

  @Override
  public String toString() {
    return id + " ";
  }
}
