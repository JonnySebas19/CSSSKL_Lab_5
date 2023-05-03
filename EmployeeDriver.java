import java.util.ArrayList;
/*
 * Driver
 * Lab 
 * 
 * A simple driver to exercise the Employee hierarchy 
 */

public class EmployeeDriver {
	
	
	public static void main(String[] args) {
		Accountant emp1 = new Accountant( "Rick", 123456789);
		//this next employee makes a bit more than Rick
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		//and lets make an hourly worker
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		//then a salaried worker
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);

		PermanentHire emp6 = new PermanentHire("Jonny", 123454321, 200);
		PermanentHire emp7 = new PermanentHire("Goofy", 123123123);
		PermanentHire emp8 = new PermanentHire("Bob", 987654321, 750);
		PermanentHire emp9 = new PermanentHire("Christy", 65748392, 500);


		Consultant emp10 = new Consultant("Jeff", 75849308, true);
		Consultant emp11 = new Consultant("Hefley", 10293844, false);

		ColorWithAlpha color = new ColorWithAlpha(123);
		//and add them to the ArrayList below
		
		//and build a set of workers, all of which are employees
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		
		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		myEmployees.add(emp6);
		myEmployees.add(emp7);
		myEmployees.add(emp8);
		myEmployees.add(emp9);
		myEmployees.add(emp10);
		myEmployees.add(emp11);

		//myEmployees.add(color);

		//The required type is an Employee which makes sense because it is the
		//parent class of these classes and the type of the array list
		// If I wanted it to store both kinds, I would have to have both kinds extend
		// to the same class and use that class
		
		
		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
		}
		
		
	}
}
