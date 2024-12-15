package OnlieExamAugust;

import java.util.Scanner;

public class GoldMine2Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumberLocation=Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=nNumberLocation;i++){
            double avverrageGoldPerDay=Double.parseDouble(scanner.nextLine());
            int numberDays=Integer.parseInt(scanner.nextLine());

            double allSumGold=0;

            for(int j=1;j<=numberDays;j++){
                double dobivGoldPerDay=Double.parseDouble(scanner.nextLine());
                allSumGold=allSumGold + dobivGoldPerDay;

            }
            double avverrageDobiv=allSumGold / numberDays;

            if(avverrageDobiv>=avverrageGoldPerDay){
                System.out.printf("Good job! Average gold per day: %.2f.%n",avverrageDobiv);
            }else{
                System.out.printf("You need %.2f gold.%n",avverrageGoldPerDay - avverrageDobiv);
            }

        }
    }
}
