package b3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("nhap chieu rong: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.println("nhap chieu dai: ");
        double height = new Scanner(System.in).nextDouble();
        System.out.println("nhap color: ");
        String color = new Scanner(System.in).nextLine();

        Rectangle rect = new Rectangle(width, height, color);
        System.out.println("Chieu rong: " + rect.getWidth() );
        System.out.println("Chieu dai: " + rect.getHeight() );
        System.out.println("Mau sac: " + rect.getColor() );
        System.out.println("Chu vi: " + rect.findPerimeter() );
        System.out.println("Dien tich: " + rect.findArea() );


    }
//    public static void rectange(){
//        Rectange[] a= new Rectange[1];
//        a[0]=new Rectange();
//        a[0].width=1;
//        a[0].height=1;
//        System.out.println(a[0]);
//    }
//    public static void rectange(Rectange[] x){
//        x[0]=new Rectange();
//        System.out.println("Nhập thông số cho hình chữ nhật: ");
//        x[0].nhapThongSo();
//        System.out.println(x[0]);
//    }
//    public static double getWidth(Rectange[] x){
//        double y =x[0].width;
//        return y;
//    }
//    public static void setWidth(Rectange[] x){
//        System.out.println("nhập chiều rộng mới: ");
//        double n = new Scanner(System.in).nextDouble();
//        x[0].width=n;
//        System.out.println(x[0]);
//    }
//    public static double getHeight(Rectange[] x){
//        double y =x[0].height;
//        return y;
//    }
//
//    public static void setHeight(Rectange[] x){
//        System.out.println("nhập chiều dài mới: ");
//        double n = new Scanner(System.in).nextDouble();
//        x[0].height=n;
//        System.out.println(x[0]);
//    }
//    public static String getColor(Rectange[] x){
//        return x[0].color;
//    }
//    public static void setColor(Rectange[] x){
//        System.out.println("Nhập màu: ");
//        String a = new Scanner(System.in).nextLine();
//        x[0].color=a;
//        System.out.println(x[0]);
//    }
//    public static double getArea(Rectange[] x){
//        double a= x[0].height * x[0].width;
//        return a;
//    }
//    public static double getPerimeter(Rectange[] x){
//        double a= (x[0].height + x[0].width)*2;
//        return a;
//    }



}
