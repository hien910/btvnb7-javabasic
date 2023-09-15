package b1;

import java.util.Scanner;

public class SinhVien1 {
    public int id;
    public String ten;
    public String lop;
    public String khoa;

    public SinhVien1() {
    }


    @Override
    public String toString() {
        return "SinhVien1{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", lop='" + lop + '\'' +
                ", khoa='" + khoa + '\'' +
                '}';
    }

    public void nhapThongTin(){
        System.out.println("nhập mã sinh viên: ");
        id= new Scanner(System.in).nextInt();
        System.out.println("nhập tên sinh viên: ");
        ten= new Scanner(System.in).nextLine();
        System.out.println("nhập lớp sinh viên: ");
        lop= new Scanner(System.in).nextLine();
        System.out.println("nhập khóa sinh viên: ");
        khoa= new Scanner(System.in).nextLine();
    }
}
