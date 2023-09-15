package b6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien[] mangSv = nhapSinhVien();
        inSinhVien(mangSv);
        doiTTSV(mangSv);
        loaiBoSV(mangSv);
    }
    public static void doiTTSV(SinhVien[] mangSv){
        int x= new Random().nextInt(10);
        System.out.println(x);
        mangSv[x].nhapThongTin();
        System.out.println(Arrays.toString(mangSv));
    }
    public static void loaiBoSV(SinhVien[] mangSv){
        int y= new Random().nextInt(10);
        System.out.println(y);
        SinhVien[] mangSvNew= new SinhVien[mangSv.length-1];
        for (int i = 0; i < mangSvNew.length; i++) {
            if(i>=y){
                mangSvNew[i]=mangSv[i+1];
            } else {
                mangSvNew[i]=mangSv[i];
            }
            System.out.println(mangSvNew[i]);
        }
    }
    public static void inSinhVien(SinhVien[] mangSv){
        for (int i = 0; i < mangSv.length; i++) {
            System.out.println(mangSv[i]);
        }
//        System.out.println(Arrays.toString(mangSv));
    }
    public static SinhVien[] nhapSinhVien() {
        System.out.println("Nhập số sinh viên muốn thêm mới: ");
        int n =new Scanner(System.in).nextInt();
        SinhVien[] mangSv = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ "+ (i+1) +": ");
            mangSv[i] =new SinhVien();
            mangSv[i].nhapThongTin();
        }
        return mangSv;
    }
}
