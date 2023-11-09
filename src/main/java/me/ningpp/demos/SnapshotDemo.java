package me.ningpp.demos;

import java.util.List;

import me.ningpp.demos.entity.DestTable5;
import me.ningpp.demos.entity.DestTable6;
import me.ningpp.demos.entity.MiddleTable5;
import me.ningpp.demos.entity.MiddleTable6;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import me.ningpp.demos.entity.DestTable1;
import me.ningpp.demos.entity.DestTable2;
import me.ningpp.demos.entity.DestTable3;
import me.ningpp.demos.entity.DestTable4;
import me.ningpp.demos.entity.MainMultiPks;
import me.ningpp.demos.entity.MiddleTable1;
import me.ningpp.demos.entity.MiddleTable2;
import me.ningpp.demos.entity.MiddleTable3;
import me.ningpp.demos.entity.MiddleTable4;
import me.ningpp.demos.entity.SysModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author ningpp
 * @date 2022-03-14 10:51:24
 */
public class SnapshotDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(SnapshotDemo.class);

    public static void demo(String cfgResourceName) {
        LOGGER.info("starting  " + cfgResourceName);
        ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure(cfgResourceName)
        .build();
        MetadataSources metadataSources = new MetadataSources(standardRegistry);
        metadataSources.addAnnotatedClass(SysModule.class);
        metadataSources.addAnnotatedClass(MainMultiPks.class);
        metadataSources.addAnnotatedClass(MiddleTable1.class);
        metadataSources.addAnnotatedClass(MiddleTable2.class);
        metadataSources.addAnnotatedClass(MiddleTable3.class);
        metadataSources.addAnnotatedClass(MiddleTable4.class);
        metadataSources.addAnnotatedClass(MiddleTable5.class);
        metadataSources.addAnnotatedClass(MiddleTable6.class);
        metadataSources.addAnnotatedClass(DestTable1.class);
        metadataSources.addAnnotatedClass(DestTable2.class);
        metadataSources.addAnnotatedClass(DestTable3.class);
        metadataSources.addAnnotatedClass(DestTable4.class);
        metadataSources.addAnnotatedClass(DestTable5.class);
        metadataSources.addAnnotatedClass(DestTable6.class);

        Metadata metadata = metadataSources.buildMetadata();

        SessionFactory sessionFactory = metadata.buildSessionFactory();

        var session = sessionFactory.openSession();
        session.close();

        for (int n = 100000; n <= 200000; n+=100000) {
            var em = sessionFactory.createEntityManager();
            var trans = em.getTransaction();
            trans.begin();
            em.persist(MainMultiPks.build(n));
            trans.commit();
            em.close();

            var query2 = sessionFactory.createEntityManager()
                    .createQuery("From MiddleTable6", MiddleTable6.class);
            var middle6List = query2.getResultList();
            for (var middle6 : middle6List) {
                System.out.println(middle6);
            }
        }

        var query = sessionFactory.createEntityManager()
            .createQuery("From MainMultiPks", MainMultiPks.class);
        List<MainMultiPks> resulst = query.getResultList();
        for (MainMultiPks main : resulst) {
            System.out.println(main);
        }

        sessionFactory.close();
    }

}
