package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import fr.adaming.dao.IProduitDao;
import fr.adaming.model.Categorie;
import fr.adaming.model.Produit;

@Stateful
public class ProduitServiceImpl implements IProduitService{

	// transformation uml en java
	@EJB
	private IProduitDao produitDao;

	@Override
	public Produit add(Produit p) {
		return produitDao.add(p);
	}

	@Override
	public int delete(Produit p) {
		return produitDao.delete(p);
	}

	@Override
	public int update(Produit p) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public List<Produit> getAll() {
		return produitDao.getAll();
	}

	@Override
	public List<Produit> getAll(Categorie cat) {
		List<Produit> allProduitsCategorie = produitDao.getAll();
		for(Produit p:allProduitsCategorie){
			p.setCategorie(cat);
		}
		return allProduitsCategorie;
	}

	@Override
	public Produit get(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}


}