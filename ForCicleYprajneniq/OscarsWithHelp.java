package ForCicleYprajneniq;

import java.util.Scanner;

public class OscarsWithHelp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initAcademyPoints = Double.parseDouble(scanner.nextLine());
        int peopleAccess = Integer.parseInt(scanner.nextLine());

        double totalPoints=initAcademyPoints;

        for(int i=1;i<=peopleAccess;i++) {
            String nameAccess = scanner.nextLine();
            double pointsAccess = Double.parseDouble(scanner.nextLine());

            double currentAccessPoint = (nameAccess.length() * pointsAccess) / 2;
            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + currentAccessPoint;
            }
        }

        if(totalPoints>=1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,totalPoints);
        }else{
            System.out.printf("Sorry, %s you need %.1f!",actorName,1250.5 - totalPoints);
        }

    }
}
