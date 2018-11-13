package tres;
public class Oddeventable {
    public static void main(String[] args) {
        int originarray[] = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14};
        System.out.print("Array: { ");
        for (int counterarray =0; counterarray < originarray.length; counterarray++){
            System.out.print(originarray[counterarray] +" ");}
            System.out.println("}");
        int maxnumber;
        switch (originarray.length%2){
            case 1: maxnumber = originarray.length/2;
                    maxnumber = maxnumber + 1;
                    break;
            default: maxnumber = originarray.length/2;
                    break;
        }
        int odd[] = new int[maxnumber];
        int even[] = new int[maxnumber];
        for (int arrangecounter = 0, evencounter = 0, oddcounter = 0; arrangecounter < originarray.length; arrangecounter++){
            switch (originarray[arrangecounter]%2){
                case 1:odd[oddcounter] = originarray[arrangecounter];
                       oddcounter++;
                       break;
               default:even[evencounter] = originarray[arrangecounter];
                       evencounter++;
                       break;}
        }
        System.out.println("Odd\tEven");
        for (int displaycounter = 0; displaycounter < maxnumber; displaycounter++){
            if (odd[displaycounter] == 0){
            System.out.println("none\t" + even[displaycounter]);}
            else if (even[displaycounter] == 0){
            System.out.println(odd[displaycounter]+ "\tnone");}
            else {
            System.out.println(odd[displaycounter] + "\t" + even[displaycounter]);}
            }}}