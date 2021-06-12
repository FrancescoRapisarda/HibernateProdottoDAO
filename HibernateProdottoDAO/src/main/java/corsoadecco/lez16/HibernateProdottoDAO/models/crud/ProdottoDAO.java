package corsoadecco.lez16.HibernateProdottoDAO.models.crud;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import corsoadecco.lez16.HibernateProdottoDAO.models.Prodotto;
import corsoadecco.lez16.HibernateProdottoDAO.models.db.GestoreSessioni;

public class ProdottoDAO implements Dao<Prodotto> {
	

	@Override
	public void insert(Prodotto t) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			sessione.save(t);
			
			sessione.getTransaction().commit();
			
			System.out.println(t.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		
	}

	
	
	@Override
	public Prodotto findById(int id) {

		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			Prodotto temp = sessione.get(Prodotto.class, id);
			
			sessione.getTransaction().commit();
			
			return temp;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return null;
	} 
	
	

	@Override
	public List<Prodotto> findAll() {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			TypedQuery<Prodotto> product = sessione.createQuery("FROM Prodotto", Prodotto.class);
			List<Prodotto> elenco = product.getResultList();
			
			sessione.getTransaction().commit();
			
			return elenco;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return null;
	}

	
	
	@Override
	public boolean delete(int id) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {

			sessione.beginTransaction();
			
			Prodotto temp = sessione.load(Prodotto.class, id);
			sessione.delete(temp);
			
			
			sessione.getTransaction().commit();

			return true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return false;
	}

	
	
	@Override
	public boolean delete(Prodotto t) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			sessione.delete(t);
			
			sessione.getTransaction().commit();
			
			return true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return false;
	}

	
	
	@Override
	public boolean update(Prodotto t) {
		
		Session sessione = GestoreSessioni.getIstanza().getFactory().getCurrentSession();
		
		try {
			
			sessione.beginTransaction();
			
			
			sessione.update(t);
			
			sessione.getTransaction().commit();
			
			return false;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sessione.close();
		}
		
		return false;
	}

}
