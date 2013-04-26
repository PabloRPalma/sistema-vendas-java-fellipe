package com.fellipe.sistema.vendas;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HimernateUtil {
	
	private static final SessionFactory session = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		}catch (Throwable e){
			System.out.println("Deu pau! Manolo!\n " + e);
			throw new ExceptionInInitializerError();
		}
	}
		public static SessionFactory getSession(){
			return session;
		
		
	}
	

}
