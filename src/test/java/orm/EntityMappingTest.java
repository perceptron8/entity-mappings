package orm;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class EntityMappingTest {
	@Test
	public void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("orm");
		assertNotNull(emf);
	}
}
