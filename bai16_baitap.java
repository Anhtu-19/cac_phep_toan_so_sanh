import java.util.Scanner;

public class bai16_baitap {
    private static Object sc;

    public static void main(String[] args) {
        double r, chuVi, dienTich;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ban kinh r :" );
        r=sc.nextDouble();
        chuVi = 2*Math.PI*r;
        System.out.println("chu vi"+chuVi);
        System.out.println("chu vi"+Math.round(chuVi));
        //dien tich
        dienTich = 2*Math.PI*Math.pow(r,2);
        System.out.println("dien tich "+dienTich);
        System.out.println("dien tich "+Math.round(dienTich));


    }
    
}
