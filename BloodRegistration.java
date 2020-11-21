   public class BloodRegistration{
	
	public static void main (String[] args){
		
	Registration r1= new Registration();
     r1.setId(1);
     r1.setName("ABC");
     r1.setBloodGroup("B+");	 
	
	System.out.println("id -" + r1.getId()  +  " name-"  + r1.getName()  +   " bloodGroup-" +  r1.getBloodGroup() );
	Registration r2= new Registration();
	r2.setId(2);
     r2.setName("DEF");
     r2.setBloodGroup("A+");
	 r2.show();
	
	Registration r3= new Registration();
    r3.setId(3);
     r3.setName("GHI");
     r3.setBloodGroup("O+");
	 r3.show();
	System.out.println("Number of blood donors :" + Registration.getNumberOfDonors());
	
	}
	

	
	
	
}



class Registration{
	private int id;
	private String name;
    private String bloodGroup;
	private static  int  numberofBloodDonors;
	
	Registration()
	{
		setNumberofDonors();
	}
	
	public static void setNumberofDonors(){
		numberofBloodDonors++;
	}
	public static int getNumberOfDonors(){
		return numberofBloodDonors;
		
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
	public void setBloodGroup(String b){
		bloodGroup=b;
	}
	public String getBloodGroup(){
		return bloodGroup;
	}
     void show()
	 {
      System.out.println("id -" + id + " name" + name + " bloodGroup-" + bloodGroup);
	}
}