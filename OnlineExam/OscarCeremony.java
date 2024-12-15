package OnlineExam;

import java.util.Scanner;

public class OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naemZala = Integer.parseInt(scanner.nextLine());

        double statues = naemZala * 0.70;
        double cetturing = statues * 0.85;
        double sound = cetturing * 0.50;

        double allSum = statues + cetturing + sound + naemZala;

        System.out.printf("%.2f",allSum);



    }
}
