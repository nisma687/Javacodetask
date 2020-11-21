public class InheritanceR {

	public static void main(String[] args) {

		/*Person p1 = new Person(); 
		p1.name = "ABC";
		p1.height = "6ft";
		p1.weight = "70kg";

		System.out.println("Person: ");
		System.out.println("name: " + p1.name + " height: " + p1.height + " weight: " + p1.weight);
			
		Teacher t1 = new Teacher();
		t1.name = "Def";
		t1.height = "5.10ft";
		t1.weight = "75kg";
		t1.id = "2020-2020-1";
		t1.designation = "Teacher";

		System.out.println("Teacher: ");
		System.out.println("name: " + t1.name + " height: " + t1.height + " weight: " + t1.weight + " id: " + t1.id + " designation: " + t1.designation);

		Student s1 = new Student();
		s1.name = "Ghi";
		s1.height = "5.5ft";
		s1.weight = "75kg";
		s1.id = 1;
		s1.cgpa = 4.00;

		System.out.println("Student: ");
		System.out.println("name: " + s1.name + " height: " + s1.height + " weight: " + s1.weight + " id: " + s1.id + " cgpa: " + s1.cgpa);*/
		
		Professor pf1 = new Professor("programming", "4Hr"); 
		/*pf1.name = "mno";
		pf1.height = "5.9ft";
		pf1.weight = "77kg";
		pf1.id = "12345";
		pf1.designation = "Professor";
		pf1.domain = "Programming";
		pf1.crHr = "6Hr";*/

		System.out.println("Professor: ");
		System.out.println("name: " + pf1.name + " height: " + pf1.height + " weight: " + pf1.weight + " id: " + pf1.id + " designation: " + pf1.designation + " doamin: " + pf1.domain + " crHr: " + pf1.crHr);

		pf1.show();
	}
}

// 2. Start of Hierarchical Inheritance
// 1. Start of Single Inheritance
// 3. Start of Multilevel Inheritance
class Person {
	String name;
	String height;
	String weight;

	Person() {
		System.out.println("Default Constructor of Person");
	}

	Person(String n, String h, String w) {
		name = n;
		height = h;
		weight = w;

		System.out.println("Parameterized Constructor of Person - 1");
	}
	
	void show() {
		System.out.println("Showing Information from Person");
	}
}

class Teacher extends Person {
	String id;
	String designation;

	Teacher() {
		super("abc", "5.10ft", "80kg");
		System.out.println("Default Constructor of Teacher");
	}

	Teacher(String i, String d) {
		/*super(); // default calling step to parent class constructor */
		super("def", "5.09ft", "70kg");
		id = i;
		designation = d;

		System.out.println("Parameterized Constructor of Teacher - 1");
	}

	void show() {
		super.show();
		System.out.println("Showing Information from Teacher");
	}

}
// 1. End of Single Inheritance

class Professor extends Teacher {
	String domain;
	String crHr;

	Professor() {
		super("123", "Ass. Prof");
		System.out.println("Default Constructor of Professor");
		/* error: call to super must be first statement in constructor */
		// super("123", "Ass. Prof");
	}

	Professor(String d, String c) {
		this();
		domain = d;
		crHr = c;

		System.out.println("Parameterized Constructor of Professor - 1");
	}

	void show() {
		// super.show();
		System.out.println("Showing Information from Professor");
		super.show();
	}
}
// 3. End of Multilevel Inheritance

class Student extends Person {
	int id;
	double cgpa;
}

class Officer extends Person {
	int id;
	float salary;
}


// 2. End of Hierarchical Inheritance