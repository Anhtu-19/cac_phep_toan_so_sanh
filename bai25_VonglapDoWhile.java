import java.util.Scanner;

public class bai25_VonglapDoWhile {
    /*public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
    
        do {
            System.out.println("nhap vao n > 0");
            n=sc.nextInt();
        }while(n<=0);
       
        
    }/* */
   /*public static void main(String[] args) {
        int a = 1;
        int tong = 0;
      
        do {
            tong +=a;
              a++;
        } while (a<=5);
           System.out.println("tong=: " +tong);
    }/* */
    public static void main(String[] args) {
        int n =0;
        while(true) {
            n++;
            System.out.println("n:" +n);
            if (n==9)
            break;
        }
    }
}
