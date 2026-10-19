import java.util.Scanner;

public class cacpheptoncoban {
    public static void main (String[] args) {
        // khai bao bien
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a =");
        a = sc.nextInt();
        System.out.println("nhap b = ");
        b= sc.nextInt();
        int tong = a+b;
       System.out.println(a+"+"+b+"="+tong);
        int hieu = a-b;
       System.out.println(a+"-"+b+"="+hieu);
        int tich = a*b;
       System.out.println(a+"*"+b+"="+tich);
        float thuong =(float) a/b;
       System.out.println(a+"/"+b+"="+thuong);
        int soDu = a%b;
       System.out.println(a+"%"+b+"="+soDu);





    }
    
}
