package main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) throws batloi {
		PartTimeEmployee[] part_em=new PartTimeEmployee[5];
		FullTimeEmployee[] full_em=new FullTimeEmployee[5];
		for(int i=0;i<5;i++) {
			part_em[i]=new PartTimeEmployee();
			part_em[i].nhapThongTin();
		}
		for(int i=0;i<5;i++) {
			full_em[i]=new FullTimeEmployee();
			full_em[i].nhapThongTin();
		}
//		for(int i=0;i<5;i++) {
//			part_em[i].inThongTin();
//		}
//		for(int i=0;i<5;i++) {
//			full_em[i].inThongTin();
//		}
		Employee[] em=new Employee[10];
		for(int i=0;i<10;i++) {
			em[i]=new Employee();
			if(i<5) {
				em[i]=part_em[i];
			} else {
				em[i]=full_em[i-5];
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(em[i].calculateSalary()<em[j].calculateSalary()) {
					Employee tmp=em[i];
					em[i]=em[j];
					em[j]=tmp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			em[i].inThongTin();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("s=");
		String s=sc.nextLine();
		
		for(int i=0;i<10;i++) {
			if(em[i].getName().equals(s)) {
				System.out.println("Cap nhat lai thong tin: ");
				em[i].nhapThongTin();
				break;
			}
		}
		for(int i=0;i<10;i++) {
			em[i].inThongTin();
		}
	}
}
