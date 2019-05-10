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
class QueueFullException extends Exception {
  public QueueFullException() {
    System.out.println("Is Full");
  }
}
