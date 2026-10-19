import java.util.Scanner;

public class baitap_SoNguyenTo {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhap vao mot so  nguyen a lon hon khong: ");
        a=sc.nextInt();
        while(a<=0){  
               System.out.println("ban nhap sai nhap lai: ");
               a=sc.nextInt();
        }
        System.out.println("ban da nhap a thanh cong: " + a);      
        int demUoc=0;
        for (int i=1;i<=a;i++){
            if(a%i==0)
                demUoc++;
        }
        if(demUoc==2)
            System.out.println( a + " dem uoc l so nguyen to");
        else
            System.out.println( a + " khonng phai la so nguyen to ");
       System.out.println(" ban co muon thoat khong ");
            String traLoi  = sc.nextLine();
            if(traLoi.equals("y") || traLoi.equals("y"))
                break;
        }
    }
}
