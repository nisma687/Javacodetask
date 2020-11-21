class Employee{
	private int id;
	private String name;
	private String  email;
	private String phone;
	private float  salary;
	Employee(){
	}
	Employee(int id, String name, String email, String phone, float salary){
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.salary=salary;
	}
	public void setId(int i){
		id=i;
		
	}
	public int getId(){
		return id;
	}
	public void setName(String n){
		name=n;
		
	}
	public String getName(){
		return name;
	}
	public void setEmail(String e){
		email=e;
		
	}
	public String getEmail(){
		return email;
	}
	public void setPhone(String p){
		phone=p;
		
	}
	public String getPhone(){
		return phone;
	}
	public void setSalary(float s){
		salary=s;
		
	}
	public float getSalary(){
		return salary;
	}
	void show(){
		System.out.println( " Name -" + name);
		System.out.println( " Id -" + id);
		System.out.println( " Phone -" + phone);
		System.out.println( " Email -" + email);
		System.out.println( " Salary -" + salary);
		
	}
}
public class EmployeeInfo{
	
public static void main (String[] args)
{
  Employee emp[]=new Employee[5];
  emp[0]= new Employee();
  emp[0].setName("JIBON");
  emp[0].setId (1);
  emp[0].setEmail("jibon@student.aiub.edu");
  emp[0].setPhone("0134567809");
  emp[0].setSalary(5000.05F);
   System.out.println( " Name -" + emp[0].getName());
   System.out.println( " Id -" + emp[0].getId());
   System.out.println( " Phone -" + emp[0].getPhone());
   System.out.println( " Email -" + emp[0].getEmail());
   System.out.println( " Salary -" + emp[0].getSalary());
   emp[1]=new Employee(2,"jeba","jeba@nsu.com","012345678912",6000.06F);
		 emp[1].show();
   emp[2]=new Employee();
  emp[2].setName("anomita");
  emp[2].setId (3);
  emp[2].setEmail("anomitaDu@gmail.com");
  emp[2].setPhone("01345678789");
  emp[2].setSalary(7000.08F);
   System.out.println( " Name -" + emp[2].getName());
   System.out.println( " Id -" + emp[2].getId());
   System.out.println( " Phone -" + emp[2].getPhone());
   System.out.println( " Email -" + emp[2].getEmail());
   System.out.println( " Salary -" + emp[2].getSalary());
   emp[3]= new Employee(4,"Labiba","labiba@nsu.com","012367985432",8000.06F);
   emp[3].show();
   emp[4]= new Employee(5,"Sakib","sakib@student.aiub.edu","012368905432",9000.06F);
   emp[4].show();

   float max=emp[0].getSalary();
   float min=emp[0].getSalary();
   float avrg=0f;
   float sum=0f;
   for(int i=0;i<5;i++)
   {
	  sum=sum+emp[i].getSalary();
         
	   
   }
   avrg=sum/5;
   System.out.println( "Average is - " +avrg);
   
   for(int j=1;j<5;j++)
   {
	 if(emp[j].getSalary()< min) 
	 {
		min=emp[j].getSalary();
		 
	 }		 	    
	   
   }
    System.out.println("Min salary is - " +min);
   
   for(int k=1;k<5;k++)
   {
	 if(max<emp[k].getSalary())
	 {
		 
		 max=emp[k].getSalary();
		 
	 }
		 
	   
   }
   
   System.out.println("Max salary is -" +max );  
   
	
}		
	
}













