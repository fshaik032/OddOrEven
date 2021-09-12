/*
 * Faaris Shaik
 * 9/21/16
 * Odd or Even
 */
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        //declaring the variables
        int num;

        //changes
        System.out.println("New change, let's see what happens")
        
        
        //acquiring input
        System.out.println("Enter a positive integer.");
        num=input.nextInt();

        //if statements
        if (num%2==1) {
            System.out.println("Your number is odd.");
        }
        else {
            System.out.println("Your number is even.");
            input.close();
        }
    }
}
