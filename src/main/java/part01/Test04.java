package part01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * Execute the SQL Query
 */
public class Test04 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HB");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();
		
		//Create a query. Use the entity name (User) instead of the table name
		String sql = "SELECT u from User u where u.email = 'user2@gmail.com'";
		Query query = entityManager.createQuery(sql);
		User user = (User) query.getSingleResult();
		
		
		System.out.println(user);

		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
