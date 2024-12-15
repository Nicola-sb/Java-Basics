package MoreDifficultProverki;

import java.util.Scanner;

public class MagazinForFoodAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        double priceOneProduct = 0.0;
        boolean isWorkingDay = dayOfWeek.equals("Monday")|| dayOfWeek.equals("Thursday")|| dayOfWeek.equals("Wednesday")||dayOfWeek.equals("Tuesday")||
                dayOfWeek.equals("Friday");
        boolean isWeekend = dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");
        boolean isFruit = fruit.equals("banana")|| fruit.equals("apple")||fruit.equals("orange")||fruit.equals("grapefruit") ||
                fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes");
        boolean isValid = true;


        if (dayOfWeek.equals("Monday")|| dayOfWeek.equals("Tuesday")|| dayOfWeek.equals("Wednesday")||
        dayOfWeek.equals("Thursday")||dayOfWeek.equals("Friday")){
            if (fruit.equals("banana")){
                priceOneProduct=2.50;
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

        }else if (dayOfWeek.equals("Saturday")|| dayOfWeek.equals("Sunday")){
            if (fruit.equals("banana")){
                priceOneProduct=2.70;
            }else if(fruit.equals("apple")){
                priceOneProduct = 1.25;
            }else if(fruit.equals("orange")){
                priceOneProduct = 0.90;
            }else if(fruit.equals("grapefruit")){
                priceOneProduct = 1.60;
            }else if(fruit.equals("kiwi")){
                priceOneProduct = 3.00;
            }else if(fruit.equals("pineapple")){
                priceOneProduct = 5.60;
            }else if(fruit.equals("grapes")){
                priceOneProduct = 4.20;
            }else{
                isValid =false;
            }

        }else{
            isValid = false;
        }
        double  result = priceOneProduct * count;

        if (isValid){
            System.out.printf("%.2f",result);
        }else{
            System.out.println("error");
        }



    }
}
