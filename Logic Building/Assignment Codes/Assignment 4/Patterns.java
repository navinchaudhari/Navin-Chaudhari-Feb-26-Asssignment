class Patterns{

	

	public static void problem15(){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				if(j<i)
				System.out.print(i+"*");
				else
				System.out.print(i);
			}
			System.out.println();
		}	
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				if(j<i)
				System.out.print(i+"*");
				else
				System.out.print(i);
			}
			System.out.println();
		}
	
	}

	public static void problem16(){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				if(j<i)
				System.out.print(j+"*");
				else
				System.out.print(j);
			}
			System.out.println();
		}	
	
	}


	public static void problem17(){
		
		for(int i=1; i<=5; i++){
			int n=1;
			for(int j=1; j<=i; j++){
				
				if(j<i){
					System.out.print(n +"*");
					n+=2;
				}
				else{
					System.out.print(n++);
					n+=2;
				}
			}
			System.out.println();
		}	
	
	}


	public static void problem18(){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print(i);
			}
			System.out.println();
		}	
	
	}

	public static void problem19(){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}	
	
	}

	public static void problem20(){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}	
	
	}

	public static void problem21(){
		int num=1;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num++ + " ");
			}
			System.out.println();
		}	
	
	}
	
	public static void problem22(){
		
		for(int i=1; i<=6; i++){
			for(int j=1; j<=6; j++){
				if((i==1 || i==6) || (j==1 || j==6))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void problem23(){
		
		for(int i=1; i<=6; i++){
			for(int j=1;j<=6-i ; j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=6; i>=0; i--){
			for(int j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String args[]){
		//problem15();
		//problem16();
		//problem17();
		//problem18();
		//problem19();
		//problem20();
		//problem21();
		//problem22();
		problem23();
	}


}