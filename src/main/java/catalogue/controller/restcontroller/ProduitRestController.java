package catalogue.controller.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import catalogue.entity.CategorieEntity;
import catalogue.entity.Commande_ClientEntity;
import catalogue.entity.ProduitEntity;
import catalogue.service.CategorieService;
import catalogue.service.ProduitService;

@RestController
public class ProduitRestController {
	@Autowired 
	ProduitService produitService;
	@Autowired 
	CategorieService categorieService;
	
	//get all produits by a given categorie
	@GetMapping("/{id}/restProduits")
	public List<ProduitEntity> getAllProduitsByCategorie(@PathVariable int id) {
		CategorieEntity categorieWithId;
		categorieWithId=categorieService.getCategorieById(id);
		return produitService.getAllProduitsByCategory(categorieWithId);		
		}
	
	 //Add One Produit per a given Categorie 
	@PostMapping("{id}/restProduits")
	public void addProduitPerOneCategorie(@PathVariable int id, @RequestBody ProduitEntity produit) {
		produit.getCategorie().setId_categorie(id);
		produitService.insertProduit(produit);	
	} 
}
