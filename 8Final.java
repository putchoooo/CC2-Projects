package sample;
import java.util.Scanner;
public class Final {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] arg){
        uno();
    }
    static void uno(){
        System.out.print("What do you want to get? Factorial/Fibonacci?");
        String method = sc.nextLine();
        ask(method);
    }
    static void ask(String method){
        switch(method){
            case "fibonacci":
            case "Fibonacci":   fibonacci();
                                break;
            case "factorial":
            case "Factorial":   factorial();
                                break;
            default: uno();
        }
    }
    static void fibonacci() {
        int array[] = capture();
        for(int i = 0; i < array.length; i++){
            System.out.print("f(" + array[i] + ")\t");}
        System.out.println("");
        for(int i = 0; i < array.length; i++){
            System.out.print(recursionFibonacci(array[i]) + "\t");}
    }
    static int recursionFibonacci(int n){
       if (n <= 1){
           return n;}
       else{
           return (recursionFibonacci(n-1)+ recursionFibonacci(n-2));}
    }
    static void factorial() {
        int array[] = capture();
        for(int i = 0; i < array.length; i++){
            System.out.print("f(" + array[i] + ")\t");}
        System.out.println("");
        for(int i = 0; i < array.length; i++){
            System.out.print(recursionFactorial(array[i]) + "\t");}
    }
    static int recursionFactorial(int n){
       if (n <= 2){
            return n;}
       else{
           return (n * recursionFactorial(n-1));}
    }
    static int[] capture() {
        System.out.print("How many element will you put in your array: ");
        int elementnum = sc.nextInt();
        int array[] = new int[elementnum];
        System.out.println("Enter your elements:");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();}
        return array;
    }
}
