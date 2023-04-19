package com.xworkz.festivelapp.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festivelapp.entity.FestivelEntity;

public class FestivelRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transection = manager.getTransaction();

		transection.begin();

		FestivelEntity entity = new FestivelEntity("Mani", "Laddu", "Hindu", 2, "Perumal");
		FestivelEntity entity1 = new FestivelEntity("Vishak", "Jelabi", "Hindu", 3, "Ayyappan");
		FestivelEntity entity2 = new FestivelEntity("Ganesh", "Jelabi", "Hindu", 4, "Ganapathi");
		FestivelEntity entity3 = new FestivelEntity("Raju", "Laddu", "Hindu", 5, "Ancineayer");
		FestivelEntity entity4 = new FestivelEntity("Kumaran", "Batharsa", "Hindu", 5, "Ganapathi");
		FestivelEntity entity5 = new FestivelEntity("Santhosh", "Jelabi", "Hindu", 6, "Perumal");
		FestivelEntity entity6 = new FestivelEntity("Murgesan", "Sweet Cake", "Hindu", 4, "Mariyaman");
		FestivelEntity entity7 = new FestivelEntity("Sangeetha", "Obbot", "Hindu", 7, "Perumal");
		FestivelEntity entity8 = new FestivelEntity("Dhoorvasan", "Laddu", "Hindu", 4, "Pillayar");
		FestivelEntity entity9 = new FestivelEntity("MariMuthhu", "Badersaa", "Hindu", 2, "Ganapathi");
		FestivelEntity entity10 = new FestivelEntity("Sivangi", "Jelabi", "Hindu", 3, "Ayyappan");
		FestivelEntity entity11 = new FestivelEntity("Sangeetha", "Badersaa", "Hindu", 3, "Mururgan");
		FestivelEntity entity12 = new FestivelEntity("Manikandan", "Jelabi", "Hindu", 3, "Pillayar");
		FestivelEntity entity13 = new FestivelEntity("Vaisanavi", "Laddu", "Hindu", 3, "Ayyappan");
		FestivelEntity entity14 = new FestivelEntity("Varatharajan", "Badersaa", "Hindu", 3, "Perumaal");
		FestivelEntity entity15 = new FestivelEntity("Kanamma", "Jelabi", "Hindu", 3, "Venkatajalapathy");
		FestivelEntity entity16 = new FestivelEntity("UdayKumar", "Laddu", "Hindu", 3, "Anjineayer");
		FestivelEntity entity17 = new FestivelEntity("Gayathri", "MenseCake", "Hindu", 3, "Ayyappan");
		FestivelEntity entity18 = new FestivelEntity("Thiruppathi", "Badersaa", "Hindu", 3, "Ayyappan");
		FestivelEntity entity19 = new FestivelEntity("Eeswari", "Laddu", "Hindu", 3, "Raman");

		manager.persist(entity);
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		
		transection.commit();
		manager.close();
	}

}
