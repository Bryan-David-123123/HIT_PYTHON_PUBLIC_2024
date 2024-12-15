package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher extends Person{
	private String subject;
	
	public Teacher() {
		super();
	}

	public Teacher(String name, int age,String subject) {
		super(name,age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return "Ten: "+this.name+", Tuoi:"+this.age+", mon day: "+this.subject;		
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", getInfo()=" + getInfo() + "]";
	}
	public void nhapThongTin() throws batloi {
		super.nhapThongTin();
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap mon day hoc: ");
			this.subject=sc.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Yeu cau nhap dung dinh dang");
		}
	}
	
}
