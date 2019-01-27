package nyc.pursuit;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack {

  private StackNode top;

  public MyStack() {
    top = null;
  }

  public void pushNode(int data) {
    if (top == null) {
      top = new StackNode(data);
      return;
    }
    StackNode temp = new StackNode(data);
    temp.next = top;
    top = temp;
  }

  public StackNode popNode() {
    if (top == null) {
      throw new EmptyStackException();
    }
    StackNode temp = top;
    top = top.next;
    return temp;
  }

  public int peek() {
    if (top == null) {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  public boolean isEmpty() {
    if (top == null) {
      return true;
    }
    return false;
  }

  public void printStack() {
    StackNode temp = top;
    System.out.println("_____");
    while (temp != null) {
      System.out.println("| " + temp.data + " |");
      System.out.println("_______");
      temp = temp.next;
    }
  }

}
