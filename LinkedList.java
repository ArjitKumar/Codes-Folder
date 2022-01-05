import java.util.*;
import java.io.*;
// import static java.lang.System.out;
public class LinkedList {

  public static class Node {
    int data;
    Node next;
  }

  public static class LL {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;
      

      if (size == 0) {
        head = tail = temp;

      } else {
        // Linking
        tail.next = temp;
        tail = temp;

      }
      size++; // har bar bdega isilye bahar likha
    }

    void display() {

      if ( head == null) {
        return;
      }
      for ( Node temp = head; temp != null ; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();


    }


    public int size() {
      return size;
    }

    public void removeFirst() {

      if ( size == 0) {
        System.out.println("List is Empty");
      } else if ( size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }
    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {

      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if ( size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if ( idx == 0) {
        addFirst(val);

      } else if ( idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for ( int i = 0 ; i < idx - 1; i++) {
          temp = temp.next;
        }

        // main logic

        node.next = temp.next;
        temp.next = node;
        size++;
      }


    }

    public void removeLast() {
      // write your code here
      if ( size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for ( int i = 0; i < size - 2 ; i++ ) {
          // second last k liye size - 2 ka loop lagega
          temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
      }
    }

    // reverse linked list data iterative

    // we have kept the func private so it can't be used in main
    // it can be used within the class only
    private Node getNodeAt(int idx) {
      Node temp = head;
      for ( int i = 0 ; i < idx ; i++) {
        temp = temp.next;
      }
      return temp; // instead of returning data we are returning the node
    }

    public void reverseDI() {
      int li = 0;
      int ri = size - 1;
      while ( li < ri) {

        Node left = getNodeAt(li);
        Node right = getNodeAt(ri);

        int temp = left.data;
        left.data = right.data;
        right.data = temp;


        li++;
        ri--;
      }
    }
    public void midNode() {   // size property not allowed
      // use 2 pointers only
      if ( head == null) {
        return;
      }
      Node fast = head;
      Node slow = head;
      while ( fast.next != null && fast.next.next != null) {
        fast = fast.next.next;
        slow = slow.next;
      }

      System.out.println(slow.data);
    }

    private void reversePRHelper(Node node) {
      // write your code here
      if ( node == null) {
        return;
      }
      reversePRHelper(node.next);
      if ( node == tail) {

      } else {
        node.next.next = node;
      }



    }

    public void reversePR() {
      // write your code here
      reversePRHelper(head);
      head.next = null;
      Node temp = head;
      head = tail;
      tail = temp;

    }
    public void Palindrome() {

      int left = 0;
      int right = size - 1;
      boolean b = true;

      while ( left < right) {
        Node l = getNodeAt(left);
        Node r = getNodeAt(right);

        if (l.data != r.data) {
          b = false;
          break;
        }
        left++;
        right--;
      }
      System.out.println(b);
    }






  }



  public static void main(String[] args) {
    try {
      System.setIn(new FileInputStream("input.txt"));
      System.setOut(new PrintStream(new FileOutputStream("output.txt")));
    } catch (Exception e) {
      System.err.println("Error");
      System.err.println("Error");
    }



    LL list = new LL();
    list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(20); list.addLast(10); //list.addLast(60);
    // list.display();
    // list.addFirst(5);
    // list.display();
    // list.removeLast();
    // list.display();
    // list.reverseDI();
    list.display();
    // list.midNode();
    list.reversePR();
    list.display();
    list.Palindrome();
    // list.display();
    // System.out.println(list.size());
    // list.removeFirst();
    // list.display();
    // System.out.println(list.size());




  }

















}




