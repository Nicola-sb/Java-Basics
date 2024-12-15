package NestedLoopsLek;

import java.util.Scanner;

public class TravelingWithKaloyan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String destination=scanner.nextLine();



        while (!destination.equals("End")){
            double neededBudget = Double.parseDouble(scanner.nextLine());


            double money=0;
            while (money<neededBudget){
                double currentMoney=Double.parseDouble(scanner.nextLine());
                money=money+currentMoney;

            }
            System.out.printf("Going to %s!%n",destination);

            destination=scanner.nextLine();
        }
    }
}
