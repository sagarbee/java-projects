package bankapplication.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import bankapplication.dto.User;

public class UserDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vibhas");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public boolean saveUser(User user) {

		User dbuser = findUser(user.getId());

		if (dbuser == null) {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} else {
			System.out.println("user is already registered with given id:" + user.getId());
			return false;
		}
	}

	public void editUser(User user) {

		User dbuser = manager.find(User.class, user.getId());

		if (dbuser != null) {
			transaction.begin();
			manager.merge(user);
			transaction.commit();
		} else {
			System.out.println("User not fount at :" + user.getId());
		}
	}

	public String getPassword(String email) {
		
		Query query = manager.createQuery("SELECT u  FROM User u.email=?1");
		query.setParameter(1, email);
		User dbUser=(User) query.getSingleResult();
		
		if(dbUser!=null)
		{
			return dbUser.getPassword();
		}
		else 
		{
			return null;
		}
	}

	public User findUser(int id) {
		
		User user=manager.find(User.class, id);
		return user;
	}

}
