package WhileYpr;

import java.util.Scanner;

public class Stepss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps=10000;

        String text = scanner.nextLine();
        int totalSteps=0;

        while (!text.equals("Going home")){
            int currentSteps=Integer.parseInt(text);
            totalSteps=totalSteps + currentSteps;
            if (totalSteps >=targetSteps){
                break;
            }


            text = scanner.nextLine();
        }

        if(text.equals("Going home")){
            int goingHomeSteps = Integer.parseInt(scanner.nextLine());
            totalSteps = totalSteps + goingHomeSteps;
        }

        int diff = Math.abs(totalSteps - targetSteps);
        if(totalSteps >= targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",diff);
        }else{
            System.out.printf("%d more steps to reach goal.",diff);
        }
    }
}
