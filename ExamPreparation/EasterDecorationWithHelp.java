package ExamPreparation;

import java.util.Scanner;

public class EasterDecorationWithHelp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           int numberNclients=Integer.parseInt(scanner.nextLine());
        double allSumClients=0;

           for(int i=0;i<numberNclients;i++){
               String pokupka=scanner.nextLine();
               double priceForOneProduct=0;
               int counterPokypki=0;
               double sumForOneClient=0;


               while (!pokupka.equals("Finish")){
                   switch (pokupka){
                       case "basket":
                           priceForOneProduct=1.5;
                           break;
                       case "wreath":
                           priceForOneProduct=3.80;
                           break;
                       case "chocolate bunny":
                           priceForOneProduct=7;
                           break;
                   }

                   sumForOneClient=sumForOneClient + priceForOneProduct;
                   counterPokypki++;
                   pokupka=scanner.nextLine();
               }
               if(counterPokypki % 2 ==0){
                   sumForOneClient=sumForOneClient * 0.80;
               }

               System.out.printf("You purchased %d items for %.2f leva.%n",counterPokypki,sumForOneClient);
               allSumClients=allSumClients+sumForOneClient;
           }
        System.out.printf("Average bill per client is: %.2f leva.",allSumClients/numberNclients);
    }
}
