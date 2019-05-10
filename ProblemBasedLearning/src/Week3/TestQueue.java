/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

/**
 *
 * @author Mild-TN
 */
public class TestQueue {
  public static void main(String[] args) throws QueueFullException, Exception {
    Queue q = new Queue(3);
    
    q.offer("X");
    q.offer(24);
    q.offer(24);
//    q.offer("K");
    
//    System.out.println(q.size());
    System.out.println(q.poll());
    System.out.println(q.poll());
    System.out.println(q.poll());
    
  }
}
