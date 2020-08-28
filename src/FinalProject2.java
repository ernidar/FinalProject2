import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
psedecode :
1. Ask user for 10 fruits : we need Scanner class, ArrayList class
2. print original order
3. print alphabetical order, we need algorthm of alphabetical order
4. print reverse alphabetical order, we need algorthm of reverse alphabetical order
5. print all letters to uppercase
 */

public class FinalProject2 {

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);

        //Ask user for 10 fruits
        System.out.println("Enter 10 words one by one: ");

        String stringArray[] = new String[10];

        for (int i=0; i<stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }


        //Sort by original order
        System.out.println("Original Order :" + Arrays.toString(stringArray));


        //Sort by alphabetical order
        int size = stringArray.length;
        for (int i=0; i<size-1; i++) {
            for (int j=i+1; j < size; j++) {
                if (stringArray[i].compareTo(stringArray[j]) > 0) {
                    String temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }

        }
        System.out.println("Alphabetical Order :" + Arrays.toString(stringArray));


       //Sort byReversed Alphabetical Order
        if (stringArray==null || stringArray.length < 2) {
            return;
        }
        for (int i = 0; i < stringArray.length/2; i++) {
            String temp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length-1 - i];
            stringArray[stringArray.length-1 - i] = temp;
        }
        System.out.println("Reversed Alphabetical Order :" + Arrays.toString(stringArray));


       //Set all letters to be Uppercase
       Arrays.sort(stringArray);
       System.out.println("Upper case array : " + Arrays.toString(stringArray).toUpperCase()) ;
    }

}
