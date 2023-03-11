// Java program to print multiplication table of given number...

import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to print the multiplication table : ");
        int z = s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(z+" * "+i+" = "+(z*i));
        }
    }
}