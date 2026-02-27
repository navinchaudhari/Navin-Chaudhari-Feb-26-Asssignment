import java.util.Scanner;
class Grade{


	public static void gradeEvaluation(int maths, int science, int history){

		int avg=(maths+science+history)/3;
		
		if(avg>=90){
			System.out.println("Grade: A");	

		} else if(avg>=70 && avg<90){
			System.out.println("Grade: B");

		} else if(avg>=50 && avg<70){
			System.out.println("Grade: C");

		} else if(avg>=30 && avg<50){
			System.out.println("Grade: D");

		} else {
			System.out.println("Fail");
		}


	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Maths marks : ");
		int maths = sc.nextInt();

		System.out.println("Enter Science marks : ");
		int science = sc.nextInt();

		System.out.println("Enter History marks : ");
		int history = sc.nextInt();
		
		gradeEvaluation(maths,science,history);
	}




}