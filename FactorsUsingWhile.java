/* 
@author Vedh
 */
import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            int counter = 1;

            System.out.println("Factors of " + number + " are:");

            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}