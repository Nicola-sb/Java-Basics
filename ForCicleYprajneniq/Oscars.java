package ForCicleYprajneniq;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initAcademyPoints = Double.parseDouble(scanner.nextLine());
        int peopleAccess = Integer.parseInt(scanner.nextLine());

        double totalPoints = initAcademyPoints;

        for (int i = 1; i <= peopleAccess; i++) {
            String nameAccess = scanner.nextLine();
            double pointsAccess = Double.parseDouble(scanner.nextLine());

//            => 205 + ((11 * 45) / 2) = 452.5
            double currentAccessPoint = (nameAccess.length() * pointsAccess) / 2;
            if (totalPoints <= 1250) {
                totalPoints = totalPoints + currentAccessPoint;
            }
        }


            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
            }else{
                System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.5 - totalPoints);
            }

        }
    }
