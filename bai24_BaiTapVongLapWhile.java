import java.util.Scanner;

public class bai24_BaiTapVongLapWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("nhap vao so n>o");
        n=sc.nextInt();
        String nhiPhan = "";
        while(n>0){
            nhiPhan=( n % 2) + nhiPhan;
            n=n/2;
        }
    System.out.println("he nhi phan la" + nhiPhan);
    }
    
}
