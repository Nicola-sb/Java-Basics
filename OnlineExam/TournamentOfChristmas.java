package OnlineExam;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDaysTournir=Integer.parseInt(scanner.nextLine());
         String input = scanner.nextLine();



         while (!input.equals("Finish")){
             String sport=input;
             String result=scanner.nextLine();
             double winPrise=0;
             int losePrise=0;
             int counterWin=0;
             int counterLose=0;
             switch (result) {
                 case "win":
                     winPrise = winPrise + 20;
                     counterWin++;
                     continue;
                 case "lose":
                     counterLose++;
                     continue;
             }


             for(int i =1;i<=numberDaysTournir;i++) {


             }
          //   if(counterWin>counterLose){
         //      winPrise=winPrise * 1.10;
         //      }





             input=scanner.nextLine();
         }
    }
}
