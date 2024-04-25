package es.jpa.hibernate.example.entities;

import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonajeTest {
	static EntityManagerFactory emf;
	EntityManager em;

	Personaje personaje;

	@BeforeAll
	public static void setUp() {
		emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
	}

	@BeforeEach
	public void initEntityManager() {
		em = emf.createEntityManager();
		personaje = new Personaje();
		personaje.setNombre("personTest");
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(personaje);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testPersistFind() {
		try {
			Personaje personDB = em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personaje.getNombre(), personDB.getNombre());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testMostrar(){
		try {
			Personaje personaje1=em.find(Personaje.class,personaje.getId());
			String pj=personaje1.toString();
			Assertions.assertEquals(personaje.getNombre(), personaje1.getNombre());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}

	}

	@Test
	public void testUpdate() {
		try {
			Personaje personFind = em.find(Personaje.class, personaje.getId()); // See file import.sql
			personFind.setGenero("Femenino");

			// Persist in database
			em.getTransaction().begin();
			em.merge(personFind);
			em.getTransaction().commit();

			// Find by id
			Personaje personDBUpdate = em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personFind.getGenero(), personDBUpdate.getGenero());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removePerson() {
		try {
			int personId = personaje.getId();
			Personaje person = em.find(Personaje.class, personId); // See file import.sql
			em.getTransaction().begin();
			em.remove(person);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Personaje personDB = em.find(Personaje.class, personId); // See file import.sql

			Assertions.assertNull(personDB);

		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void closeEntityManager() {
		em.close();
		em = null;
	}

	@AfterAll
	public static void closeEntityManagerFactory() {
		emf.close();
	}

}
