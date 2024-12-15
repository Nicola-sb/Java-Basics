package WhileYpr;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      double neededMoneyForExcursion=Double.parseDouble(scanner.nextLine());
      double nalichniMoney=Double.parseDouble(scanner.nextLine());
      int  countallDays=0;
      double counterFiveDays=0;


      double allSumMoney=nalichniMoney;

      while (allSumMoney<neededMoneyForExcursion){
          if(counterFiveDays > 4){
              break;
          }
          String action = scanner.nextLine();
          double sumSpendSave = Double.parseDouble(scanner.nextLine());
          countallDays++;

          if(action.equals("save")){
              counterFiveDays=0;
              allSumMoney = allSumMoney + sumSpendSave;
          }else{
              counterFiveDays++;
              allSumMoney = allSumMoney - sumSpendSave;
              if(allSumMoney<0){
                  allSumMoney=0;
              }
          }
      }

      if(counterFiveDays > 4){
          System.out.println("You can't save the money.");
          System.out.printf("%d",countallDays);
      }else{
          System.out.printf("You saved the money for %d days.",countallDays);
      }




    }
}
