package ForCicleYprajneniq;

import java.rmi.server.RMIClassLoader;
import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPackage = Integer.parseInt(scanner.nextLine());

        double allTona = 0;
        int mikrobys = 0;
        int truck = 0;
        int train = 0;
        int priceForOneTon = 0;
        int microbysMoney=200;
        int truckMoney=175;
        int trainMoney=120;



        for (int i=1;i<=numberPackage;i++) {
            int numberTonaj = Integer.parseInt(scanner.nextLine());
            allTona = allTona + numberTonaj;


            if (numberTonaj <= 3) {
                priceForOneTon = 200;
                mikrobys = mikrobys + numberTonaj;




            } else if (numberTonaj <= 11) {
                priceForOneTon = 175;
                truck = truck + numberTonaj;



            } else {
             priceForOneTon =120;
             train = train + numberTonaj;


            }
        }

        double allSumMicrobus = microbysMoney * mikrobys;
        double allSumTruck = truckMoney * truck;
        double allSumTrain = trainMoney * train;


        double averrage = (allSumMicrobus + allSumTruck + allSumTrain) / allTona;




        System.out.printf("%.2f%n",averrage);
        System.out.printf("%.2f%%%n",mikrobys / allTona * 100);
        System.out.printf("%.2f%%%n",truck / allTona * 100);
        System.out.printf("%.2f%%%n",train / allTona * 100);
    }
}
