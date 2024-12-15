package WhileYpr;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumResto = Double.parseDouble(scanner.nextLine());

        double monetaLevche = 1;
        double moneta2leva = 2;

        double moneta50St = 0.50;
        double moneta20st = 0.20;
        double moneta10st = 0.10;
        double moneta5st = 0.05;
        double moneta2st = 0.02;
        double moneta1st = 0.01;

        int maxMoneta=Integer.MIN_VALUE;


        while (sumResto < maxMoneta){
            int numberCoins=Integer.parseInt(scanner.nextLine());
            sumResto=sumResto - maxMoneta;
            maxMoneta++;
            if(sumResto==maxMoneta){
                break;
            }
            if(maxMoneta < numberCoins){

            }


        }

       System.out.println(maxMoneta);
    }
}
