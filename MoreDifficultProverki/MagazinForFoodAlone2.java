package MoreDifficultProverki;

import java.util.Scanner;

public class MagazinForFoodAlone2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double priceOneProduct = 0.0;

        boolean isValid = true;


        if(dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
        dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")){
            if(fruit.equals("banana")){
                priceOneProduct = 2.50;
            }else if(fruit.equals("apple")){
                priceOneProduct = 1.20;
            }else if(fruit.equals("orange")){
                priceOneProduct = 0.85;
            }else if(fruit.equals("grapefruit")){
                priceOneProduct = 1.45;
            }else if(fruit.equals("kiwi")){
                priceOneProduct = 2.70;
            }else if(fruit.equals("pineapple")){
                priceOneProduct = 5.50;
            }else if(fruit.equals("grapes")){
                priceOneProduct = 3.85;
            }else{
                isValid = false;
            }
        }else if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            if(fruit.equals("banana")){
                priceOneProduct = 2.70;
            }else if(fruit.equals("apple")){
                priceOneProduct = 1.25;
            }else if(fruit.equals("orange")){
                priceOneProduct = 0.90;
            }else if(fruit.equals("grapefruit")){
                priceOneProduct = 1.60;
            }else if(fruit.equals("kiwi")){
                priceOneProduct = 3;
            }else if(fruit.equals("pineapple")){
                priceOneProduct = 5.60;
            }else if(fruit.equals("grapes")){
                priceOneProduct = 4.20;
            }else{
                isValid = false;
            }

        }else{
            isValid = false;
        }

        double price = priceOneProduct * quantity;
        if(!isValid){
            System.out.println("error");
        }else{
            System.out.printf("%.2f",price);
        }



    }
}
