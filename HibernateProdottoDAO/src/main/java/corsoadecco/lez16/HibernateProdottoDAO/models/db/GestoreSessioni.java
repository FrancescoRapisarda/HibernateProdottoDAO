package corsoadecco.lez16.HibernateProdottoDAO.models.db;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import corsoadecco.lez16.HibernateProdottoDAO.models.Prodotto;
import corsoadecco.lez16.HibernateProdottoDAO.models.db.GestoreSessioni;

public class GestoreSessioni {
	
	private static GestoreSessioni ogg_gestore;
	private SessionFactory factory;

	public static GestoreSessioni getIstanza() {
		if(ogg_gestore == null) {
			ogg_gestore = new GestoreSessioni();
		}
		
		return ogg_gestore;
	}
	
	public SessionFactory getFactory() {
		if(factory == null) {
			factory = new Configuration()
					.configure("/resources/hibernate_prodotto_dao.cfg.xml")
					.addAnnotatedClass(Prodotto.class)
					.buildSessionFactory();
		}
		
		return factory;
	}

}
