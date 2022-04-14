package it.polito.tdp.Yelp.model;

import java.util.List;

import it.polito.tdp.Yelp.db.YelpDAO;

public class Model {

	private List<Business> businesses=null;
	
	/**
	 * restituisce l'elenco completo dei business : se lo sa già lo restituisce, altrimenti lo cerca (per evitare che chieda al database più volte se già lo sa lo rstituisce direttamente)
	 * @return
	 */
	public List<Business> getBusinesses(){
		if(this.businesses==null) {
			YelpDAO dao=new YelpDAO();
			this.businesses=dao.readAllBusinesses();
		}
		return this.businesses;
	}
}
