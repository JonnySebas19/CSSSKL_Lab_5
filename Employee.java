/*
 * Employee.java - Abstract
 * This is the superclass of all workers in this company
 *   All employees must have a name and social security number. 
 */

//notice the abstract keyword? That prevents us from making objects of this type!
public abstract class Employee {
	private String name;
	private int social;
	
	public Employee() {
	}
	
	public Employee(String newName, int newSocial) {
		name = newName;
		social = newSocial;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	

	public abstract double calculateWeeklyPay();
	
}
/*
The calculateWeeklyPay is polymorphic because we can have many instances
of an employee, but when we call the calculateWeeklyPay function, this will only
call the function for that specific object.

We could do getRandomEmployee() and have a switch case with all the different types of
Employees. Then we could call the calculateWeeklyPay on all of these functions because each
has their own implementation of that function.

Employee worker = null;

for (int i = 0; i < 20; i++){
    worker = getRandomEmployee();
    System.out.println(worker.getName() + " makes " + worker.calculateWeeklyPay() + " a week.");
}
 */
