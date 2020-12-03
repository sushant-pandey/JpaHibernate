package part01;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/*
 * Find the instance using the primary key
 */
public class Test06 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HB");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		System.out.println("THis call is successful");
		String sqlString = "SELECT * from LAPTOP";
		Query q = entityManager.createNativeQuery(sqlString, Laptop.class);
		List<Laptop> list = q.getResultList();
		for(Laptop laptop : list) {
			System.out.println(laptop);
		}

		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
