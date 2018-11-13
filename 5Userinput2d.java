package quatro;
import java.util.Scanner;
public class Userinput2d {
    public static void main(String[] args) {
        Scanner lagay = new Scanner(System.in);
        System.out.println("How many row will you make?");
        int r = lagay.nextInt(),c;
        int ArayKoAngSakit[][] = new int[r][0];
        for(int j=0; j<r; j++){
            System.out.println("How many column will you put in Row " + (j+1));
            c = lagay.nextInt();
            ArayKoAngSakit[j] = new int[c];
        }
        for(int row=0; row < r; row++){
            for(int column = 0; column < ArayKoAngSakit[row].length; column++){
                System.out.print("Enter the value for Row " + (row+1) + " and Column " + (column+1) + ":");
                int value = lagay.nextInt();
                ArayKoAngSakit[row][column] = value;
            }
        }
        for(int ro=0; ro < r; ro++){
            for(int col = 0; col < ArayKoAngSakit[ro].length; col++){
                System.out.print(ArayKoAngSakit[ro][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}