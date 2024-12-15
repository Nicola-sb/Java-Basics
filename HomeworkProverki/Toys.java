package HomeworkProverki;

import java.util.Scanner;

public class Toys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         double priceTrip = Double.parseDouble(scanner.nextLine());
         int puzzle = Integer.parseInt(scanner.nextLine());
         int talkingCycles = Integer.parseInt(scanner.nextLine());
         int teddyBears = Integer.parseInt(scanner.nextLine());
         int minions = Integer.parseInt(scanner.nextLine());
         int trucks = Integer.parseInt(scanner.nextLine());

         double allSum = puzzle * 2.60 + talkingCycles * 3 + teddyBears * 4.10 + minions * trucks * 2;

         double numberToys = puzzle + talkingCycles + teddyBears + minions + trucks;

         if (numberToys > 50){
             allSum=allSum - (allSum * 0.25);

             allSum = allSum * 0.90;



//        Цени на играчките:
//
//· Пъзел - 2.60 лв.
//
//· Говореща кукла - 3 лв.
//
//· Плюшено мече - 4.10 лв.
//
//· Миньон - 8.20 лв.
//
//· Камионче - 2 лв.
//    }
    }
}
}
