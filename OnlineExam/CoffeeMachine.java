package OnlineExam;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberDrinks = Integer.parseInt(scanner.nextLine());

        double priceOneProduct = 0;

        switch (drink){
            case "Espresso":
                if(sugar.equals("Without")){
                    priceOneProduct = 0.90;
                }else if(sugar.equals("Normal")){
                    priceOneProduct = 1;
                }else if(sugar.equals("Extra")){
                    priceOneProduct = 1.20;
                }
                break;
            case "Cappuccino":
                if(sugar.equals("Without")){
                    priceOneProduct = 1;
                }else if(sugar.equals("Normal")){
                    priceOneProduct = 1.20;
                }else if(sugar.equals("Extra")){
                    priceOneProduct = 1.60;
                }
                break;
            case "Tea":
                if(sugar.equals("Without")){
                    priceOneProduct = 0.50;
                }else if(sugar.equals("Normal")){
                    priceOneProduct = 0.60;
                }else if(sugar.equals("Extra")){
                    priceOneProduct = 0.70;
                }

        }
        double allSum = numberDrinks * priceOneProduct;

        if(sugar.equals("Without")){
            allSum = allSum * 0.65;
        }

        if(drink.equals("Espresso") && numberDrinks >=5){
            allSum = allSum * 0.75;
        }

        if(allSum > 15){
            allSum = allSum * 0.80;
        }



     System.out.printf("You bought %d cups of %s for %.2f lv.",numberDrinks,drink,allSum);

    }
}
