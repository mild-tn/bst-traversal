package problembasedlearning;

import java.util.Random;

public class BSTTest {

  public static void main(String[] args) {
    binarySearchTreeToString();
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
