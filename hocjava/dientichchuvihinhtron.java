package hocjava;

import java.util.Scanner;

public class dientichchuvihinhtron {
    public static void main(String[] args) {
        double r, cv, dt;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap r;");
        r=sc.nextDouble();
        cv=2*Math.PI*r;
        dt=Math.PI*Math.pow(r, 2);
        System.out.println("chu vi"+cv);
        System.out.println("dien tich"+dt);
    }
}
