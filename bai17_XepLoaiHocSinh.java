import java.util.Scanner;

public class bai17_XepLoaiHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dtb;
        System.out.println("nhap dtb ");
        dtb = sc.nextInt();
        if(dtb >= 0  &&  dtb <5) {
            System.out.println("yeu");
        }else if(dtb >=5 && dtb < 7 ){
            System.out.println("trung binh");
        }else if(dtb >= 7 && dtb <9){
            System.out.println("kha");
        }else if(dtb >=9 && dtb <10){
            System.out.println("gioi");
        }else if(dtb==10){
            System.out.println("gioi");
        }else{
            System.out.println("khong hop le nhap lai");
           }
        }
    }
    

