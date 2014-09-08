/*
 * Copyright 2012 Ivashin Alexey <ivashin.alexei@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.fedul0x.ic.dataaccess;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
import java.io.File;
import java.util.Formatter;
import java.util.Locale;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import ru.fedul0x.ic.SystemSettings;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static String host;
    private static int port;
    private static String login;
    private static String password;

    private static SessionFactory buildSessionFactory() {
//        try {
//            Configuration configuration = new Configuration();
        File file = new File("src/main/java/hibernate.cfg.xml");
//            configuration.configure(file);
        Properties props = new Properties();
        StringBuffer url = new StringBuffer();
        Formatter formatter = new Formatter(url, Locale.US);
        formatter.format("jdbc:postgresql://%s:%d/industrial_contamination",
                SystemSettings.getSettings().getHost(), SystemSettings.getSettings().getPort());
//            props.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//            props.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        props.setProperty("hibernate.connection.url", url.toString());
        props.setProperty("hibernate.connection.username", SystemSettings.getSettings().getUsername());
        props.setProperty("hibernate.connection.password", SystemSettings.getSettings().getPassword());
//            props.setProperty("hibernate.show_sql", "true");
//            props.setProperty("hibernate.current_session_context_class", "thread");
//            props.setProperty("hibernate.hbm2ddl.auto", "update");
        //TODO automaticly find all DataEntity class
        AnnotationConfiguration configuration = new AnnotationConfiguration()
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.Company.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.Contamination.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.AggregativeState.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.ContaminationComposition.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.DataSheet.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.DataSheetContaminationComposition.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.DataSheetContaminationCompositionId.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.ContaminationByFederalClassification.class)
                .addAnnotatedClass(ru.fedul0x.ic.dataaccess.dataobject.DataOperator.class)
                .setProperties(props);
        configuration.configure(file);
        //apply configuration property settings to StandardServiceRegistryBuilder
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        System.out.println("Hibernate serviceRegistry created");

        SessionFactory sessionFactory = configuration
                .buildSessionFactory(serviceRegistry);

        return sessionFactory;
//        } catch (Throwable ex) {
//            // Make sure you log the exception, as it might be swallowed
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
    }

    public static SessionFactory getSessionFactory() {
        if (null == sessionFactory) {
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }

}
