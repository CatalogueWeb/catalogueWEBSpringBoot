package catalogue.controller.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import catalogue.entity.CategorieEntity;
import catalogue.service.CategorieService;

@RestController
public class CategorieRestController {
	@Autowired 
	private CategorieService categorieService;
	
	@GetMapping("/restCategories")
	public List<CategorieEntity> getAllCategories(){
		List<CategorieEntity> categories= new ArrayList<>();
		//remplir la base de données par les 3 categories Livre CD DVD 
		CategorieEntity categorie_LIVRES= new CategorieEntity(1, "Livres",null);
		CategorieEntity categorie_CD= new CategorieEntity(2, "CD",null);
		CategorieEntity categorie_DVD= new CategorieEntity(3, "DVD",null);
		categorieService.insertCategorie(categorie_LIVRES);
		categorieService.insertCategorie(categorie_CD);
		categorieService.insertCategorie(categorie_DVD);
		categories=categorieService.getCategories();
		return categories;
	}
}
