package AssignmentPractice;

class Encapsulate{
	private String name;
	private int roll;
	private int age;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setAge(int ageValue) {
		age= ageValue;
	}
	public void setName(String nameValue ) {
		name = nameValue;
	}
	public void setRoll(int rollValue) {
		roll = rollValue;
	}
	
	
}
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Encapsulate obj = new Encapsulate();
       obj.setName("Harsh");
       obj.setAge(19);
       obj.setRoll(51);
       
       System.out.println("My name: " + obj.getName() );
       System.out.println("My Age: " + obj.getAge() );
       System.out.println("My roll: " + obj.getRoll() );
	}

}
