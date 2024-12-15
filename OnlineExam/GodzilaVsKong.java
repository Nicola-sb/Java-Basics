package OnlineExam;

import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberStatist = Integer.parseInt(scanner.nextLine());
        double priceOneStatistClothes = Double.parseDouble(scanner.nextLine());

        double priceForDecor = budget * 0.10;
        double priceAllClothes = numberStatist * priceOneStatistClothes;

        if(numberStatist > 150){
            priceAllClothes = priceAllClothes * 0.90;
        }

        double allSum = priceForDecor + priceAllClothes;



        double diff = Math.abs(budget - allSum);

        if(allSum <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);
        }

    }
}
