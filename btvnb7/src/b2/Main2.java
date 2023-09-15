package b2;

import b1.SinhVien1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        SinhVien1[] mangSv=nhapThem();
        inThongTin(mangSv);
        System.out.println("Sap xep theo ten; ");
        sapXepTheoTen(mangSv);
        inThongTin(mangSv);
        System.out.println("Sap xep theo lop: ");
        sapXepTheolop(mangSv);
        inThongTin(mangSv);

    }
    public static SinhVien1[] nhapThem(){
        System.out.println("nhập n sinh viên: ");
        int n= new Scanner(System.in).nextInt();

        SinhVien1[] mangSv = new SinhVien1[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập vào thông tin sinh viên: ");
            mangSv[i]= new SinhVien1();
            mangSv[i].nhapThongTin();
        }
        return mangSv;
    }
    public static void inThongTin(SinhVien1[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sapXepTheoTen(SinhVien1[] ten){
        Arrays.sort(ten, new Comparator<SinhVien1>() {
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2) {
                return o1.ten.compareTo(o2.ten);
            }
        });
    }
    public static void sapXepTheolop(SinhVien1[] lop){
        Arrays.sort(lop, new Comparator<SinhVien1>() {
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2) {
                return o1.lop.compareTo(o2.lop);
            }
        });
    }
//        Arrays.sort(ten, new Comparator<SinhVien1>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String ten1 = o1.substring(0,o1.lastIndexOf(o1));
//                String ten2 = o2.substring(0,o2.lastIndexOf(o2));
//                int compare= ten1.compareTo(ten2);
//                if (compare==0){
//                }
//                return compare;
//            }
//        });
//    }
}

