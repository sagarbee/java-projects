package jsp_employee;

public class Employee 
{
	private int id;
	private long phone; 
	private double salary;
	private String email, password, name, designation;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, long phone, double salary, String email, String password, String name, String designation) {
		super();
		this.id = id;
		this.phone = phone;
		this.salary = salary;
		this.email = email;
		this.password = password;
		this.name = name;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
