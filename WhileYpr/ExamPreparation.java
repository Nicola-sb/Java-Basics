package WhileYpr;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberFallGrades=Integer.parseInt(scanner.nextLine());

        String inputLine=scanner.nextLine();
        int poorGrades=0;
        double sumGrades=0;
        int countProblems=0;
        String lastProblem = "";

        while(!inputLine.equals("Enough")){
            int grade = Integer.parseInt(scanner.nextLine());
            if(grade<=4){
              poorGrades++;
            }
            if(numberFallGrades==poorGrades){
                break;
            }

            sumGrades = sumGrades + grade;
            countProblems++;

            lastProblem=inputLine;

            inputLine=scanner.nextLine();
        }

        double averrageGrade = sumGrades / countProblems;

        if(inputLine.equals("Enough")){
            System.out.printf("Average score: %.2f%n",averrageGrade);
            System.out.printf("Number of problems: %d%n",countProblems);
            System.out.printf("Last problem: %s",lastProblem);
        }else{
            System.out.printf("You need a break, %d poor grades.",poorGrades);
        }
    }
}
