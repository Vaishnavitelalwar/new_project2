package day7_labPractice;
/*
 * Q 5 Write a program by creating an 'Employee' class having the following 
 * methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day is more than 6 hours.

 */
class Employee2
{
	float salary;
	int hour;
	void getInfo(float salary,int hour)
	{
		this.salary= salary;
		this.hour  = hour;
		
	}
	void addSal()      { 		if(this.salary<50000) 	   this.salary=this.salary+10000;	}
	
	void addwork()     {		if(this.hour>6) 			this.salary=this.salary+5000;  	}
	
	void display() 
	{
	System.out.println("New Salary="+ this.salary);
	System.out.println("total working hour"+ hour);
	
	}
}
public class Q5_A {

	public static void main(String[] args) {
		Employee2 e= new Employee2();
		e.getInfo(60000, 9);
		e.addSal();
		e.addwork();
		e.display();

		
		Employee2 e1= new Employee2();
		e.getInfo(40000, 3);
		e.addSal();
		e.addwork();
		e.display();

	}

}
