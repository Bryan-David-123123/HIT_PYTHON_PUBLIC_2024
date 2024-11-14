package core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SVCDCQ extends Nguoi implements TinhDiem{
	private int maSinhVien;
	private double tongDiemKiemTra;
	private int soMonKiemTra;
	private double diemThiKetThucHocPhan;
	public SVCDCQ() {
		super();
	}
	public SVCDCQ(String hoTen, String ngaySinh, String diaChi,int maSinhVien,double tongDiemKiemTra, int soMonKiemTra, double diemThiKetThucHocPhan) {
		super(hoTen,ngaySinh,diaChi);
		this.maSinhVien=maSinhVien;
		this.tongDiemKiemTra = tongDiemKiemTra;
		this.soMonKiemTra = soMonKiemTra;
		this.diemThiKetThucHocPhan = diemThiKetThucHocPhan;
	}
	public int getmaSinhVien() {
		return maSinhVien;
	}
	public double getTongDiemKiemTra() {
		return tongDiemKiemTra;
	}
	public int getSoMonKiemTra() {
		return soMonKiemTra;
	}
	public double getDiemThiKetThucHocPhan() {
		return diemThiKetThucHocPhan;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien=maSinhVien;
	}
	public void setTongDiemKiemTra(double tongDiemKiemTra) {
		this.tongDiemKiemTra = tongDiemKiemTra;
	}
	public void setSoMonKiemTra(int soMonKiemTra) {
		this.soMonKiemTra = soMonKiemTra;
	}
	public void setDiemThiKetThucHocPhan(double diemThiKetThucHocPhan) {
		this.diemThiKetThucHocPhan = diemThiKetThucHocPhan;
	}
	@Override
	public String toString() {
		return "SVCDCQ [tongDiemKiemTra=" + tongDiemKiemTra + ", soMonKiemTra=" + soMonKiemTra
				+ ", diemThiKetThucHocPhan=" + diemThiKetThucHocPhan + "]";
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
			System.out.println("Nhap diem thi kthp: ");
			this.diemThiKetThucHocPhan=sc.nextDouble();
		}catch(InputMismatchException e) {
			System.out.println("yeu cau nhap dung dinh dang");
		}catch(Exception e) {
			System.out.println("Co loi xay ra");
		}
	}
	@Override
	public double tinhDiem() {
		return (this.tongDiemKiemTra/this.soMonKiemTra + this.diemThiKetThucHocPhan)/3;
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Ma sinh vien:"+this.maSinhVien);
		System.out.println("Diem thi: "+this.tinhDiem());
	}
}
