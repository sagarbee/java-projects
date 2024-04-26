package springs_xml;

public class Employee {

	String name;
	String designation;
	double salary;

	public Employee(String name, String designation, double salary) {

		this.name = name;
		this.designation = designation;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

}
