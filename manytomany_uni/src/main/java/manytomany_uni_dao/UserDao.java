package manytomany_uni_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_uni_dto.Application;
import manytomany_uni_dto.User;

public class UserDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	
	public void saveApplication(Application app) {

		app = manager.find(Application.class, app.getId());
		if (app == null) {
			transaction.begin();
			manager.persist(app);
			transaction.commit();
		} else {
			System.out.println("Application is already present");
		}

	}

	public void saveUser(User user) {

		user = manager.find(User.class, user.getId());
		if (user == null) {
			
			transaction.begin();
			manager.persist(user);
			transaction.commit();
		} else {
			System.out.println("User is already present");
		}

	}
	
	public void removeUser(int uId)
	{
		User user = manager.find(User.class, uId);
		if(user != null)
		{
			transaction.begin();
			manager.remove(user);
			transaction.commit();
		}
		else
		{
			System.out.println("User is not present");
		}
	}
	
	
}
