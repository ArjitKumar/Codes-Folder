import java.util.*;
import java.io.*;
public class duplicatebrackets {
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
    String str = scn.nextLine();

    Stack<Character> st;
    st = new Stack<>();

    for( int i = 0 ; i < str.length() ; i++) {
         char ch = str.charAt(i);

         if( ch == ')') {
                     
             if( st.peek() == '(') {
              System.out.println(true);
              return;
             }else {
              while( st.peek() != '(') {
                st.pop();
              }
              st.pop();
             }

         }else {
          st.push(ch);
         }
    }


    System.out.println(false);


  }























}








