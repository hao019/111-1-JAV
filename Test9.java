import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        int grade = 0 ;
        String space = "";
        
        while (grade < 10) {
            System.out.printf("%d %n", grade);
            space = space + " ";
            grade = grade + 1 ;
            System.out.printf(space);
        }
    }
}