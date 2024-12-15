package Homework;

import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberDrinks = Integer.parseInt(scanner.nextLine());

       double priceOneProduct = 0;


        if (drink.equals("Espresso")){
            if(sugar.equals("Without")){
               priceOneProduct = 0.90;
            }else if(sugar.equals("Normal")){
                priceOneProduct = 1;
            }else if(sugar.equals("Extra")){
                priceOneProduct = 1.20;
            }
        }else if(drink.equals("Cappuccino")){
            if(sugar.equals("Without")){
                priceOneProduct = 1;
            }else if(sugar.equals("Normal")){
                priceOneProduct = 1.20;
            }else if(sugar.equals("Extra")){
                priceOneProduct = 1.60;
            }


        }else if(drink.equals("Tea")){
            if(sugar.equals("Without")){
                priceOneProduct = 0.50;
            }else if(sugar.equals("Normal")){
                priceOneProduct = 0.60;
            }else if(sugar.equals("Extra")){
                priceOneProduct = 0.70;
            }

        }

        if (drink.equals("Without")){
            priceOneProduct = priceOneProduct * 0.65;
        }

        if (drink.equals("Espresso") && numberDrinks >=5){
            priceOneProduct = priceOneProduct * 0.75;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.",numberDrinks,drink,priceOneProduct);

    }
}
