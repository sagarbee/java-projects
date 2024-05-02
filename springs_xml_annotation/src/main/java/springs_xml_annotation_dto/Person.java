package springs_xml_annotation_dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Person {

	@Value("Sagar")
	private String name;
	@Value("23")
	private int age;
	
	public void walk() {
		System.out.println("Person is walking");
	}
}
