package com.nagarro.employeemanagementapi.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;


/**
 * @author vishalchaudhary01
 *
 */
@Component
public class HibernateConfig {

	public SessionFactory getSessionFactory() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		return sf;
	}

	public Session getSession() {
		return getSessionFactory().openSession();
	}

}
