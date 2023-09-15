package b1;

import b6.SinhVien;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        SinhVien1[] tenSv = new SinhVien1[1];
        tenSv[0] = new SinhVien1();
        tenSv[0].nhapThongTin();
        System.out.println(tenSv[0]);
    }
}


