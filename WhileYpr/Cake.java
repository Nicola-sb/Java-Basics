package WhileYpr;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shirochina=Integer.parseInt(scanner.nextLine());
        int duljina=Integer.parseInt(scanner.nextLine());

        String text = scanner.nextLine();
        int allSumParcheta = shirochina * duljina;



        while (!text.equals("STOP")){
            int currentParche = Integer.parseInt(text);
            allSumParcheta = allSumParcheta - currentParche;
            if(allSumParcheta<0){
                break;
            }

            text=scanner.nextLine();
        }



        if(allSumParcheta>0){
            System.out.printf("%d pieces are left.",allSumParcheta);
        }else{
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(allSumParcheta));
        }


    }
}
