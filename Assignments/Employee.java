package Assignments;

public class Employee {
	
	int salary;
	
	protected class permEmployee{
		
		String code = "PE01";
		double hike = 0.45;
		
		double new_salary() {
			salary = (int) (salary + (salary * hike)) ;
			return salary;
		}
		
		void display()
		{
			System.out.println("PermEmployee: Code: "+ code +" hike: " + hike + " Salary : " + new_salary());
		}
		
	}
	
 protected class TempEmployee{ 
		
		String code = "TE01";
		double hike = 0.30;
		
		double new_salary() {
			salary = (int) (salary + (salary * hike)) ;
			return salary;
		}
		
		void display()
		{
			System.out.println("TempEmployee: code: "+ code +" hike: " + hike + " Salary: " + new_salary());
		}
	}
 
 void MLIMethod() {
	 class ContractEmployee{ 
			
			String code = "CE01";
			double hike = 0.30;
			
			double new_salary() {
				salary = (int) (salary + (salary * hike)) ;
				return salary;
			}
			
			void display()
			{
				System.out.println("ContractEmployee: code: "+ code +" hike: " + hike + " salary: " + new_salary());
			}
		} 
	 ContractEmployee con = new ContractEmployee();
	 con.display();
 }

 

public static void main(String[] args)
{
	Employee emp = new Employee();
	
	emp.salary = 45000;
	
	Employee.permEmployee permemp= emp.new permEmployee();
	
	permemp.display();
	
	emp.salary = 45000;
	
	Employee.TempEmployee temp= emp.new TempEmployee();
	
	temp.display();
	
	emp.salary = 45000;
	
	emp.MLIMethod();
	
	
}
}
