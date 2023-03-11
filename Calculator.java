// Java program to create a simple calculator...
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter an operator to perform 1.Addition, 2.Subtraction, 3.Multiplication, 4.Division: ");
        int option = s.nextInt();
        int result;
        switch(option){
            case 1:
                result = num1 + num2;
                System.out.println("Addition of the two numbers is : " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction of the two numbers is : " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication of the two numbers is : " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Division of the two numbers is : " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
