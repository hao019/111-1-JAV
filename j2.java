public class j2	 {
    public static void main(String[] args) {
		int blank = 5;
		int star = 0;
        int a = 5;
        int b = 5;

        for (int row = 0; row < 9 ;) {
            
            for (int col = 0; col <11; col++) {

                if (col >= a && col <= b) {
                    System.out.print(" ");
                }
                
                else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
            a=a-1;
            b=b+1;

            
            if(row < 4) {
                blank -= 1;
                star += 2;
                row += 1;
            }
            else{
                blank += 1;
                star -= 2;
                row += 1;
            }
            
        }
    }
}