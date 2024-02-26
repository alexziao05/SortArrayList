/**
 * ArrayList Program
 * Sorting from smallest to largest with ArrayList
 * CS160 - Section #3
 * @author Alex Huang
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers one after another. Once done enter -1");



        int num = scan.nextInt();


        while (num != -1) {
            int i = 0;
            int size = numbers.size();

//            for (int k = 0; k < size; k++) {
//                if(numbers.get(k) > num) {
//                            numbers.set(k, num);
//                            break;
//                    }
//            }
//            numbers.add(num);

            //first condition make sure loop does not go out of Bound if it is the last element
            //second condition will stop the index before the larger number

            while (i < size && num > numbers.get(i)) {
                i++;
            }

            if (i < size) {
                numbers.add(i, num);
            } else {
                numbers.add(num);
            }
            num = scan.nextInt();
        }

        System.out.println(numbers);





    }
}

