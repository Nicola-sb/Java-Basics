package WhileLek;

import java.util.Scanner;

public class PasswordAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String possiblePassword = scanner.nextLine();

        while (!password.equals(possiblePassword)) {
            possiblePassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",name);

    }
}
