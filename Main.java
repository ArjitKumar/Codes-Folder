import java.util.*;
import java.io.*;
public class Main
{

    public static void main(String[] args)
    {
        try
        {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        }
        catch (Exception e)
        {
            System.err.println("Error");
            System.err.println("Error");
        }




        Scanner scn =  new Scanner(System.in);
        int w = scn.nextInt();

        if (w % 2 == 0 && w > 2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }








    }
}








