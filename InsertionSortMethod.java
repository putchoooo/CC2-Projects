package sample;
public class InsertionSortMethod {
    public static void main(String arg[]){
    int array[] = {6,4,7,1,9};
    int array2[] = insertion(array);
    for (int i: array2){
        System.out.print(i + "\t");
    }
    }
    static int[] insertion(int[] x){
        int temp;
        for(int i = 1; i < x.length; i++){
            for(int j = i; j > 0; j--){
                if(x[j] < x[j-1]){
                temp = x[j];
                x[j] = x[j-1];
                x[j-1] = temp;        
                }
            }
        }
        return x;
    }
}