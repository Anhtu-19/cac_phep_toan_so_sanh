import java.util.Scanner;

public class bai23_VonglapWhile {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x!=0) {
            System.out.println("nhap x = 0 de thoa; nhap so khac de tiep tuc");
            x=sc.nextInt();
        }
        int i=0;
        while (true) {
            System.out.println(i);
            i++;
            break;
        }
    }/* */
    /*public static void main(String[] args) {
        int x = 0;
        while (x<=5) {
            System.out.println("x = "+x);
            x++;
        }
    }/* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vào sóp nguyên từ  1-99: ");
        int n = sc.nextInt();
        while ( n< 1 || n > 99 ) {
            System.out.println("nhập lại n từ 99");
            n=sc.nextInt();
        }
        System.out.println("bạn đã nhập xong");
    }
}


