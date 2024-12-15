package Proverki.FirstLecsion;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chetnoIliNechetno = Integer.parseInt(scanner.nextLine());

        if (chetnoIliNechetno % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }

}
