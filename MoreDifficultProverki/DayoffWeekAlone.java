package MoreDifficultProverki;

        import java.time.MonthDay;
        import java.util.Scanner;

public class DayoffWeekAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeoOftheDay = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();


        switch (dayOfWeek){
            case  "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                System.out.println("open");
                break;
            default:
                System.out.println("close");

        }



    }
}
