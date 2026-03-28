import java.util.Scanner;

class EmpSalarySlip{
	String name;
	int id;
	float salary;
	
	EmpSalarySlip(){}
	EmpSalarySlip(String name, int id, float salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	float HRA(){
		float hra = salary * 0.2f;
		return hra;
	}
	float DA(){
		float da = salary * 0.1f;
		return da;
	}

	float PF(){
		float pf = salary * 0.08f;
		return pf;
	}	

	float netSalary(){
		float net = (salary + HRA() + DA()) - PF();
		return net;
	}

	void salarySlip(){
		System.out.println("**Employee Salary Slip**");
		System.out.println("Name           : " + name);
		System.out.println("Id             : " + id);
		System.out.println("Basic Salary   : " + salary);
		System.out.println("HRA            : " + HRA());
		System.out.println("DA             : " + DA());
		System.out.println("PF  	       : " + PF());
		System.out.println("Net Salary     : " + netSalary());
	
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();

		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Salary: ");
		float salary = sc.nextFloat();
		
		EmpSalarySlip es = new EmpSalarySlip(name, id, salary);
		es.salarySlip();

	}
}