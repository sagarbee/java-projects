package springs_xml;

public class Student {

	 String name;
	 int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void used() {
		System.out.println("Inside Student");
	}
}
