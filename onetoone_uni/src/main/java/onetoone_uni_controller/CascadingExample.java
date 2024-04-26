package onetoone_uni_controller;

import onetoone_uni_dao.PersonDao;
import onetoone_uni_dto.AdharCard;
import onetoone_uni_dto.Person;

public class CascadingExample {

	public static void main(String[] args) {

//		AdharCard ac = new AdharCard();
//		ac.setA_id(112);
//		ac.setName("Ramu");
//		ac.setAddress("pune");
//		
//		Person p = new Person();
//		p.setId(35);
//		p.setName("Ramu");
//		p.setPhone(3784784794l);
//		p.setAddress("Bhosal vasti");
//		p.setAdharCard(ac);

		PersonDao dao = new PersonDao();
//		dao.savePerson(p);
//		dao.deletePerson(111);

//		for merge

		AdharCard ac = new AdharCard();
		ac.setA_id(101);
		ac.setName("Ramesh");

		Person p1 = new Person();
		p1.setName("Ravi chndra");
		p1.setPhone(89888545454l);
		p1.setAddress("Maharashtra");
		p1.setAdharCard(ac);
	
		dao.updateBoth(35, p1);
	}
}
