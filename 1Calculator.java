package calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double numnum12;
        Scanner answer = new Scanner(System.in);
        System.out.println("What is the first number?");
        int number1 = answer.nextInt();
        System.out.println("What is the Operation to be use?");
        String operator = answer.next();
        System.out.println("What is the second number?");
        int number2 = answer.nextInt();
        
        switch (operator){
            case "divide": 
            case "Divide":
            case "/": 
                numnum12 = number1 / number2;
                System.out.println("The quotient is: " + numnum12);
                break;
            case "*":
            case "multiply":
            case "Multiply":
                numnum12 = number1 * number2;
                System.out.println("The product is: " + numnum12);
                break;
            case "+":
            case "add":
            case "Add":
                numnum12 = number1 + number2;
                System.out.println("The sum is: " + numnum12);
                break;
            case "-":
            case "minus":
            case "Minus":
            case "subtract":
            case "Subtract":
                numnum12 = number1 - number2;
                System.out.println("The difference is: " + numnum12);
                break;
            case "%":
            case "remainder":
            case "Remainder":
                numnum12 = number1 % number2;
                System.out.println("The remainder is: " + numnum12);
                break;
            default:
                System.out.print ("It is invalid! Systax Error!");  
        }
    }
}