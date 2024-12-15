package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Person {
	protected String name;
	protected int age;
	protected abstract String getInfo();
	public Person() {
		
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void nhapThongTin() throws batloi {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap ten:");
			this.name=sc.nextLine();
			if(this.name.isBlank()) {
				throw new batloi("Khong duoc de trong thuoc tinh Name");
			}
			System.out.println("Nhap tuoi: ");
			this.age=sc.nextInt();
			if(age<0) {
				throw new batloi("Tuoi phai la so duong");
			}
		}catch(InputMismatchException e) {
			System.out.println("Yeu cau nhap dung dinh dang");
		}
	}
}
