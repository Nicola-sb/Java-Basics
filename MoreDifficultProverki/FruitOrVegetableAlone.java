package MoreDifficultProverki;

import java.util.Scanner;

public class FruitOrVegetableAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Име на продукт
        //Трябва да се направи проверка дали е плод или зеленчук иф/елсе
// banana, apple, kiwi, cherry, lemon и grapes
        String product = scanner.nextLine();

        switch (product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
        }
    }
}
