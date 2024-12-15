package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws batloi {
		try {
			Employee[] e=new Employee[5];
			for(int i=0;i<5;i++) {
				e[i]=new Employee();
				e[i].nhapThongTin();
			}
//			for(int i=0;i<5;i++) {
//				System.out.println(e[i].getInfo());
//			}
			for(int i=0;i<5;i++) {
				for(int j=i+1;j<5;j++) {
					if(e[i].getName().compareTo(e[j].getName()) >0) {
						Employee tmp=new Employee();
						tmp=e[j];
						e[j]=e[i];
						e[i]=tmp;
					}
				}
			}
			for(int i=0;i<5;i++) {
			System.out.println(e[i].getInfo());
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap department can tim: ");
			String s=sc.nextLine();
			if(s.isEmpty()) {
				throw new batloi("Yeu cau nhap department");
			}
			for(int i=0;i<5;i++) {
				if(e[i].getDepartment().equals(s)) {
					e[i].nhapThongTin();
				}
			}
			for(int i=0;i<5;i++) {
				for(int j=i+1;j<5;j++) {
					if(e[i].getName().compareTo(e[j].getName()) >0) {
						Employee tmp=new Employee();
						tmp=e[j];
						e[j]=e[i];
						e[i]=tmp;
					}
				}
			}
			for(int i=0;i<5;i++) {
			System.out.println(e[i].getInfo());
			}
		}catch(InputMismatchException e) {
			System.out.println("Yeu cau nhap dung dinh dang");
		}
	}
}
