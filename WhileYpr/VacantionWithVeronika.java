package WhileYpr;

import java.util.Scanner;

public class VacantionWithVeronika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           double neededMoney=Double.parseDouble(scanner.nextLine());
           double availableMoney=Double.parseDouble(scanner.nextLine());

           int countDays = 0;
           double finalSum=availableMoney;
           int spendingCount=0;
           boolean isFailed = false;


           while (finalSum<neededMoney){
               if(spendingCount>4){
                   isFailed = true;
                   break;
               }
               String action = scanner.nextLine();
               double amount = Double.parseDouble(scanner.nextLine());
               countDays++;

               if(action.equals("save")){
                   finalSum = finalSum + amount;
                   spendingCount=0;
               }else{
                   spendingCount++;
                   finalSum = finalSum - amount;
                   if(finalSum<0){
                       finalSum=0;
                   }
               }
           }

           if(isFailed){
               System.out.println("You can't save the money.");
               System.out.printf("%d",countDays);
           }else{
               System.out.printf("You saved the money for %d days.",countDays);
           }


    }
}
