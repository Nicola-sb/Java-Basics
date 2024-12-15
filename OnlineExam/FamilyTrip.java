package OnlineExam;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberNights = Integer.parseInt(scanner.nextLine());
        double priceNight = Double.parseDouble(scanner.nextLine());
        int procentDopRaz = Integer.parseInt(scanner.nextLine());

        if(numberNights > 7){
            priceNight = priceNight * 0.95;
        }

        double allNights = numberNights * priceNight;

        double allRazhodi = budget * (procentDopRaz / 100.0);

        double allSum = allNights + allRazhodi;

        double diff =Math.abs(allSum - budget);



        if(allSum <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",diff);
        }else{
            System.out.printf("%.2f leva needed.",diff);
        }







    }
}
