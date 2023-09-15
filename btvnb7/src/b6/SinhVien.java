package b6;

import java.util.Scanner;

public class SinhVien {
    public int id;
    public String ten;
    public String diaChi;
    public String gioiTinh;
    public float diemTrungBinh;
    public String tenKhoa;

    public SinhVien() {
    }

    public SinhVien(int id, String ten, String diaChi, String gioiTinh, float diemTrungBinh, String tenKhoa) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }

    public void nhapThongTin() {
        System.out.println("nhập mã sinh viên: ");
        id = new Scanner(System.in).nextInt();
        System.out.println("nhập tên sinh viên: ");
        ten = new Scanner(System.in).nextLine();
        System.out.println("nhập địa chỉ sinh viên: ");
        diaChi = new Scanner(System.in).nextLine();
        System.out.println("nhập giới tính sinh viên: ");
        gioiTinh = new Scanner(System.in).nextLine();
        System.out.println("nhập gpa sinh viên: ");
        diemTrungBinh = new Scanner(System.in).nextFloat();
        System.out.println("nhập tên khoa sinh viên: ");
        tenKhoa = new Scanner(System.in).nextLine();
    }
}
