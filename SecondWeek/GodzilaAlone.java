package SecondWeek;

import java.util.Scanner;

public class GodzilaAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudjet = Double.parseDouble(scanner.nextLine());
        int numberStatist = Integer.parseInt(scanner.nextLine());
        double priceClotchesForOneStatist = Double.parseDouble(scanner.nextLine());

        double decor = filmBudjet * 0.10;
        double priceForClothes = numberStatist * priceClotchesForOneStatist;




        if(numberStatist > 150){
            priceForClothes = priceForClothes * 0.90;
        }
        double allSum = decor + priceForClothes;
        double diff = Math.abs(filmBudjet - allSum);

        if(allSum <= filmBudjet){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);

        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);

        }


    }
}
