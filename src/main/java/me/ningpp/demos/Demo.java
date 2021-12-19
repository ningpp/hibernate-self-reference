package me.ningpp.demos;

import java.util.List;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import me.ningpp.demos.entity.SysModule;

public class Demo {

    public static void main(String[] args) {

        SysModule module2 = new SysModule(2, "name-2", Set.of());

        SysModule module3 = new SysModule(3, "name-3", Set.of());

        SysModule module1 = new SysModule(1, "name-1", Set.of(module2, module3));

        insertSysModule(List.of(module2, module3, module1));
        
        for (int i = 1; i <= 3; i++) {
            EntityManager entityManager = openSession();
            EntityTransaction trans = entityManager.getTransaction();
            trans.begin();

            SysModule module = entityManager
                .createQuery("FROM SysModule WHERE id = ?1", SysModule.class)
                .setParameter(1, i)
            .getSingleResult();
            System.out.println(module);
            System.out.println(module.getTargetModules());

            trans.commit();
            entityManager.close();
        }
    }

    private static void insertSysModule(List<SysModule> modules) {
        EntityManager entityManager = openSession();
        EntityTransaction trans = entityManager.getTransaction();
        trans.begin();

        for (SysModule module : modules) {
            entityManager.persist(module);
        }

        trans.commit();
    }

    private static EntityManagerFactory sessionFactory = null;

    private static EntityManager openSession() {
        if (sessionFactory == null) {
            sessionFactory = Persistence.createEntityManagerFactory("Demo");
        }
        return sessionFactory.createEntityManager();
    }
}
