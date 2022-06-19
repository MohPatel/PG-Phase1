package AssignmentPractice;

public class innerClassAssisted1 {
	
	private String msg = "Welcome to Java ,";
	
	class inner{
		void hello() {
			System.out.println(msg + "Let us start learning java class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClassAssisted1 obj = new innerClassAssisted1();
		innerClassAssisted1.inner in = obj.new inner();
		in.hello();

	}
	

}
