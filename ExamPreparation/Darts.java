package ExamPreparation;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer=scanner.nextLine();

        int purvonachalniTochki=301;
        boolean isZero=false;

        int countYspeshniiztreli=0;
        int countErrorShots=0;
        String comand=scanner.nextLine();

        while (!comand.equals("Retire")){
            String pole=comand;
            int points = Integer.parseInt(scanner.nextLine());


            switch (pole){
                case "Single":
                    if(purvonachalniTochki<points){
                        countErrorShots++;
                        continue;
                    }
                    countYspeshniiztreli++;
                    break;
                case "Double":
                    points =points * 2;
                    if(purvonachalniTochki<points){
                        countErrorShots++;
                        continue;
                    }
                    countYspeshniiztreli++;
                    break;
                case "Triple":
                    points = points *3;
                    if(purvonachalniTochki<points){
                        countErrorShots++;
                        continue;
                    }
                    countYspeshniiztreli++;
                    break;

            }



           purvonachalniTochki = purvonachalniTochki - points;



            comand=scanner.nextLine();
        }

        if(purvonachalniTochki==0){
            System.out.printf("%s won the leg with %d shots.",namePlayer,countYspeshniiztreli);
        }else{
            System.out.printf("%s retired after %d unsuccessful shots",namePlayer,countErrorShots);
        }




    }
}
