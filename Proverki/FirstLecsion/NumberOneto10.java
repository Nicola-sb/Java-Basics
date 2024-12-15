package Proverki.FirstLecsion;

import java.util.Scanner;

public class NumberOneto10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 1000){
            System.out.println("Less then 1000");
        }else if (number < 2000){
            System.out.println("Less than 2000");
        }else if (number > 2000){
            System.out.println("More than 3000");
        }else if (number < 3000){
            System.out.println("Kot takoa");
        }else if (number < 4000){
            System.out.println("Banica");
        }else if (number > 5000){
            System.out.println("taradydam");
        }
        {
        }
    }
}
