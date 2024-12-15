package WhileYpr;

import java.util.Scanner;

public class OldBookWithVeronika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();

        String inputLine = scanner.nextLine();
        boolean wasFound= false;
        int countBooks=0;

        while (!inputLine.equals("No More Books")){
            if(inputLine.equals(wantedBook)){
                wasFound = true;
                break;
            }
            countBooks++;
            inputLine=scanner.nextLine();
        }

        if(wasFound){
            System.out.printf("You checked %d books and found it.",countBooks);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",countBooks);
        }


    }
}
