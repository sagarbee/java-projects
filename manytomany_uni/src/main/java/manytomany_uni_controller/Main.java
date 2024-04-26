package manytomany_uni_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_uni_dto.Application;
import manytomany_uni_dto.User;

public class Main {

	public static void main(String[] args) {

//		Application app1 = new Application();
//		app1.setId(1);
//		app1.setName("Facebook");
//		app1.setCompany("Meta");
//
//		Application app2 = new Application();
//		app2.setId(2);
//		app2.setName("Snapchat");
//		app2.setCompany("Snap.ios");
//
//		Application app3 = new Application();
//		app3.setId(3);
//		app3.setName("Instagram");
//		app3.setCompany("Meta");
//
//		Application app4 = new Application();
//		app4.setId(4);
//		app4.setName("Whatsapp");
//		app4.setCompany("Meta");
//
//		List<Application> appList = new ArrayList<Application>();
//		appList.add(app1);
//		appList.add(app2);
//		appList.add(app3);
//		appList.add(app4);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

//		for (Application app : appList) {
//			transaction.begin();
//			manager.persist(app);
//			transaction.commit();
//		}
//
			
//		User u2 = new User();
//		u2.setId(2);
//		u2.setName("Adesh");
//		u2.setPhone(7894558856l);
//		u2.setAddress("Nagpur Talegaon");
//	
//		List<Application> u2App = new ArrayList<Application>();
//		u1App.add(app2);
//		u1App.add(app3);
//		u1App.add(app4);
//		u2.setApp(u2App);
//		List<User> user = new ArrayList<User>();
//		user.add(u1);
//		user.add(u2);
//		
//		for(User u: user)
//		{
//			transaction.begin();
//			manager.persist(u);
//			transaction.commit();
//		}
	
		User u1 = new User();
		u1.setId(5);
		u1.setName("Ravi");
		u1.setPhone(7895658856l);
		u1.setAddress("Jalgaon maharashtra");
	
//		List<Application> u1App = new ArrayList<Application>();
//		u1App.add(app1);
//		u1App.add(app2);
//		u1.setApp(u1App);
	
	
	}

}
