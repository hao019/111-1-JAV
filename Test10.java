import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int row = 0;
        int row2 = 0;
        
        while (row < 5) {
            int star = 0;
            while (star <= row) {
                System.out.printf("*");
                star = star + 1;
            }
            System.out.println("");
            
            row = row + 1;
        }
        
        while (row2 < 5) {
            int star2 = 4;
            while (star2 > row2) {
                System.out.printf("*");
                star2 = star2 - 1;
            }
            System.out.println("");
            
            row2 = row2 + 1;
        }
    }
}