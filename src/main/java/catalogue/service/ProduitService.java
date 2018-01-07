package catalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catalogue.entity.CategorieEntity;
import catalogue.entity.ClientEntity;
import catalogue.entity.Commande_ClientEntity;
import catalogue.entity.ProduitEntity;
import catalogue.repository.CategorieRepository;
import catalogue.repository.ProduitRepository;

@Service
public class ProduitService {
	@Autowired 
	ProduitRepository produitRepository;
	@Autowired 
	CategorieRepository categorieRepository;
	//get all products
	public List<ProduitEntity> getAllProduits(){
		List<ProduitEntity> produits= new ArrayList<>();
		produitRepository.findAll().forEach(produits::add);
		return produits;
	}
	
	//Get all produits by a given categorie
	public List<ProduitEntity> getAllProduitsByCategory(CategorieEntity categorie){
		List<ProduitEntity> produits= new ArrayList<>();
		produitRepository.findByCategorie(categorie).forEach(produits::add);
		return produits;
	} 
	
	
	
	//get one produit by id
	public ProduitEntity getOneProduitById(int id) {
		ProduitEntity produitFinded=null;
		try {
			produitFinded= produitRepository.findOne(id);
			}
		catch(Exception e){
			//
		}
		return produitFinded ;
	}
	
	//get one produit by nom
		public ProduitEntity getOneProduitBynom(String nom) {
			ProduitEntity produitFinded=null;
			try {
				produitFinded= produitRepository.findByNom(nom);
				}
			catch(Exception e){
				//
			}
			return produitFinded ;
		}
		
		//Add One Produit 
		public void addProduit(ProduitEntity produitToAdd) {
			produitRepository.save(produitToAdd);
		}
		
		//Delete One Produit given by id
		public void deleteOneProduitById(int id) {
			try {
			produitRepository.delete(id);
			}catch(Exception e) {
				//
			}
		}
	
		//Delete One Produit given by a produitEntity Instance
		public void deleteOneProduitByInstance(ProduitEntity produitEntityToRemove) {
			try {
			produitRepository.delete(produitEntityToRemove);
			}catch(Exception e) {
				//
			}
		}
		
		//Delete One Produit given by a nom
				public void deleteOneProduitBynom(String nom) {
					try {
					produitRepository.deleteByNom(nom);
					}catch(Exception e) {
						//
					}
				}
				
		//Insert a produit
				public void insertProduit(ProduitEntity produit) {
					// TODO Auto-generated method stub
					produitRepository.save(produit);
					
				}
		
}
