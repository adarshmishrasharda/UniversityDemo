package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		
		University u = new University();
		
		for(int i = 1; i < 21; i++) {
			
			Department d = new Department(i);
			boolean added = u.addDepartment(new Department(i));
		if(added) {
			System.out.println("Departmnet added");
			for(int j = 1; j < 21; j++) {
				d.addStudent(new Student(j, "Name"+i+j));
			}

		}
		else {
			System.out.println("Not added");
		}
		}
		u.printDepartments();
		u.resultDeclared();
	}

}
