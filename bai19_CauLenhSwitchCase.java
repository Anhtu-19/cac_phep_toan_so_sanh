import java.util.Scanner;

public class bai19_CauLenhSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap tu 0 den 8");
        n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("thu 2");
                break;
            case 2:
                System.out.println("thu 3");
                break;
            case 3:
                System.out.println("thu 4");
                break;
            case 4:
                System.out.println("thu5");
                break;
            case 5:
                System.out.println("thu 6");
                break;
            case 6:
                System.out.println(" thu 7");
                break;
            case 7:
                System.out.println("ch nhat ");
                break;
            default:
                System.out.println("khong hop le nhap lai");
                break;
        }
    }
    
}
