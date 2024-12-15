package NestedLoopsLek;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination=scanner.nextLine();

        while (!destination.equals("End")) {
           double spestqwaniq = Double.parseDouble(scanner.nextLine());
           double money = 0;

            while (spestqwaniq > money) {
                double currentMoney=Double.parseDouble(scanner.nextLine());
                money=money + currentMoney;



            }

            destination=scanner.nextLine();

            System.out.printf("Going to %s!%n",destination);

        }
    }
}
