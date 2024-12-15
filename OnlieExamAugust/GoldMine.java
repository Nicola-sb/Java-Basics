package OnlieExamAugust;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLocation=Integer.parseInt(scanner.nextLine());

        double allSumGoldForDay=0;
        for(int i =1;i<=numberLocation;i++){
            double avveraggeGold=Double.parseDouble(scanner.nextLine());
            int numberDaysKopaeneNaDadenaLocaciq=Integer.parseInt(scanner.nextLine());


             for(int j=1;j<=numberDaysKopaeneNaDadenaLocaciq;j++){
                 double dobiwNaZlatoZaDenq=Double.parseDouble(scanner.nextLine());

                allSumGoldForDay=allSumGoldForDay + dobiwNaZlatoZaDenq;

             }
            double averrageDobiv=Math.abs(allSumGoldForDay/numberDaysKopaeneNaDadenaLocaciq);
            if(averrageDobiv>=avveraggeGold){
                System.out.printf("Good job! Average  gold per day: %.2f.",averrageDobiv);
                if(averrageDobiv<avveraggeGold){
                    System.out.printf("You need %.2f gold.",averrageDobiv);
                }
            }

        }

    }
}
