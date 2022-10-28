public class a3 {
    public static void main(String[] args) {
        for (int i=7; i<1; i--) {
            for (int k=1; k<7; k++) {
                if (k>=i)
                    System.out.printf("*");
                else 
                    System.out.printf("%d", k);
            }
            System.out.println("");
        }
    }
}