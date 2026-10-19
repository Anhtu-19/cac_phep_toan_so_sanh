import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class baitap_ContineuBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int tong = 0;
        a = sc.nextInt();
        if (a%2 !=0) {
            System.out.println("nhap sai nhap lai");
        }else {
            for (int i=0; i<=a; i+=2){
            tong +=i;
            }
            System.out.println("tong cac so chan tu 0 den " +a+ "=" + tong);
        }
    }
    
}
