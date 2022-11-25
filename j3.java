import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        int sum;      
        Scanner input = new Scanner(System.in);
        System.out.println("input kilometer:");
        sum = input.nextInt();

        if(sum > 7) 
            System.out.println(((sum-7) * 5 + 85)+"NT");
        else 
            System.out.println("85NT");
        
    }
}