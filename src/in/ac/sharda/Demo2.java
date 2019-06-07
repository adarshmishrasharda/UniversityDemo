package in.ac.sharda;

public class Demo2 {

	public static void main(String[] args) {
		
		IResultArrivedListener iral = new Student(1, "Raghav");
		iral.resultArrived();
		iral = new Department(0);
		iral.resultArrived();
		
	}
	
}