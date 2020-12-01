package part01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Find the instance using the primary key
 */
public class Test03 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HB");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		User newUser = entityManager.find(User.class, 10001);
		System.out.println(newUser);

		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
