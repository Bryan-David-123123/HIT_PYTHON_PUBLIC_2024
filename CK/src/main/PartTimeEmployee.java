package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	private int workingHours;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, int paymentPerHour,int workingHours) {
		super(name,paymentPerHour);
		this.workingHours = workingHours;
	}
	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return getPaymentPerHour()*this.workingHours;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [getWorking=" + getWorkingHours() + ", Salary=" + calculateSalary()
				+ "]";
	}
	
	public void nhapThongTin() throws batloi {
		super.nhapThongTin();
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Nhap gio lam: ");
			this.workingHours=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Yeu cau nhap dung dinh dang");
		}
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("So gio lam: "+this.workingHours);
		System.out.println("Luong: "+calculateSalary());
	}
}
