package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student(1, "Raghav");
		Student s2 = new Student(2, "Mansi");
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s.equals(s2));

	}

}
