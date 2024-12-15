package ProverkiSlojniyprajnenie;

import java.util.Scanner;

public class NewHomeAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceOneFlower = 0;


        if(flower.equals("Roses")){
            priceOneFlower = 5 * numberFlower;
            if (numberFlower > 80){
              priceOneFlower = priceOneFlower * 0.90;

            }

        }else if(flower.equals("Dahlias")){
            priceOneFlower = 3.80 * numberFlower;
            if(numberFlower > 90){
                priceOneFlower = priceOneFlower * 0.85;
            }

        }else if(flower.equals("Tulips")){
            priceOneFlower = 2.80 * numberFlower;
            if(numberFlower > 80){
                priceOneFlower = priceOneFlower * 0.85;
            }

        }else if(flower.equals("Narcissus")){
            priceOneFlower = 3 * numberFlower;
            if(numberFlower < 120){
                priceOneFlower = priceOneFlower * 1.15;
            }

        }else if(flower.equals("Gladiolus")){
            priceOneFlower = 2.50 * numberFlower;
            if(numberFlower < 80 ){
                priceOneFlower = priceOneFlower * 1.20;
            }

        }
        double sumLeft =Math.abs(budget - priceOneFlower);

        if (budget >= priceOneFlower){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberFlower,flower,sumLeft);

        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",sumLeft);
        }




    }
}
