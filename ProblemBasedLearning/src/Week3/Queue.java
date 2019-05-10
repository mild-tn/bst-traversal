/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import Week3.QueueFullException;

/**
 *
 * @author Mild-TN
 */
public class Queue {

  Object[] obj;
  int total;
  int head, tail, qsize;

  public Queue(int size) {
    obj = new Object[size];
    total = 0;
    head = -1;
    tail = 0;
    qsize = size;
  }

  public void offer(Object data) throws QueueFullException {
    try {
      if (isFull()) {
        throw new QueueFullException();
      } else {
        obj[tail] = data;
        tail = (tail + 1) % qsize;
        total++;
      }
    } catch (Exception e) {
    }

  }

  public Object poll() throws Exception {
    Object data = null;
    try {
      if (isEmpty()) {
        throw new NullPointerException();
      } else {
        if (head == -1) {
          head++;
        }
        data = obj[head];
        obj[head] = null;
        head = (head + 1) % qsize;
        total--;
      }
    } catch (Exception e) {
    }
    return data;
  }

  public boolean isFull() {
    if (total == qsize ){
      return true;
    } else {
      return false;
    }
  }

  public boolean isEmpty() {
    if (total == 0) {
      return true;
    } else {
      return false;
    }
  }

  public int size() {
    return total;
  }

}
