package hibernate_user.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_user.dto.User;

public class UserDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sagar").createEntityManager();
	}

	public void userInsert(User user) {

		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
			transaction.begin();
			manager.persist(user);
			transaction.commit();

	}

	public void userLogin(User user) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		user = manager.find(User.class, user.getId());

		if (user == null) {
			transaction.begin();
			manager.persist(user);
			transaction.commit();

		} else {
			System.out.println("User alreday exists");
		}

	}

	public User getUser(String email) {
		// TODO Auto-generated method stub
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("select u from User where u.email =:email");
		query.setParameter("email", email);
		User user =(User)query.getSingleResult();
		return user;
	}


	public User displayPassword(int id) {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("select u from User where u.id =:id");
		query.setParameter("email", id);
		User user =(User)query.getSingleResult();
		return user;
			
	}
	

}
