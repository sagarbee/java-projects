package manytomany_uni_controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import manytomany_uni_dto.User;

public class FetchExample {

	public static void main(String[] args) {
		
		
		EntityManager manager = Persistence.createEntityManagerFactory("sagar").createEntityManager();
		manager.find(User.class, 1);//default fetch type is LAZY

/*
 * Hibernate: 

select 

user0_.id as id1_1_0_, 
user0_.address as address2_1_0_, 
user0_.name as name3_1_0_, 
user0_.phone as phone4_1_0_ 

from User user0_ 
where user0_.id=?

Hibernate: select user0_.id as id1_1_0_, 
user0_.address as address2_1_0_, user0_.name as name3_1_0_, 
user0_.phone as phone4_1_0_, app1_.User_id as user_id1_2_1_, 
applicatio2_.id as app_id2_2_1_, applicatio2_.id as id1_0_2_, 
applicatio2_.company as company2_0_2_, applicatio2_.name as name3_0_2_ 
from User user0_ left outer join User_Application app1_ on user0_.id=app1_.User_id left outer join Application applicatio2_ on app1_.app_id=applicatio2_.id where user0_.id=?

 */
	
	}

}
