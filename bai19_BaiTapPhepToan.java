import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class bai19_BaiTapPhepToan {
    /**
     * @param args
     */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("moi nhap vao so: ");
        System.out.println("nhap a ");
         a = sc.nextInt();
         System.out.println("nhap b: ");
         b = sc.nextInt();
         System.out.println("nhap phat toan + - * /");
         String phetToan = sc.next();
         switch (phetToan) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);    
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":    
            if (b!=0) {
                System.out.println(a/b);
                
            } else{
                System.out.println("khong chia duoc");
            }   
            break;
            default:
                System.out.println("nhap sai nhap lai");
                break;
        }
    }
}
