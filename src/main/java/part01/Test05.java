package part01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * Remove the reference from the table using the primary key
 */
public class Test05 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HB");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();
		
		Integer primaryKey = 10050;
		User reference = entityManager.getReference(User.class, primaryKey);
		entityManager.remove(reference);
		

		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
