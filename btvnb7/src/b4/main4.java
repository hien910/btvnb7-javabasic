package b4;

import b6.SinhVien;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        MyPoint[] points= nhapDiem();
        distance(points);

    }
    public static MyPoint[] nhapDiem(){
        System.out.println("Nhập số điểm: ");
        int n =new Scanner(System.in).nextInt();
        MyPoint[] point = new MyPoint[n];

        for (int i = 0; i < n; i++) {
            point[i] =new MyPoint();
            point[i].nhapToaDo();
        }
        return point;
    }
    public static void distance(MyPoint[] point) {
        double max=0;
        double a= 0;
        double b = 0;

        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point.length; j++) {
                double x = Math.abs(point[i].x - point[j].x) * Math.abs(point[i].x - point[j].x);
                double y = Math.abs(point[i].y - point[j].y) * Math.abs(point[i].y - point[j].y);
                if (max<Math.sqrt(x + y)){
                    max = Math.sqrt(x + y);
                    a=i;
                    b=j;
                }
            }

        }
        System.out.println("tạo độ điểm a");
        System.out.println(max);
    }



}
