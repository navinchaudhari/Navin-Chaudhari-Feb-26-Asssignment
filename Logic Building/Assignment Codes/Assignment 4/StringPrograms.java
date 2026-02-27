import java.util.*;
class StringPrograms{

	public static void reverseString(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		char[] ch = s.toCharArray();
		for(int i=ch.length-1; i>=0; i--){
			System.out.print(""+ch[i]);
		}
	}
	
	public static void countVowels(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		
		int count=0;
		char[] vowels={'a','e', 'i', 'o', 'u'};
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<vowels.length; j++){
				if(ch[i]==vowels[j])
					count++;
			}
		}
		System.out.println ("The number of vowels are : "+ count);
	}


	public static void palindromString(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		char[] ch = s.toCharArray();
		String reverse="";
		for(int i=ch.length-1; i>=0; i--){
			reverse+=ch[i];
		}
		if(s.equals(reverse)){
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");			
		}
	}

	public static void checkStringLiteralObject(){

		String str1="hello";
		String str2="hello";
		
		if(str1==str2)
			System.out.println("Both variables point to the same object: "+ true);
		else
			System.out.println("Both variables not point to the same object: "+ false);
	}

	public static void checkStringUsingNew(){

		String str1=new String("hello");
		String str2=new String("hello");
		
		if(str1==str2)
			System.out.println("Using ==: "+ true);
		else
			System.out.println("Using ==: "+ false);

		if(str1.equals(str2))
			System.out.println("Using .equals(): "+ true);
		else 
			System.out.println("Using .equals(): "+ false);
	}

	public static void stringConcatinationAndObjectCheck(){

		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + str2;
		
		if(str1==str3)
			System.out.println("Is str3 pointing to the same object as str1? "+ true);
		else
			System.out.println("Is str3 pointing to the same object as str1? "+ false);
	}
	
	public static void stringPoolWithInternMethod(){

		String str1 = new String("hello");
		String str2 = str1.intern();
		String str3 = "hello";
		
		if(str2==str3)
			System.out.println("Is str2 and str3 pointing to the same object? "+ true);
		else
			System.out.println("Is str2 and str3 pointing to the same object? "+ false);
	}

	public static void checkMultipleStringLiterals(){

		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hello";
		
		if(str1 == str2 && str2 == str3)
			System.out.println("All strings point to the same object: "+ true);
		else
			System.out.println("All strings point to the same object: "+ false);
	}


	public static void main(String args[]){
		
		//reverseString();
		//countVowels();
		//palindromString();
		//checkStringLiteralObject();
		//checkStringUsingNew();
		//stringConcatinationAndObjectCheck();
		//stringPoolWithInternMethod();
		checkMultipleStringLiterals();
	}

}