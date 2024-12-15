package OnlineExam;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double sheslongPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allPeopleTax = numberPeople * tax;

        double peopleWitchSheslong =Math.ceil(numberPeople * 0.75);


        double allpeopleWitchShezlong = peopleWitchSheslong * sheslongPrice;

        double peopleWithUmrela =Math.ceil(numberPeople * 0.50);

        double neededUmrella = peopleWithUmrela * umbrellaPrice;

        double allPrice = allPeopleTax + allpeopleWitchShezlong + neededUmrella;

        System.out.printf("%.2f lv.",allPrice);




    }
}
