public class j2	 {       //11月18加分題
    public static void main(String[] args) {
		int star = 5;    // *
		int blank = 1;   //空白
        int a = 6;       //左極限
        int b = 6;       //右極限

        for (int row = 1; row < 10 ;) {

            for (int col = 1; col <= 11; col++) {

                if (col >= a && col <= b) {
                    System.out.print(" ");
                }
                
                else {
                    System.out.print("*");
                }

            }
            
            if(row < 5) {
                star -= 1;
                blank += 2;
                a = a - 1;
                b = b + 1;
                row += 1;
            }

            else{
                star += 1;
                blank -= 2;
                a = a + 1;
                b = b - 1;
                row += 1;                
            }

            System.out.print("\n");
        }
    }
}