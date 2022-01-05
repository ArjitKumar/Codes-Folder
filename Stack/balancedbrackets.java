
                          // BALANCED PARANTHESIS

// import java.util.*;
// import java.io.*;
// public class balancedbrackets {
//   public static void main(String[] args) {
//     // do not delete
//     try {
//       System.setIn(new FileInputStream("input.txt"));
//       System.setOut(new PrintStream(new FileOutputStream("output.txt")));
//     } catch (Exception e) {



//       System.err.println("Error");
//       System.err.println("Error");
//     }
//    // do not delete

//     Scanner scn = new Scanner(System.in);
//     String str = scn.nextLine();

//  //      st = new Stack<>();

//     for( int i = 0 ;  i < str.length() ; i++ ){
//                 char ch = str.charAt(i);

//       if( ch == '(' || ch == '{' || ch == '['){
//                    st.push(ch);
//       }else if( ch == ')') {
//             if( st.size() == 0 || st.peek() != '(') {
//               System.out.println(false);
//               return;
//             }
//             else st.pop();   

//       } else if( ch == '}'){
//          if( st.size() == 0 || st.peek() != '{') {
//               System.out.println(false);
//               return;
//             }
//             else st.pop();  
//       }else if( ch == ']'){
//               if( st.size() == 0 || st.peek() != '[') {
//               System.out.println(false);
//               return;
//             }
//             else st.pop();  
//       }

//     }

//      if( st.size() == 0) {
//       System.out.println(true);
//      }else {
//       System.out.println(false);
//      }
//     }











                     // NEXT GREATER ELEMENT TO THE RIGHT


import java.util.*;
import java.io.*;
public class balancedbrackets {
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
    // String str = scn.nextLine();
    int n = scn.nextInt();
    int[] arr = new int[n];

    for( int i = 0 ; i < arr.length ; i++) {
          arr[i] = scn.nextInt();
    }

    int max = arr[0];
    for( int i = 0 ; i < arr.length ; i++) {
      for( int j = i + 1 ; j < arr.length ; j++) {
        if( max <= arr[j]) {
          max = arr[j];
          System.out.print(max + " ");
          break;
        }
        else {
          // System.out.print( -1);
        }
      }
    }
    System.out.print(-1);

  }
}

























































