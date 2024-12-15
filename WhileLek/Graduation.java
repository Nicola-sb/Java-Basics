package WhileLek;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String studentName=scanner.nextLine();
       int clas = 1;
       int popravka=0;
       double averrageGrade=0;

       while (clas <=12){
           if(popravka > 1){
               break;
           }
           double yearsGrade=Double.parseDouble(scanner.nextLine());
           if(yearsGrade<4){
               popravka++;
               continue;

           }
           averrageGrade = averrageGrade + yearsGrade;

           clas++;
       }
       if(clas > 12){
           System.out.printf("%s graduated. Average grade: %.2f",studentName,averrageGrade / 12);
       }else{
           System.out.printf("%s has been excluded at %d grade",studentName,clas);
       }
    }
}
