package ForCicleYprajneniq;

import java.util.Scanner;

public class HomeworkForCyc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsAcademy=Double.parseDouble(scanner.nextLine());
        int numberOcenqwashti = Integer.parseInt(scanner.nextLine());

        double totalPoints=205;

        for(int i = 1;i<=numberOcenqwashti;i++){
            String nameOcenqwash = scanner.nextLine();
            double pointsOcenqwash = Double.parseDouble(scanner.nextLine());

            double pointsEveryOcenqwash = (nameOcenqwash.length() * pointsOcenqwash) / 2;

            totalPoints = totalPoints + pointsEveryOcenqwash;

            if(totalPoints < 1250.5){
                totalPoints = totalPoints + pointsEveryOcenqwash;
            }
        }



    }
}
