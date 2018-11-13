package dos;
import java.util.Scanner;
public class guessinggame {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int guess, real, counter;
        do 
        {
            System.out.println("Enter number to be guess: ");
            real = scan.nextInt();
        }
            while ((real < 0) || (real > 1000));
        counter = 0;
        do
        {
            System.out.println("Enter your Guess: ");
            guess = scan.nextInt();
            if (counter == 0)
            {
                counter++;
                if (real%2 == 0)
                    System.out.println("HINT: The number is Even.");
                else
                    System.out.println("HINT: The number is Odd.");
            }
            else
            {
                if (guess > real)
                {
                    System.out.println("HINT: You need a lower number.");
                }
                else
                {
                    System.out.println("HINT: You need a higher number.");
                }
            }
        }
            while (real != guess);
        System.out.println("Yehey!");
    }
}
