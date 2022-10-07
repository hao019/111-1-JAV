import java.util.Scanner;

public class vva {
    public static void main(String[] args){
        int grade;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter.second interger:");
        grade = input.nextInt();
        
        if (grade > 60) {
            if (grade < 60) {
                System.out.println("E");
            }
            else if (grade >= 60 && grade <=69){
                System.out.println("D");
            }
            else if (grade >= 70 && grade <=79){
                System.out.println("C");
            }
            else if (grade >= 80 && grade <=89){
                System.out.println("B");
            }
            else if (grade >= 90 && grade <=100){
                System.out.println("A");
            }
        }
    }
}