package ForCicleYprajneniq;

import java.util.Scanner;

public class DopBackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int nAgeLiving = Integer.parseInt(scanner.nextLine());


        double allMoney = money;
        double ageIvan = 18;

        for(int i = 1800;i<=nAgeLiving;i++){

            if(i % 2 ==0){

                allMoney = allMoney - 12000;

            }else{
                double ageS = ageIvan * 50;
                allMoney = allMoney - 12000 - ageS;
            }
            ageIvan++;
        }
        double diff = Math.abs(allMoney - money);
        if(allMoney >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",Math.abs(allMoney));
        }else{
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(allMoney));
        }
    }
}
