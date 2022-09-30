import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        int num1;
        int num2;
        int sum;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter.second interger:");
        num1 = input.nextInt();
        
        System.out.println("Enter.second interger:");
        num2 = input.nextInt();
        
        sum = num1 + num2;
        System.out.println("The.sum is " + sum);
    }
}