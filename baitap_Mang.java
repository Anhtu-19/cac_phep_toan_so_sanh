public class baitap_Mang {
    public static void main(String[] args) {
        
    }
    public static String ptBacHai(double a,double b,double c) {
        if(a==0){
            if (a==0 && b==0)
            return "phuong trinh bac nhat vo so nghiem";
        else if (b==0 && c!=0){
            return" phuong trinh vo nghiem";
        

        }
         else
            return "phong trinh co nghiem"+(-c/b);
       
        }
         else {
            double delta = (b*b)-(4*a*c);
            if(delta<0){
                return "phuong trinh vo n";
            }
            else 
                return "phuong trinh co nghiem"+(-c/b);

        }
        else {
            double delta = (b*b)-(4*a*c);
            if (delta>0)
                return "phuong trinh bac 2 VN";
        else if (delta==0)  {
             double x =(-b/2*a);
             return "phuong trinh co N kep = "+x;
        } else
            
           
        }
    }
}
