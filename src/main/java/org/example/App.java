package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        String buf;
        String state;
        double amount;
        double tax = 0.055;
        double total;


        Scanner sc = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        buf = sc.nextLine();
        amount = Double.parseDouble(buf);

        System.out.print("What is the state? ");
        state = sc.nextLine();

        total = amount;

        if(state.equals("WI"))
        {
            total = total + (tax * amount);
            System.out.printf("The subtotal is $%.2f.\n", amount);
            System.out.printf("The tax is $%.2f.\n", (tax * amount));
        }

        System.out.printf("The total is $%.2f.\n", total);

        sc.close();
    }
}
