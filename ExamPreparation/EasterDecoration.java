package ExamPreparation;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumberClienti=Integer.parseInt(scanner.nextLine());



        double allClientsPrise=0;

        for(int i=0;i<nNumberClienti;i++) {
            String pokupka = scanner.nextLine();
            int countProducts = 0;
            double allSum = 0;
            double priceOneProduct = 0;

            while (!pokupka.equals("Finish")) {
                switch (pokupka) {
                    case "basket":
                        priceOneProduct = 1.50;
                        break;
                    case "wreath":
                        priceOneProduct = 3.80;
                        break;
                    case "chocolate bunny":
                        priceOneProduct = 7;
                        break;
                }
                countProducts++;
                allSum = allSum + priceOneProduct;
                pokupka = scanner.nextLine();
            }
            if(countProducts % 2 ==0){
                allSum=allSum * 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n",countProducts,allSum);
            allClientsPrise = allClientsPrise + allSum;
        }

        System.out.printf("Average bill per client is: %.2f leva.",allClientsPrise/nNumberClienti);
    }
}
