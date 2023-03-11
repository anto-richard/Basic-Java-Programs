//Java Program to find area of rhombus..

import java.util.*;
public class RhombusArea
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the diagonal 1: ");
        int x = s.nextInt();
        System.out.print("Enter the length of the diagonal 2: ");
        int y = s.nextInt();

        int area =(x * y)/2;
        System.out.println("The area of the rhombus is " + area);
    }
}
