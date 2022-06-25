package Assignments;

public class CustomException {
	
	static void validate(int salary) throws SalaryException{
		if (salary < 2100) 
			throw new SalaryException("you need to work hard");
		else if (salary > 2100 && salary < 5000 )
			throw new SalaryException("your salary is somehow good");
		else if (salary >5100 && salary < 9000)
			throw new SalaryException("Salary is very good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CustomException.validate(4000);
		} catch (SalaryException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured: " + e.getMessage());
		}

	}
}
	class SalaryException extends Exception{
		
		SalaryException(String s)
		{
			super(s);
		}
	}


