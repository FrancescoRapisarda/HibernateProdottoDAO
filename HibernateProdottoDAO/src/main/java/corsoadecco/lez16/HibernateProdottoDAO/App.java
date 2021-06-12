package corsoadecco.lez16.HibernateProdottoDAO;

import java.util.List;

import corsoadecco.lez16.HibernateProdottoDAO.models.Prodotto;
import corsoadecco.lez16.HibernateProdottoDAO.models.crud.ProdottoDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ProdottoDAO proDao = new ProdottoDAO();
    	
    	
    	
    	//INSERT
    	
//    	Prodotto cuffie = new Prodotto("CF123456", "Cuffie BOSE", 150.00f);
//    	Prodotto fotocamera = new Prodotto("FT123456", "Sony A7sii", 2500.00f);
//    	Prodotto tv = new Prodotto("TV123456", "TV LG 55'", 800.00f);
//    	
//    	proDao.insert(cuffie);
//    	proDao.insert(fotocamera);
//    	proDao.insert(tv);
    	
    	
    	
    	//FINDBYID
    	
//    	Prodotto ricercatoDue = proDao.findById(2);
//    	System.out.println(ricercatoDue);
    
    	
    	
    	//FINDALL
    	
//    	List<Prodotto> ricerca = proDao.findAll();
//    	for(int i=0; i<ricerca.size(); i++) {
//    		
//    		Prodotto temp = ricerca.get(i);
//    		System.out.println(temp);
//    	}
    	
    	
    	
    	//DELETEID
    	
//    	if(proDao.delete(2)) {
//    		
//    		System.out.println("Cancellazione effettuata con successo!");
//    	} else {
//    		
//    		System.out.println("Errore!");
//    	}
    	
    	
    	
    	//DELETE<T>
    	
    	if(proDao.delete(1)) {
    		System.out.println("Cancellazione effettuata con successo!");
    	} else {
    		System.out.println("Errore!");
    	}
    	
    	
    	
    	//UPDATE
    	
//    	Prodotto updateProduct = proDao.findById(3);
//    	updateProduct.setCodice("MP123456");
//    	updateProduct.setNome("Monopattino NINEBOT");
//    	updateProduct.setPrezzo(700.00f);
//    	
//    	if(proDao.update(updateProduct)) {
//    		System.out.println("Aggiornamento completato con successo!");
//    	} else {
//    		System.out.println("Errore!");
//    	}
    	
    }
}
