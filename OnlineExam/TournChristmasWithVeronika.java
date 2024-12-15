package OnlineExam;

import java.util.Scanner;

public class TournChristmasWithVeronika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentDays = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;
        int countTotalWin = 0;
        int countTotalLost = 0;

        for (int i = 1; i <= tournamentDays; i++) {
            String input = scanner.nextLine();
            double dailyProfit = 0;
            int countDailyWin = 0;
            int countDailyLost = 0;


            while (!input.equals("Finish")) {
                String typeGame = input;
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    dailyProfit = dailyProfit + 20;
                    countDailyWin++;

                } else {
                    countDailyLost++;
                }


                input = scanner.nextLine();
            }

            if (countDailyWin > countDailyLost) {
                dailyProfit = dailyProfit * 1.10;
            }
            countTotalWin = countDailyWin + countDailyWin;
            countTotalLost = countTotalLost + countDailyLost;
            totalProfit = totalProfit + dailyProfit;


        }


         if(countTotalWin>countTotalLost){
             System.out.printf("You won the tournament! Total raised money: %.2f",totalProfit * 1.20);
         }else{
             System.out.printf("You lost the tournament! Total raised money: %.2f",totalProfit);
         }
         //80 ot 100 tochki??

          }
    }

