import java.util.Arrays;

public class j5 {
    public static void main(String[] args){
        int [] a = new int[] {3,4,2,1,1,5};
        //                    4 3 2 1 1 5
        //                    3 2 1 1 4 5
        //                    2 1 1 3 4 5
        //                    1 1 2 3 4 5
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a [j] > a [j+1]){
                    //加不加等於號，對於在陣列相等情況下的排序不造成任何影響
                    int num;
                    num = a[j] + a[j+1];
                    a[j] = num - a[j];
                    a[j+1] = num - a[j+1];
                    /*這是另一種交換資料的方法
                    num = a[j+1];
                    a[j+1] = a[j];
                    a[j] = num;     */
                }
            }
        }
        //列印輸出陣列中的元素
        System.out.println(Arrays.toString(a));
    }
}
