public class ham {
    public static void main(String[] args) {
        int kq = cong(1 , 2, 3);
       
        int kq2 = cong(4, 5, 6);
         System.out.println(" tong cac so bang " + kq );
        System.out.println(" tong cac so bang " + kq2 );
        XinChao("male");
        XinChao("femal");
    }
    public static int cong(int x, int y, int z ){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x+y+z;
    }
    public static void XinChao(String gioitinh){
        if (gioitinh.equals("female")) 
            System.out.println("XIn chao, toi la nhan vien nu");
        else if (gioitinh.equals("male"))
            System.out.println("Xin chao toi la nhan vien nam");
        else
            System.out.println("ban nhap sai roi");
    }
}
