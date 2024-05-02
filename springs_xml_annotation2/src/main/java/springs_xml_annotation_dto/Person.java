package springs_xml_annotation_dto;

import org.springframework.stereotype.Component;

@Component
public class Person {

	public void talk() {
		System.out.println("Person is talking");
	}
}
