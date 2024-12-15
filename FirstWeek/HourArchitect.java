import java.util.Scanner;

public class HourArchitect {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameArch = scanner.nextLine();
        int numberProect = Integer.parseInt(scanner.nextLine());

        int totalProect = numberProect * 3;



        System.out.println("The architech " + nameArch + " will need " + totalProect + " hours to complete " + numberProect + " projects.");

    }
}
