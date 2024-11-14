package core;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Nguoi {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	public Nguoi() {
		
	}
	public Nguoi(String hoTen, String ngaySinh, String diaChi) {
		
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
	}
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);

		try {
			System.out.println("Nhap ho ten:");
			this.hoTen=sc.nextLine();
			System.out.println("Nhap ngay sinh:");
			this.ngaySinh=sc.nextLine();
			System.out.println("Nhap dia chi:");
			this.diaChi=sc.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("yeu cau nhap dung dinh dang");
		}catch(Exception e) {
			System.out.println("Co loi xay ra");
		}
	}
	public void inThongTin() {
		System.out.println("Ho ten: "+this.hoTen);
		System.out.println("Dia chi: "+this.diaChi);
		System.out.println("Ngay sinh: "+this.ngaySinh);
	}
}
