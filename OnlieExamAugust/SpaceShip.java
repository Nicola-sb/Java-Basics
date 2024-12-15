package OnlieExamAugust;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirochina =Double.parseDouble(scanner.nextLine());
        double duljina =Double.parseDouble(scanner.nextLine());
        double wisochina =Double.parseDouble(scanner.nextLine());
        double srenaVisochinaNaKosmonawti =Double.parseDouble(scanner.nextLine());

        double obemNaRaketata = shirochina * duljina * wisochina;
        double obemEdnaStaq=(srenaVisochinaNaKosmonawti + 0.40) * 2 * 2;

        double ostanaloMqstoZa=Math.floor(obemNaRaketata/obemEdnaStaq);

        if(ostanaloMqstoZa >=3 && ostanaloMqstoZa <=10){
            System.out.printf("The spacecraft holds %.0f astronauts.",ostanaloMqstoZa);
        }else if(ostanaloMqstoZa < 3){
            System.out.println("The spacecraft is too small.");
        }else if(ostanaloMqstoZa > 10){
            System.out.println("The spacecraft is too big.");
        }

    }
}
