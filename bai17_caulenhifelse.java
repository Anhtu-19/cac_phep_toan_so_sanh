import java.util.Scanner;

public class bai17_caulenhifelse {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n;
   System.out.println("nhap vao mot so nguyen n: ");
   n=sc.nextInt();
   //kiem tra so le
   if (n%2==0){
    System.out.println( n+ " la so chan");
   }else {
    System.out.println( n+ " la so le" );
   }
}
    }
    

