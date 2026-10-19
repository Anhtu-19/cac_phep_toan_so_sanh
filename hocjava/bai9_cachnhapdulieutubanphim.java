import java.util.Scanner;

public class bai9_cachnhapdulieutubanphim {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vao Ho va Ten");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhap Vao Ma Sinh Vien");
        long maSinhVien =sc.nextLong();
        System.out.println("Nhap Vao Diem Kiem Tra");
        float diemThi = sc.nextFloat();
        System.out.println("---------");
        System.out.println("Ho Va Ten "+hoVaTen);
        System.out.println("Ma Sing Vien"+maSinhVien);
         System.out.println("Diem Thi"+diemThi);
    }
}

