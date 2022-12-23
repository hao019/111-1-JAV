public class j11 {
    public static void main(String[] args) {


        int [] myArr = {7,5,4,9,8,1,2};
        int [] flag = new int [myArr.length];
        int a = 0;
        int b = 0;
        double c = 0;
        
        for(int i=0; i<=3; i++){
            b = (a+1);
            c = myArr[a] + myArr[b];
            c = c/2;
            System.out.println("out:" + c);
            a = a+2;
        }
        System.out.println("out:"+(myArr.length-1));
    }
}