import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class bai16_lopmathvacachamtoanhoc {
    public static void main(String[] args) {
       //
       double a , b;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao a");
    a=sc.nextDouble();
    System.out.println("nhap vao b");
    b=sc.nextDouble();
    //ham tri tuyet doi
    System.out.println("|a|="+Math.abs(a));
    //ham im min
    System.out.println("min (a,b)=+"+Math.min(a,b));
    System.out.println("max (a,b)="+Math.max(a, b));
    System.out.println("ceil(a,b)="+Math.ceil(a));
    System.out.println("floor(a,b)="+Math.floor(a));
    System.out.println("sqrt(a,b)="+Math.sqrt(a));
    System.out.println("pow(a,b)="+Math.pow(a, b));

   
    }
}




