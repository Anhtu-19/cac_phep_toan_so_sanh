import java.util.Scanner;

public class bai17_BaiTapTinhSoDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDien, soTien;
        System.out.println("nhap so dien: ");
        soDien = sc.nextInt();
        System.out.println("nhap so tien: ");
        soTien = sc.nextInt();
        if (soDien <=1 && soDien <=100) {
            soTien = soDien*1200;
            System.out.println("so tien phai tra la: " +soTien);
        }else if (soDien <=101 && soDien <=249) {
            soTien = soDien*1500;
            System.out.println("so tien phai tra la: " +soTien);
        }else if (soDien <=250 && soDien <=400) {
            soTien = soDien*2300;
            System.out.println("so tien phai tra la: " +soTien);
        }else {
            soTien = soDien*3000;
        }

        
    }
    
}
