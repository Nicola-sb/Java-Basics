package WhileLek;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class GraduationOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int clas = 1;
        double averrageGrade =0;
        double poorGrade =0;

        while (clas<=12){
            if(poorGrade > 1){
                break;
            }
            double yearGrade=Double.parseDouble(scanner.nextLine());
            if(yearGrade < 4){
                poorGrade++;
                continue;
            }
            averrageGrade = averrageGrade + yearGrade;
            clas++;
        }
        if(clas > 12){
            System.out.printf("%s graduated. Average grade: %.2f",student,averrageGrade / 12);
        }else{
            System.out.printf("%s has been excluded at %d grade",student,clas);
        }
    }
}
