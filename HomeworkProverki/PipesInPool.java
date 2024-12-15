package HomeworkProverki;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int obemV= Integer.parseInt(scanner.nextLine());
        int firstPipeFor1Hour = Integer.parseInt(scanner.nextLine());
        int secondPipeFor1Hour = Integer.parseInt(scanner.nextLine());
        double hoursMissingH = Double.parseDouble(scanner.nextLine());

        double fullFirstPipeFor3hour = firstPipeFor1Hour * hoursMissingH;
        double fullSecondPipeFor3hour = secondPipeFor1Hour * hoursMissingH;

        double allPipes = fullFirstPipeFor3hour + fullSecondPipeFor3hour;

        double procentFirstPipe = fullFirstPipeFor3hour / allPipes;
        double procentSecondPipe = fullSecondPipeFor3hour / allPipes;


    }
}
