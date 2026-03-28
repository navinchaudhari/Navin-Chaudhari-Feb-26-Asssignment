import java.util.Scanner;

class Result{
	String name;
	int rollNo;
	int m;
	int e;
	int s;
	int h;
	int g;
	
	Result(){}

	Result(String name, int rollNo, int m, int e, int s, int h, int g){
		this.rollNo = rollNo;
		this.name = name;
		this.m = m;
		this.e = e;
		this.s = s;
		this.h = h;
		this.g = g;
	}
	
	int total(){
		int total = m + s + h + e + g;
		return total;
	}

	int average(){
		int avg = total() / 5;
		return avg;
	}

	float percentage(){
		float per = (total() / 500f) * 100;
		return per;
	}

	char grade(){
		if(percentage() >= 90 && percentage() <=100){
			return 'A';
		} else if(percentage() >= 75 && percentage() < 90){
			return 'B';
		} else if(percentage() >= 60 && percentage() <= 74){
			return 'C';
		} else if(percentage() >= 40 && percentage() < 60){
			return 'D';
		}
		return 'F';

	}

	void displayResult(){
		System.out.println("	**Student Result**");
		System.out.println("Name   	  : " + name);
		System.out.println("RollNo	  : " + rollNo);
		System.out.println("Total 	  : " + total());
		System.out.println("Percentage    : " + percentage());
		System.out.println("Grade	  : " + grade());

		if(grade() != 'F')
			System.out.println("You are Promopted");
		else
			System.out.println("You are not Promopted");
		

	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Roll No: ");
		int rollNo = sc.nextInt();
		

		System.out.println("Enter Marks ");
		System.out.print("Maths: ");
		int m = sc.nextInt();

		System.out.print("Science: ");
		int s = sc.nextInt();

		System.out.print("History: ");
		int h = sc.nextInt();

		System.out.print("English: ");
		int e = sc.nextInt();

		System.out.print("Geography: ");
		int g = sc.nextInt();

		Result rs = new Result(name, rollNo, m, e, s, h, g);
		rs.displayResult();
		

	}
	

}