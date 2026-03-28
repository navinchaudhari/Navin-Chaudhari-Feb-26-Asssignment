import java.util.Scanner;

class ATM{
	
	String name;
	long balance;
	
	ATM(String name, long balance){
		this.name = name;
		this.balance = balance;
	}

	void checkBalance(){
		System.out.println("Balance: " + balance);
	}
	
	void depositMoney(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		long amount = sc.nextLong();

		if(amount > 0){
			balance += amount;
			System.out.println("Success");
		}else
			System.out.println("Failed");
	}

	void withdrawMoney(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		long amount = sc.nextLong();

		if(amount > 0 && balance > amount){
			balance -= amount;
			System.out.println("Success");
		}else
			System.out.println("Failed");

	}

	void menuDrivenProgram(){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Enter 1 for Balance check, 2 for Deposite, 3 for Withdrawal, 4 for Exit");
			System.out.println("Enter number: ");
			choice = sc.nextInt();
	
			switch(choice){
				
				case 1 : checkBalance();
					break;

				case 2 : depositMoney();
					break;

				case 3 : withdrawMoney();
					break;

				case 4 : System.out.println("EXIT");
					break;

				default : System.out.println("Wrong Number");
			
			}
		} while(choice != 4);
	}

	public static void main(String args[]){


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Amount: ");
		long amount = sc.nextLong();
		
		ATM atm = new ATM(name, amount);
		atm.menuDrivenProgram();
	}



}