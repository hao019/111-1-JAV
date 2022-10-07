import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int grade;
                
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        grade = input.nextInt();
        
		if (grade<=100)
				switch (grade / 10) {
				case 10:
				case 9:  
				System.out.println("A");
				break;
				
				case 8: 
				System.out.println("B");
				break;
				
				case 7: 
				System.out.println("c");
				break;
				
				case 6: 
				System.out.println("D");
				break;
				
				default:
				System.out.println("E");
				break;
				}     
		else
			System.out.println("error");
    }
}