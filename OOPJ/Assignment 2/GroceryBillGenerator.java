import java.util.Scanner;

class GroceryBillGenerator{
	
	String name;
	int quantity;
	float price;
	GroceryBillGenerator gbg[];
	
	Scanner sc = new Scanner(System.in);	

	GroceryBillGenerator(){}
	
	GroceryBillGenerator(String name, int quantity, float price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	float discount(){
		if(total() > 3000){
			return total() * 0.10f;
		}
		return 0;
	}

	float total(){
		float totalAmount = 0;
		for(int i = 0; i < gbg.length; i++){
			totalAmount = totalAmount + (gbg[i].quantity * gbg[i].price);
		}
		return totalAmount;
	}
	
	GroceryBillGenerator addItems(){

		System.out.print("Enter Item name: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Enter Item Quantity: ");
		int quantity = sc.nextInt();

		System.out.print("Enter Item Price: ");
		float price = sc.nextFloat();

		GroceryBillGenerator gbg = new GroceryBillGenerator(name, quantity, price);
		
		return gbg;
	}
	
	void listOfItems(){
		System.out.print("Number of Items: ");
		int n = sc.nextInt();
		gbg = new GroceryBillGenerator[n];
		
		for(int i = 0; i<n; i++){
			gbg[i] = addItems();
		}
	}
	
	void printItems(){
			System.out.println("	**Grocery Shopping List**");
			System.out.println("Item Name	" + "Quantity	"+ "Price");	
		for(int i = 0; i < gbg.length; i++){
			System.out.println(gbg[i].name + "		" + gbg[i].quantity + "		"+ gbg[i].price);
		}
			System.out.println("Total				" + total());
			if(discount() > 0){
			System.out.println("Discount		        " + discount());
			System.out.println("Final Payment			" + (total() - discount()));			
			}
	}

	public static void main(String args[]){
		GroceryBillGenerator gbg = new GroceryBillGenerator();
		gbg.listOfItems();
		gbg.printItems();
	}

}