package me.ningpp.demos;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import me.ningpp.demos.entity.SysModule;

/**
 * 
 * @author ningpp
 * @date 2022-03-14 10:51:24
 */
public class SnapshotDemo {

    public static void demo(String cfgResourceName) {
        ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure(cfgResourceName)
        .build();
        MetadataSources metadataSources = new MetadataSources(standardRegistry);
        metadataSources.addAnnotatedClass(SysModule.class);

        SessionFactory sessionFactory = metadataSources.buildMetadata().buildSessionFactory();

        var session = sessionFactory.openSession();
        session.close();

        sessionFactory.close();
    }

}
