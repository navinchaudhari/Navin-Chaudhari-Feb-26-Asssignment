import java.util.*;
class ArrayQuestions{

	static void printElementsOfArray(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		for(int i:arr){
		System.out.print(i + " ");
		}
	}

	static void sumOfArrayElements(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i:arr){
			sum+=i;
		}
		System.out.println(sum);
	}

	static void printStringArray(){
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Name: ");
			arr[i] = sc.next();
		}
		
		for(String s : arr){
			System.out.print(s+" ");
		}	
	}

	static void largestElement(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		int largest=0;
		for(int i:arr){
			if(i>largest){
				largest=i;
			}
		}
		System.out.println("Largest Element is: "+largest);
	}

	static void avgOfElements(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		
		float sum = 0;
		for(int i:arr){
			sum+=i;
		}
		float avg = (float) sum/5;
		System.out.println("The average of the numbers is: "+ avg);
	}

	static void countPosNeg(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		
		int p=0;
		int n=0;
		for(int i:arr){
			if(i<0){
				n++;
			}else if(i>0){
				p++;
			}
		}
		System.out.println("Positive numbers: "+ p);
		System.out.println("Negative numbers: "+ n);
	}

	static void sortArray(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Before sort");
		for(int i:arr){
			System.out.print(i+" ");
		}

		Arrays.sort(arr);
		System.out.println("\nAfter sort");
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	static void findElement(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Number to Search: ");
		int n = sc.nextInt();

		for(int i : arr){
			if(i==n){
				System.out.println("Found");
				break;
			}
		}
	}

	static void findElementUsingBuilIn(){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){	
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Number to Search: ");
		int n = sc.nextInt();
		int index = Arrays.binarySearch(arr, n);
		System.out.println("The number "+ n + " is found at index "+ index);
	}
	public static void main(String args[]){
		//printElementsOfArray();
		//sumOfArrayElements();
		//printStringArray();
		//largestElement();
		//avgOfElements();
		//countPosNeg();
		//sortArray();
		//findElement();
		findElementUsingBuilIn();
	}
































}