public class Bai26_SoHoanHao {
    public static void main(String[] args) {
     /*int n = 6;
       int tong =0;
       for(int i=1; i<n; i++){
       if(n%i==0)
       tong+=i;
       }
       if (tong == n){
       System.out.println( n + "la so hoan hao: ");

      } else{
          System.out.println( n + "khong la so hoan hao: " );
       }/* */
      for(int n=1;n<1000;n++){
        int tong = 0;
        for(int i =1; i<n;i++){
            if(n%i==0)
                tong+=i;
            }
            if (tong==n)
               System.out.print(n+"la so hoan hao ");
            
      }        
    }
}
