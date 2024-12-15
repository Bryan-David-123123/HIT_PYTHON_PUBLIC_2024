package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee implements IEmployee{
	private String name;
	private int paymentPerHour;
	public Employee() {
		
	}
	public Employee(String name, int paymentPerHour) {
		
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
	public String getName() {
		return name;
	}
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", paymentPerHour=" + paymentPerHour + "]";
	}
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour;
	}
	
	public void nhapThongTin() throws batloi {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Nhap ten: ");
			this.name=sc.nextLine();
			if(this.name.isEmpty()) {
				throw new batloi("Yeu cau nhap lai");
			}
			System.out.println("Nhap tien moi gio: ");
			this.paymentPerHour=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Yeu cau nhap dung dinh dang");
		}
	}
	public void inThongTin() {
		System.out.println("Ten: "+this.name);
		System.out.println("Tien moi gio: "+this.paymentPerHour);
	}
}
