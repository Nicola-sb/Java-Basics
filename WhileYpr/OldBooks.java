package WhileYpr;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String book = scanner.nextLine();

      String possiblebook = scanner.nextLine();
      int broiKnigiDoMomenta=0;

      while (!possiblebook.equals(book)){
          possiblebook=scanner.nextLine();
          broiKnigiDoMomenta++;
          if(possiblebook.equals("No More Books")){
              break;
          }
      }


      if(book.equals(possiblebook)){
          System.out.printf("You checked %d books and found it.",broiKnigiDoMomenta);
      }else{
          System.out.println("The book you search is not here!");
          System.out.printf("You checked %d books.",broiKnigiDoMomenta);
      }

    }
}
