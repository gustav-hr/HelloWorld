package Array;

public class Array {
    public static void main(String[] args) {

        int largeArray [] = {8, 11, 12, 13, 2, 25, 65, 34, 1, 99, 76, 87, 109, 54}; // 14 different "ages". Man tæller dog den første med
        // som 0 - derfor der står 13 ved for(int).
        // Man kan fx. bruge dette hvis man laver en undersøgelse om alder.

        int smallest = largeArray[0];
        int largest = largeArray[0];

        for(int i = 0; i <=13; i++) {

            if (largeArray[i] < smallest) smallest = largeArray[i];
            if (largeArray[i] > largest) largest = largeArray[i];
        }
        System.out.println("The smallest value in the Array is: " + smallest);
        System.out.println("The largest value in the Array is: " + largest);





    }
}
