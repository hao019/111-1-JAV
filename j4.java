public class j4 {
    public static void main(String[] args) {
        int[] iArr = {2, 7, 3, 4, 9};
        int t;
        int c=0;
        for (int x = 0; x < iArr.length-1; x++) {
            for (int y = x+1; y < iArr.length; y++) {
                if (iArr[x] > iArr[x+1]) {
                    t = iArr[x];
                        iArr[x] = iArr[x+1];
                        iArr[x+1] = t; 
                }
                c++;
            }
        }

        for (int x = 0; x<iArr.length; x++) {
            System.out.println(">>" + iArr[x]);
        }
        System.out.println(c);
    }
}