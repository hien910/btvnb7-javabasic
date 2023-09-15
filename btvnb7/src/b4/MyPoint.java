package b4;

import java.util.Scanner;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
//        this.x = x;
//        this.y = y;
    }

    public MyPoint secondPoint() {
        return secondPoint();
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void nhapToaDo() {
        System.out.println("x= ");
        x = new Scanner(System.in).nextDouble();
        System.out.println("y= ");
        x = new Scanner(System.in).nextDouble();
    }




}
