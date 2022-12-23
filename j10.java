import java.util.Scanner;
public class j10 {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num:");
        num = input.nextInt();

        int [] myArr = {7,5,4,9,8,1,2};
        int [] flag = new int [myArr.length];
        int flag_count = 1;
        int index = 0;
        int med = 0;
        
        for(int i=0; i<myArr.length; i++){
            int flag_min = 1000;
            int flag_min_index = 0;
            for (int j=0; j<myArr.length; j++) {
                if (myArr[j] < flag_min && flag[j] == 0) {
                    flag_min = myArr[j];
                    flag_min_index = j;
                    index = j;
                }
            }
            flag[flag_min_index] = flag_count;
            flag_count++;
            System.out.print(flag_count);
            med = myArr[flag_min_index];
            if (num == flag[index])
                break;
        }
        System.out.println("med: " + myArr[index]);
    }
}