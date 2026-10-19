import java.util.Scanner;

public class bai26_BaiTapBreakContineu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so nguyen");
        n = sc.nextInt();
        int gt=1;
        for (int i=1; i<=n; i++){
            System.out.println( "i");
            gt = gt*i;
            System.out.println(gt);
        }
        
    }
    
}
