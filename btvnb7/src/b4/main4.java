package b4;

import b6.SinhVien;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        MyPoint[] points= nhapDiem();
        maxDistance(points);

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
    public static void maxDistance(MyPoint[] point) {
        double max=0;
        int a= 0;
        int b = 0;

        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point.length; j++) {
                double x = Math.abs(point[i].x - point[j].x) ;
                double y = Math.abs(point[i].y - point[j].y) ;

                if (max<  Math.sqrt(x*x + y*y)){
                    max = Math.sqrt(x*x + y*y);
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("tạo độ điểm a: x="+ point[a].x+" y="+ point[a].y);
        System.out.println("tạo độ điểm b: x="+ point[b].x+" y="+ point[b].y);

        System.out.println("khoảng cách lớn nhất max= " +max);
    }



}
