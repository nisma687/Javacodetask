package project;
import java.util.*;

public class Project{
	
	//public Scanner sc=new Scanner(System.in);
	//public int choose;
	
	
	public static void main(String[] args){
		
		System.out.println("\t\t\t\t+ Welcome to tairaan ordering +");
		System.out.println("\t\t\t\t+===================================+");
		System.out.println("\t\t\t\t            MENU          ");
		System.out.println("\t\t\t\t   1. Pizza             TK. 450.00");
		System.out.println("\t\t\t\t   2. Burger              Tk. 260.00");
		System.out.println("\t\t\t\t   3. pasta           Php. 260.00");
		System.out.println("\t\t\t\t   4. CANCEL                         ");
		System.out.println("\t\t\t\t+====================================+");
		
		System.out.println("\t\t\t\t    Which item do you want to order?         ");
		Scanner sc=new Scanner(System.in);
	    int choose;
		
		Pizza pz=new Pizza(450);
		Burger b=new Burger(260);
		Pasta pt=new Pasta(260);
		
		
		choose=sc.nextInt();
		if(choose==1){
			
			pz.orderConfirmationText();
			System.out.print("How many Pizza you want to Buy? :");
			int x = sc.nextInt();
			pz.setQuantity(x);
			
			boolean wantMore = false;
			
			do{
				System.out.print("Do you want to Buy More Pizza? :");
				wantMore = sc.nextBoolean();
				if(wantMore){
					System.out.print("How many Pizza you want to Buy More? :");
					int y = sc.nextInt();
					pz.updateQuantity(y);
				}
				
			}while(wantMore);
			System.out.println("Do you want more cheez?");
			System.out.println("For more cheez type 'true' else type 'false'");
			boolean wantMoreCheez=sc.nextBoolean();
			if(wantMoreCheez==true){
				 System.out.println("More cheez added");
				 
			}
			
			System.out.println("Your Bill is: " + pz.getTotal());
			
			System.out.println("Enter a payment ");
			double pay = sc.nextDouble();
			double total = pz.getTotal();
			
			if(pay <total){
			  System.out.println("Not enough payment");
			}else{
				total = pay-total;
				System.out.println("The change is " + total);
			}
			
		}
		
		
		
		
			
	}
		
	
}


interface Food{
	
	void orderConfirmationText();
	double getTotal();		
	
}
class Pizza implements Food{
	
private String type;
private double price;
private int quantity;
private boolean extracheez;


Pizza(double price){
	

	this.price=price;
}

Pizza(){
		
}
	
public void setType(String a){

       this.type=a;
}	
public String getType(){
	
	   return type;
}
public void setPrice(double b){

       this.price=b;
}	
public double getPrice(){
	
	    return price;
}
public void setQuantity(int c){

        this.quantity=c;
}	
public int getQuantity(){
	
	     return quantity;
}

public void updateQuantity(int x){
	this.quantity = this.quantity + x;
}

	
	public void orderConfirmationText(){
		
		System.out.println("You have choosen Pizza");
		
		
		
	}
	
	public double getTotal(){
		return this.quantity * this.price;
	}	
		
}

	class Burger implements Food{
	
	
	private String name;
    private double price;
	private int quantity;
	private boolean extracheez;
	private boolean extraspicy;
	
	Burger(){
		
	}
	Burger(double price){
		this.price=price;		
	
	
	}

public void setName(String n ){

       this.name=n;
}	
public String getName(){
	
	   return name;
}
public void setPrice(double b){

       this.price=b;
}	
public double getPrice(){
	
	    return price;
}
public void setQuantity(int c){

        this.quantity=c;
}	
public int getQuantity(){
	
	     return quantity;
}

public void setExtracheez(boolean a){

        this.extracheez=a;
}	
public boolean getExtracheez(){
	
	     return extracheez;
}
public void setExtraspicy(boolean a){

        this.extracheez=a;
}	
public boolean getExtraspicy(){
	
	     return extracheez;
}
	
  public void orderConfirmationText(){
		
		System.out.println("You have choosen Burger");	
		
	}
	public double getTotal(){
		return this.quantity * this.price;
	}	
	
	
}


 class Pasta implements Food{
	
	private String name;
	private int quantity;
	private double price;
	
	Pasta (){
	}

    Pasta(double price){
		this.price=price;
	}

    public void setName(String n ){

       this.name=n;
}	
public String getName(){
	
	   return name;
}
public void setPrice(double b){

       this.price=b;
}	
public double getPrice(){
	
	    return price;
}
public void setQuantity(int c){

        this.quantity=c;
}	
public int getQuantity(){
	
	     return quantity;
}

public void orderConfirmationText(){
		
		System.out.println("You have choosen Pasta");
		
		
		
	}
		
public double getTotal(){
		return this.quantity * this.price;
	}	


 }












