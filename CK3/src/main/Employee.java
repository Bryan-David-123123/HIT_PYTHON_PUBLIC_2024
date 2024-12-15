package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee extends Person{
	private String department;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age,String subject,String department) {
		super(name,age);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return "Ten: "+this.name+", Tuoi:"+this.age+", phong ban: "+this.department;
	}
	
	public void nhapThongTin() throws batloi {
		super.nhapThongTin();
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap phong ban: ");
			this.department=sc.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Yeu cau nhap dung dinh dang");
		}
	}
}
