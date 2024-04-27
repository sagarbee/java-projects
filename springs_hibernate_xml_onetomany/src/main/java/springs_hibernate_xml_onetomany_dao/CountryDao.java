package springs_hibernate_xml_onetomany_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import springs_hibernate_xml_onetomany_dto.Country;
import springs_hibernate_xml_onetomany_dto.State;


public class CountryDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sagar").createEntityManager();
	}

	public void saveCountry(Country country) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(country);
		transaction.commit();

	}

	public void fetchCountry(int id) {
		EntityManager manager = getEntityManager();
		Country country= manager.find(Country.class, id);
		if (country != null) {
			System.out.println(country);
		} else {
			System.out.println("person ID not found");
		}
	}

	public void deleteCountry(int id) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Country country = manager.find(Country.class, id);

		if (country != null) {
			transaction.begin();
			manager.remove(country);
			transaction.commit();
		}
	}
	
	public void addState(int countryId,State state)
	{
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Country country = manager.find(Country.class, countryId);
		if(country!=null)
		{
			transaction.begin();
			manager.merge(state);
			transaction.commit();
		}
		else
		{
			System.out.println("Country not found");
		}
		
	}
	public void removeStateFromCountry(int countryId, int stateId) {
		
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
	    Country country = manager.find(Country.class, countryId);
	    if (country != null) {
	        State stateToRemove = null;
	        for (State state : country.getState()) {
	            if (state.getId() == stateId) {
	                stateToRemove = state;
	                break;
	            }
	        }
	        if (stateToRemove != null) {
	            transaction.begin();

	            country.getState().remove(stateToRemove);
	            manager.remove(stateToRemove);
	            
	            transaction.commit();
	            System.out.println("State removed from country successfully");
	        } else {
	            System.out.println("State not found in company");
	        }
	    } else {
	        System.out.println("Country not found");
	    }
	}
}
