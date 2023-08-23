package demo;

import java.util.Scanner;

public class Info {
	Scanner sc=new Scanner(System.in);
	 
	 
	public Employee setEmp() {
		Employee e=new Employee();
		System.out.println("Enter id");
		int id=sc.nextInt();
		e.setId(id);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		e.setName(name);
		System.out.println("Enter salary");
		float salary=sc.nextFloat();
		e.setSalary(salary);
		return e;
	}
	
	public String getEmp(Employee e) {
		return  "Name is"+e.name+"\n"+"Id is"+e.id+"\n"+"Salary is"+e.salary;
	}
	
	
	public static void main(String[] args) {
		Info i=new Info();
		Employee e=	i.setEmp();

		
		String result=i.getEmp(e);
		System.out.println(result);
	}
	
	
}
