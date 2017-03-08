package com.mitrais.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	private static EntityManagerFactory entityManagerFactory;
	private static final String PERSISTENCE_UNIT_NAME =
		"java_bootcamp";

	static {
		entityManagerFactory = Persistence
			.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence
				.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return entityManagerFactory;
	}

	public static EntityManager getEntityManager() {
		return getEntityManagerFactory().createEntityManager();
	}

	public static void close() {
		entityManagerFactory.close();
	}
}