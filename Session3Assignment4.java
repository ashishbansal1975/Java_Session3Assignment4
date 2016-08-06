import java.util.Scanner;
public class Session3Assignment4
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);      
       int num1, num2;

       System.out.println("Design of Basic Calculator having features like Add, Subtract, Multiply and Division");
       System.out.println();
       System.out.print("Enter the first number: ");
       num1 = sc.nextInt();
       System.out.println();
       System.out.print("Enter the second number: ");
       num2 = sc.nextInt();

       //System.out.println("Simple Calculator");

        System.out.println("\nSELECT THE OPERATION TO BE PERFORMED:");
        System.out.println(" Enter 1 for Addition (+)");
        System.out.println(" Enter 2 for Subtraction (-)");
        System.out.println(" Enter 3 for Multiplication (*)");
        System.out.println(" Enter 4 for Division (/)");

        System.out.print("\nEnter your choice : ");
        int choice = sc.nextInt();
        System.out.println();


        if (choice == 1)
        {
            System.out.println("\nAddition of : " + num1 + " + " + num2 + " = " + (num1 + num2));
            
        }
        else if (choice == 2){
            System.out.println("\nSubtraction of : " + num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (choice == 3){
            System.out.println("\nMultiplication of : " + num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (choice == 4){
            System.out.println("\nDivision of : " + num1 + " / " + num2 + " = " + (num1 / num2));
        }
       else
       {
           System.out.println("You have entered the wrong choice.Please try agagin later....");
        }

        System.out.println();
        
   }
}