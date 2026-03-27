import java.util.Scanner;
class EleBill{
	String name;
	long consNo;
	int units;

	EleBill(String name, long consNo, int units){
		this.name = name;
		this.consNo = consNo;
		this.units = units;
	}
	
	double calculateBill(){
		double totalBill;
		if(units <= 100){
			totalBill = units * 5;
		}else if(units > 100 && units <= 200){
			totalBill = (100 * 5) + ((units - 100) * 7);
		}else{
			totalBill = (100 * 5) + (100 * 7) + ((units - 200) * 10);	
		}
		
		if(totalBill > 1500){
			totalBill = (totalBill * 0.05) + totalBill; 
		}
		return totalBill;
	}

	void displayBillDetails(){
		System.out.println("	**Electricity Bill**");
		System.out.println("Consumer Name   : " + name);
		System.out.println("Consumer Number : " + consNo);
		System.out.println("Total Units     : " + units);
		System.out.println("Total Bill      : " + calculateBill());		
		
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Consumer No: ");
		long consNo = sc.nextLong();

		System.out.print("Enter Units: ");	
		int units = sc.nextInt();

		EleBill eb = new EleBill(name, consNo, units);
		eb.displayBillDetails();


	}



}