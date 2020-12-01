package part01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Update the detail of the User with ID = 1
 */
public class Test02 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HB");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		User newUser = new User();
		newUser.setId(1);
		newUser.setEmail("userTest02@gmail.com");
		newUser.setFullname("userTest02");
		newUser.setPassword("pwdTest02");

		entityManager.merge(newUser);

		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
