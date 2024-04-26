package manytoone_uni_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import manytoone_uni_dto.Student;

public class FetchExample {

	public static void main(String[] args) {
		
		EntityManager manager = Persistence.createEntityManagerFactory("sagar").createEntityManager();
		manager.find(Student.class,1); //default fetch type is EAGER
		
		/*
		 *
		 * By default it was EGER:
		 * Hibernate: 


select 

student0_.id as id1_1_0_, 
student0_.address as address2_1_0_, 
student0_.c_id as c_id5_1_0_, 
student0_.name as name3_1_0_, 
student0_.phone as phone4_1_0_, 
college1_.id as id1_0_1_, 
college1_.fees as fees2_0_1_, 
college1_.name as name3_0_1_ 

from Student student0_ left outer join College college1_ on student0_.c_id=college1_.id 
where student0_.id=?

After Fetch type use: LAZY
Hibernate: 
select 
student0_.id as id1_1_0_, 
student0_.address as address2_1_0_, 
student0_.c_id as c_id5_1_0_, 
student0_.name as name3_1_0_, 
student0_.phone as phone4_1_0_ 
from Student student0_ 
where student0_.id=?

		 */
		
	}
}
