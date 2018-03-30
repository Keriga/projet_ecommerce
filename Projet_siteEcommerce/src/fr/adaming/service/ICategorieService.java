package fr.adaming.service;

import java.util.List;

import javax.ejb.EJBTransactionRolledbackException;
import javax.ejb.Local;

import fr.adaming.model.Categorie;

@Local
public interface ICategorieService {

	public List<Categorie> getAll();

	public Categorie add(Categorie c);

	public int update(Categorie c);

	public int delete(Categorie c);

	public Categorie get(Categorie c) throws EJBTransactionRolledbackException;
}
