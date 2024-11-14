package core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SVCDN extends Nguoi implements TinhDiem{
	private int maSinhVien;
	private double tongDiemKiemTra;
	private int soMonKiemTra;
	public SVCDN() {
		super();
	}
	public SVCDN(String hoTen, String ngaySinh, String diaChi,int maSinhVien,double tongDiemKiemTra, int soMonKiemTra) {
		super(hoTen,ngaySinh,diaChi);
		this.maSinhVien=maSinhVien;
		this.tongDiemKiemTra = tongDiemKiemTra;
		this.soMonKiemTra = soMonKiemTra;
	}
	public double getMaSinhVien() {
		return maSinhVien;
	}
	public double getTongDiemKiemTra() {
		return tongDiemKiemTra;
	}
	public int getSoMonKiemTra() {
		return soMonKiemTra;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public void setTongDiemKiemTra(double tongDiemKiemTra) {
		this.tongDiemKiemTra = tongDiemKiemTra;
	}
	public void setSoMonKiemTra(int soMonKiemTra) {
		this.soMonKiemTra = soMonKiemTra;
	}
	@Override
	public String toString() {
		return "SVCDN [tongDiemKiemTra=" + tongDiemKiemTra + ", soMonKiemTra=" + soMonKiemTra + "]";
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc=new Scanner(System.in);

		try {
			System.out.println("Nhap ma sinh vien: ");
			this.maSinhVien=sc.nextInt();
			System.out.println("Nhap tong diem kiem tra: ");
			this.tongDiemKiemTra=sc.nextDouble();
			System.out.println("Nhap so mon kiem tra: ");
			this.soMonKiemTra=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("yeu cau nhap dung dinh dang");
		}catch(Exception e) {
			System.out.println("Co loi xay ra");
		}
	}
	@Override
	public double tinhDiem() {
		return this.tongDiemKiemTra/this.soMonKiemTra;
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Ma sinh vien: "+this.maSinhVien);
		System.out.println("Tinh diem: "+this.tinhDiem());
	}
}
