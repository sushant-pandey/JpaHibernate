package part01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/*
 * Persist the details of the 50 users into the database
 */
public class Test01 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HB");
		EntityManager entityManager = factory.createEntityManager();
		 
		entityManager.getTransaction().begin();
		
		for(int i = 1; i <=50; i++) {
			User newUser = new User();
			newUser.setEmail("user"+ i +"@gmail.com");
			newUser.setFullname("user" + i);
			newUser.setPassword("pwd" + i);
			 
			entityManager.persist(newUser);
		}
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
