package WhileYpr;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allMoneyForVacantion=Double.parseDouble(scanner.nextLine());
        double nalichniMoney=Double.parseDouble(scanner.nextLine());

        String spendOrsave = scanner.nextLine();
        int counterFiveDaysSpendMoney=0;
        int counterAllDays=0;

        while (nalichniMoney < allMoneyForVacantion && counterFiveDaysSpendMoney < 5){
            double sumSpendOrSave =Double.parseDouble(scanner.nextLine());
            if(spendOrsave.equals("spend")) {
                nalichniMoney = nalichniMoney - sumSpendOrSave;
                if(nalichniMoney<0){
                    nalichniMoney = 0;
                }
                counterFiveDaysSpendMoney++;
            }else if(spendOrsave.equals("save")){
                nalichniMoney = nalichniMoney + sumSpendOrSave;
            }
            counterAllDays++;

            if(allMoneyForVacantion<=nalichniMoney){
                System.out.printf("You saved the money for %d days.",counterAllDays);
            }
            if(counterFiveDaysSpendMoney>4){
                System.out.printf("You can't save the money.%n");
                System.out.printf("%d",counterAllDays);
                break;
            }



            spendOrsave=scanner.nextLine();
        }






    }
}
