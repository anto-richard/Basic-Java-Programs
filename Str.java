// Java program to convert a string to an integer.....

import java.util.*;

public class Str {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an string: ");

        if(s.hasNextInt())
        {
            int n = s.nextInt();
            System.out.println("The integer value is " + n);
        } else
        {
            System.out.println("Invalid input, please enter an integer.");
        }
    }
}
