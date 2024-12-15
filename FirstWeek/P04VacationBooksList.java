import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());

        int pagesPerhours = Integer.parseInt(scanner.nextLine());

        int days = Integer.parseInt(scanner.nextLine());




        int allHours = pages / pagesPerhours;

        int hourForReading = allHours / days;

        System.out.println(hourForReading);










    }
}
