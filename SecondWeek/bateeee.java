package SecondWeek;

import java.util.Scanner;

public class bateeee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      double budget = Double.parseDouble(scanner.nextLine());
      int video = Integer.parseInt(scanner.nextLine());
      int procesors = Integer.parseInt(scanner.nextLine());
      int ram = Integer.parseInt(scanner.nextLine());

      double priceVideo = video * 250;
      double priceProcesor = priceVideo * 0.35 * procesors;
      double priceRam = priceVideo * 0.10 * ram;
      double allSum = priceVideo + priceProcesor + priceRam;

      if(video > procesors){
          allSum = allSum * 0.85;
      }

      double diff =Math.abs(budget - allSum);

      if (budget >= allSum){
          System.out.printf("You have %.2f leva left!",diff);
      }else{
          System.out.printf("Not enough money! You need %.2f leva more!",diff);
      }












    }
}
