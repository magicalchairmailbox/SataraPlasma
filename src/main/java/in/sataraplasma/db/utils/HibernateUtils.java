package in.sataraplasma.db.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import in.sataraplasma.db.DonorMasterDto;

public class HibernateUtils {
	
	private static final SessionFactory sessionFactory;
	private static final String hibernateFileName ="localhost-Hibernate.cfg.xml";
	//private static final String hibernateFileName ="oca.aws.Hibernate.cfg.xml";
	//private static final String hibernateFileName ="oca-staging-GoDaddy.Hibernate.cfg.xml";
	//private static final String hibernateFileName ="oca-sveri-prod-GoDaddy.Hibernate.cfg.xml";
	static {
		try {
			sessionFactory = new Configuration()
					.configure(hibernateFileName)
					.addAnnotatedClass(DonorMasterDto.class)					
					.buildSessionFactory();
			
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
