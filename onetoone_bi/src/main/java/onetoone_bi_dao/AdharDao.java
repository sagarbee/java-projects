package onetoone_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import onetoone_bi_dto.AdharCard;
import onetoone_bi_dto.Person;

public class AdharDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sagar").createEntityManager();
	}
	public void fetchAdhar(int id) {
		EntityManager manager = getEntityManager();
		AdharCard ac= manager.find(AdharCard.class, id);
		if (ac != null) {
			System.out.println(ac);
		} else {
			System.out.println("person ID not found");
		}
	}
}
