package core;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("n=");
			n=sc.nextInt();
			if(n<2||n>4) {
				throw new batloi("Yeu cau nhap n trong khoang [2,4]");
			}
			SVCDCQ a[]=new SVCDCQ[n];
			for(int i=0;i<n;i++) {
				a[i]=new SVCDCQ();
				a[i].nhapThongTin();
			}
			for(int i=0;i<n;i++) {
				a[i].inThongTin();
			}
			//Kiem tra msv co ton tai khong
			System.out.println("Nhap msv can kiem tra: ");
			int masv=sc.nextInt();
			boolean tmp=false;
			for(int i=0;i<n;i++) {
				if(masv==a[i].getmaSinhVien()) {
					tmp=true;
					break;
				}
			}
			if(tmp) {
				System.out.println("Ma sinh vien co ton tai");
			} else {
				System.out.println("Ma sinh vien khong ton tai");
			}
			//Sap xep theo diem trung binh
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i].tinhDiem()<a[j].tinhDiem()) {
						SVCDCQ tam=a[i];
						a[i]=a[j];
						a[j]=tam;
					}
				}
			}
			for(int i=0;i<n;i++) {
				a[i].inThongTin();
			}
		}catch(batloi e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("Yeu cau nhap n nguyen");
		}catch (Exception e) {
			System.out.println("Co loi xay ra");
		}finally {
			sc.close();
		}
	}
}
