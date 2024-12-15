package Homework;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum=Integer.parseInt(scanner.nextLine());
        int endNum=Integer.parseInt(scanner.nextLine());

//        2345
//        6789
//        int startNumEdinici=startNum % 10; по този начин с модулно деление си взимам последната цифра-5
        int startNumDesetici=startNum / 10 % 10;
//        когато деля стартНъм на 10,премахваме 5цата и с модулното деление % си взимам отново последната цифра
//        в случая 4ката

//      ==

        int startNumEdinicii=startNum % 10;
        startNum=startNum / 10;
        int startNumDeseticii= startNum % 10;

    }
}
