package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class University {
	
	private Set<Department> departments = new TreeSet<>();
	
	public boolean addDepartment(Department d) {
		return departments.add(d);
	}

	public void printDepartments() {
		/*for(Department d : departments) {
			System.out.println(s.getId());
		}*/
		departments.parallelStream().forEach(s -> System.out.println(s.getId()));
	}
	
	public void resultDeclared() {
		// This will use only one cpu core
		/*for(Department d : departments) {
		d.resultArrived();
		}*/
		departments.parallelStream().forEach(d -> d.resultArrived());
	}
		
}