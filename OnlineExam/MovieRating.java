package OnlineExam;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberFilms=Integer.parseInt(scanner.nextLine());

        double sumRaiting=0;
        double counterFilms=0;
        int maxRaitng=Integer.MIN_VALUE;
        int minRaiting=Integer.MAX_VALUE;


        for(int i = 1;i<=numberFilms;i++){
            String filmName=scanner.nextLine();
            double raitngFilm=Double.parseDouble(scanner.nextLine());
            sumRaiting=sumRaiting + raitngFilm;
            counterFilms++;





        }
        System.out.printf("Average rating: %.1f",sumRaiting/counterFilms);
    }
}
