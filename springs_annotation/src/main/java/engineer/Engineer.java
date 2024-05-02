package engineer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engineer {

	@Value("vibhas")
	private String name;
	@Value("741859630")
	private long phone;
	@Value("Amravati")
	private String address;
	
	@Autowired
	@Qualifier("civil")
	College college;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void branch() {
		System.out.println("Name :"+name);
		System.out.println("Phone :"+phone);
		System.out.println("Address :"+address);
		college.study();
	}
	
}
