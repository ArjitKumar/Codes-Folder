import java.util.*;
import java.io.*;
public class stack {
  public static void main(String[] args) {
    // do not delete
    try {
      System.setIn(new FileInputStream("input.txt"));
      System.setOut(new PrintStream(new FileOutputStream("output.txt")));
    } catch (Exception e) {



      System.err.println("Error");
      System.err.println("Error");
    }
   // do not delete

    Scanner scn = new Scanner(System.in);

    Stack<Integer> st;
    st = new Stack<>();


    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.pop();
    System.out.println(st);

    // String str = scn.nextLine();

    // Stack<Character> st = new Stack<>();

    // for ( int i = 0 ; i < str.length(); i++) {

    //   char ch =  str.charAt(i);

    //   if ( ch == ')') {
    //     if (st.peek() == '(') {
    //       System.out.println(true);
    //       return;
    //     } else {
    //       while (st.peek() != '(') {
    //         st.pop();
    //       }
    //       st.pop();
    //     }
    //   } else {
    //     st.push(ch);
    //   }
    // }
    // System.out.println(false);
  }























}








