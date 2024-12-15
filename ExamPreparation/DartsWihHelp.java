package ExamPreparation;

import java.util.Scanner;

public class DartsWihHelp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer=scanner.nextLine();
        int startingPoints=301;

        int countBull=0;
        int countError=0;

        String area=scanner.nextLine();
        while (!area.equals("Retire")){
            int points=Integer.parseInt(scanner.nextLine());
            switch (area){
                case "Single":
                    break;
                case "Double":
                    points=points * 2;
                    break;
                case "Triple":
                    points = points * 3;
                    break;
            }


            if(points<=startingPoints){
                startingPoints=startingPoints-points;
                countBull++;
            }else{
                countError++;
            }

            if(startingPoints==0){
                break;
            }
            area=scanner.nextLine();
        }

        if(startingPoints==0){
            System.out.printf("%s won the leg with %d shots.",namePlayer,countBull);
        }else{
            System.out.printf("%s retired after %d unsuccessful shots.",namePlayer,countError);
        }
    }
}
