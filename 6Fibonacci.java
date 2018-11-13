package pkg6sais;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        display();
    }
    static void display(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth of the fibonacci sequence: ");
        int n = sc.nextInt();
        n++;
        for(int i = 0; i < n; i++){
            System.out.print("f(" + i + ")\t");
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(fibonacci(j) + "\t");
            }
            System.out.print("\n");
        }
    }
    static int fibonacci(int nth){
        if (nth <= 1){
        return nth;
        }
        else{
        return fibonacci(nth - 1) + fibonacci(nth - 2);    
        }
    }
}