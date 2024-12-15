package Homework;

import java.util.Scanner;

public class VegetablesBors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kgZelen = Double.parseDouble(scanner.nextLine());
        double kgPlodowe = Double.parseDouble(scanner.nextLine());
        int AllZelen = Integer.parseInt(scanner.nextLine());
        int AllPlodowe = Integer.parseInt(scanner.nextLine());

        double priceKgzelen = 0.194 * 10;
        double priceKgPlodowe = 19.4 *10;

        double allZelenPl = priceKgPlodowe + priceKgzelen;

        System.out.println(allZelenPl);



    }
}
