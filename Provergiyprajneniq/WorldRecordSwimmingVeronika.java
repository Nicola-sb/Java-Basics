package Provergiyprajneniq;

import java.util.Scanner;

public class WorldRecordSwimmingVeronika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForUnitDistance = Double.parseDouble(scanner.nextLine());

        double allTime = distance * timeForUnitDistance;
        double resistenseTime = Math.floor(distance / 15) * 12.5;

        double totalTimePlusResistance = allTime + resistenseTime;

        if (totalTimePlusResistance < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTimePlusResistance);

        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTimePlusResistance - worldRecord);

        }





    }
}
