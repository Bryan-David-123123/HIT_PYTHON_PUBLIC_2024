package main;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name,paymentPerHour);
	}
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return getPaymentPerHour()*8;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [Salary=" + calculateSalary() + "]";
	}
	
	public void nhapThongTin() throws batloi {
		super.nhapThongTin();
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Luong: "+calculateSalary());
	}
}
