package Provergiyprajneniq;

import java.util.Scanner;

public class WorldRecordSwimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      double recordSedonds = Double.parseDouble(scanner.nextLine());
      double metresDiff = Double.parseDouble(scanner.nextLine());
      double timeMetresForOneSec = Double.parseDouble(scanner.nextLine());

      double swimmingMetres = metresDiff * timeMetresForOneSec;
      double every15metres = Math.floor(metresDiff / 15) * 12.5;

      double totalTime = swimmingMetres + every15metres;


      if ( totalTime < recordSedonds){
          System.out.printf("Yes, he succeeded! The new world record is %.2f seconds." ,totalTime );

      } else  {

          System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime - recordSedonds);


        }





    }
}
