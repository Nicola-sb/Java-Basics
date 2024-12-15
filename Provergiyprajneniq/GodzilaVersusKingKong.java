package Provergiyprajneniq;

import java.util.Scanner;

public class GodzilaVersusKingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudjet = Double.parseDouble(scanner.nextLine());
        int numberStatist = Integer.parseInt(scanner.nextLine());
        double priceClotchesForOneStatist = Double.parseDouble(scanner.nextLine());

        double sumDekor = filmBudjet * 0.10;
        double sumClotches = numberStatist * priceClotchesForOneStatist;

        if (numberStatist > 150){
            sumClotches = sumClotches * 0.90;
        }

       double totalSum = sumDekor + sumClotches;
       double sumLeft = Math.abs(totalSum - filmBudjet);


        if (totalSum <= filmBudjet){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f left.",sumLeft);
        }else {
            System.out.println("Not enough money");
            System.out.printf("Wingard needs %.2f leva more.",sumLeft);

        }






    }
}
