package WhileYpr;

import java.util.Scanner;

public class StepsWithVeronika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps= 10000;
        int totalSteps=0;

        String input = scanner.nextLine();

        while (!input.equals("Going home")){
            int currentSteps=Integer.parseInt(input);
            totalSteps= totalSteps + currentSteps;
            if(totalSteps >=targetSteps){
                break;
            }

            input=scanner.nextLine();
        }

        if(input.equals("Going home")){
            int goingHomeSteps=Integer.parseInt(scanner.nextLine());
            totalSteps = totalSteps+goingHomeSteps;
        }
        int diff = Math.abs(targetSteps - totalSteps);
        if(totalSteps>=targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",diff);
        }else{
            System.out.printf("%d more steps to reach goal.",diff);
        }


    }
}
