/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problembasedlearning;

import java.util.Stack;

/**
 *
 * @author Mild-TN
 */
public class ProblemBasedLearning {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String str = "[]";
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '{' || str.charAt(i) == '['|| str.charAt(i) == '(' ) {
        stack.push(str.charAt(i));
      }else if(!stack.empty() && (str.charAt(i) == ']' && stack.peek() == '[' ||
              str.charAt(i) == '}' && stack.peek() == '{' ||
              str.charAt(i) == ')' && stack.peek() == '(')){
        stack.pop();
      }else{
        stack.push(str.charAt(i));
      }
    }
    if(stack.empty()){
      System.out.println("Balance");
    }else{
      System.out.println("Not Balance");
    }
  }

}
