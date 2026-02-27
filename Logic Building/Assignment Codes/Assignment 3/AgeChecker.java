import java.util.Scanner;

class AgeChecker{

	public static void checkAgeCategory(int age){

		if(age > 0 && age < 18){
			System.out.println("You are a minor");
		}else if(age>=18 && age<=60){
			System.out.println("You are an Adult");
		}else{
			System.out.println("You are a Senior Citizen");
		}
	}
	

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		checkAgeCategory(age);
	}
}