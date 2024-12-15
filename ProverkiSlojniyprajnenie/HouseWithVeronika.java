package ProverkiSlojniyprajnenie;

import java.util.Scanner;

public class HouseWithVeronika {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int countFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (typeFlower){
            case "Roses":
                price = 5 * countFlower;
                if(countFlower > 80){
                    price = price * 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80 * countFlower;
                if(countFlower > 90){
                    price = price * 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * countFlower;
                if(countFlower > 80){
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = 3 * countFlower;
                if(countFlower < 120){
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50 * countFlower;
                if(countFlower < 80){
                    price = price * 1.20;
                }
                break;
        }

        double diff = Math.abs(price - budget);

        if(price <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlower,typeFlower,diff);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }
    }
}
