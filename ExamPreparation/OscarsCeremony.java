package ExamPreparation;

import java.util.Scanner;

public class OscarsCeremony {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naemHoll=Integer.parseInt(scanner.nextLine());

        double statyetki = naemHoll * 0.70;
        double cetturing = statyetki * 0.85;
        double sound = cetturing * 0.5;

        double allSum = naemHoll + statyetki + cetturing + sound;

        System.out.printf("%.2f",allSum);

    }
}
