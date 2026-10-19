import java.util.Scanner;

public class bai14_cacpheptoansosanh {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("nhap a =");
        a= sc.nextInt();
        System.out.println("nhap b =");
        b = sc.nextInt();
         
        System.out.println(a+" == "+b+" : "+(a==b));
        System.out.println(a+" != "+b+" : "+(a!=b));
        System.out.println(a+" < "+b+": "+(a<b));
        System.out.println(a+" <= "+b+":"+(a<=b));
        System.out.println(a+ ">"+b+" : "+(a>b));
        System.out.println(a+ ">="+b+":"+(a>=b));
        System.out.println("ca hai la so chan" +(a%2==0 && b%2==0));
        System.out.println("co it nhat mot so chia het cho 2" +(a%2==0 || b%2==0));
        

    }
    
}
