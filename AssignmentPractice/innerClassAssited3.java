package AssignmentPractice;

abstract class AnonymousInnerClass{
	public abstract void display();
}
public class innerClassAssited3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass in = new AnonymousInnerClass() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Inner class");
			}
		};
		in.display();
	}

}
