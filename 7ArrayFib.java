package sample;
public class ArrayFib {
    public static void main(String[] args) {
        int[] array = {3,5,7,13,2,3,9};
        display(array);
    }
    static void display(int [] ar){
        for (int j = 0; j < ar.length; j++){
            System.out.println("f(" + ar[j] + "):\t"+ fibonacci(ar[j]));
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
