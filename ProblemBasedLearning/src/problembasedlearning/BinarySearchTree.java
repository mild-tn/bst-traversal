package problembasedlearning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

public class BinarySearchTree<T extends Comparable<? super T>> {

  T[] content;
  Comparator<T> comparator;

  public BinarySearchTree() {
    this(Comparator.naturalOrder());
  }

  public BinarySearchTree(Comparator<T> comparator) {
    this.comparator = Objects.requireNonNull(comparator);
    content = (T[]) new Comparable[8];
  }

  public void add(T t) {
    Objects.requireNonNull(t);
    add(0, t);
  }

  private void add(int i, T t) {
    if (i >= content.length) {
      resize(i << 1);
    }
    if (content[i] == null) {
      content[i] = t;
    } else if (comparator.compare(content[i], t) > 0) {
      add((i << 1) + 1, t);
    } else {
      add((i + 1) << 1, t);
    }
  }

  private void resize(int size) {
    T[] newContent = (T[]) new Comparable[size];
    System.arraycopy(content, 0, newContent, 0, content.length);
    content = newContent;
  }

  public T search(T t) {
    if (content[0] == null || t == null) {
      return null;
    }
    return search(0, t);
  }

  private T search(int i, T t) {
    if (i >= content.length || content[i] == null) {
      return null;
    }
    int test = comparator.compare(content[i], t);
    if (test > 0) {
      return search((i << 1) + 1, t);
    }
    if (test < 0) {
      return search((i + 1) << 1, t);
    }
    return content[i];
  }

  public T search(Predicate<T> p) {
    for (T t : content) {
      if (t != null && p.test(t)) {
        return t;
      }
    }
    return null;
  }

  private ArrayList<T> result = new ArrayList<>();

  public void inorder() {
    inorder(0);
  }

  public ArrayList<T> inorder(int i) {
    if (i >= content.length || content[i] == null) {
      return result;
    }
    inorder((i << 1) + 1);
    System.out.print(content[i] + " ");
    inorder((i + 1) << 1);
    return result;
  }

  public void preorder() {
    preorder(0);
  }

  public ArrayList<T> preorder(int i) {
    if (i >= content.length || content[i] == null) {
      return result;
    }
    System.out.print(content[i] + " ");
    preorder((i << 1) + 1);
    preorder((i + 1) << 1);
    return result;
  }

  public void postorder() {
    postorder(0);
  }

  public ArrayList<T> postorder(int i) {
    if (i >= content.length || content[i] == null) {
      return result;
    }
    postorder((i << 1) + 1);
    postorder((i + 1) << 1);
    System.out.print(content[i] + " ");
    return result;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    toString(0, s, "");
    return s.toString();
  }

  private void toString(int i, StringBuilder s, String indent) {
    if (i >= content.length || content[i] == null) {
      return;
    }
    s.append(indent).append(content[i]).append("\n");
    toString((i << 1) + 1, s, indent + "-lt> ");
    toString((i + 1) << 1, s, indent + "-rt> ");

  }

}
