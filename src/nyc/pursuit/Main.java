package nyc.pursuit;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    // write your code here
    MyStack stack = new MyStack();
    stack.pushNode(7);
    stack.pushNode(79);
    stack.pushNode(0);
    stack.pushNode(5);
    stack.popNode();
    stack.popNode();
    stack.popNode();
    stack.popNode();
    if (!stack.isEmpty()) {
      System.out.println(stack.peek());
    }
    stack.pushNode(0);
    stack.pushNode(5);
    System.out.println(stack.peek());

//    recursivePrint(10000);
    String temp = "Stacks are cool";
    System.out.println(reverseStringWithStack(temp));

    LinkedListNode listNode = buildLinkedList();
    printLinkedList(listNode);

    printLinkedList(reverseLinkedList(listNode));
  }

  private static LinkedListNode buildLinkedList() {
    LinkedListNode head = new LinkedListNode(5);
    head.next = new LinkedListNode(7);
    head.next.next = new LinkedListNode(10);
    head.next.next.next = new LinkedListNode(0);
    head.next.next.next.next = new LinkedListNode(5);
    head.next.next.next.next.next = new LinkedListNode(21);
    head.next.next.next.next.next.next = new LinkedListNode(9);
    head.next.next.next.next.next.next.next = new LinkedListNode(17);
    return head;
  }

  public static void recursivePrint(int num) {
    System.out.println("Number: " + num);
    if (num == 0) {
      return;
    } else {
      recursivePrint(++num);
    }
  }

  public static void printLinkedList(LinkedListNode head) {
    LinkedListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ----> ");
      temp = temp.next;
    }
    System.out.print("NIL\n");
  }

  public static LinkedListNode reverseLinkedList(LinkedListNode head) {

    if (head == null || head.next == null) {
      return head;
    }

    LinkedListNode reverseList = head;
    LinkedListNode toDoList = head.next;
    head.next = null;

    while (toDoList != null) {
      LinkedListNode temp = toDoList.next;
      toDoList.next = reverseList;
      reverseList = toDoList;
      toDoList = temp;
    }
    return reverseList;
  }

  public static String reverseStringWithStack(String input) {
    String current = "";
    Stack<Character> characterStack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      characterStack.push(input.charAt(i));
    }
    while (!characterStack.isEmpty()) {
      current += characterStack.pop();
    }
    return current;
  }

}
