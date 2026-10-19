public class baiTap26_contineuBreak {
    public static void main(String[] args) {
        int m=1;
        int tong =0;
        //int n;
        for(int i =1; i<=10; i++){
            //System.out.println(i);
            System.out.println(m);
            m=i*m;
            tong+=m;
            System.out.println("tong: "+tong);
        }
    }

    
}
