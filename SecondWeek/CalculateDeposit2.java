package SecondWeek;

import java.util.Scanner;

public class CalculateDeposit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double  something = deposit * (percent / 100);
        double anything = something / 12;


        double sum =deposit + (month * anything);


        System.out.println(sum);

    }
}
