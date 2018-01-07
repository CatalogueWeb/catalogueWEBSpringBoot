package catalogue.controller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import catalogue.entity.CategorieEntity;
import catalogue.service.CategorieService;

@Controller
public class CategorieController {
	@Autowired 
	private CategorieService categorieService;
	
	@GetMapping("/Categories")
	public String getAllCategories(Model model){
		List<CategorieEntity> categories= new ArrayList<>();
		//remplir la base de données par les 3 categories Livre CD DVD 
		CategorieEntity categorie_LIVRES= new CategorieEntity(1, "Livres",null);
		CategorieEntity categorie_CD= new CategorieEntity(2, "CD",null);
		CategorieEntity categorie_DVD= new CategorieEntity(3, "DVD",null);
		categorieService.insertCategorie(categorie_LIVRES);
		categorieService.insertCategorie(categorie_CD);
		categorieService.insertCategorie(categorie_DVD);
		categories=categorieService.getCategories();
		model.addAttribute("categorie_LIVRES",categorie_LIVRES);
		model.addAttribute("categorie_CD",categorie_CD);
		model.addAttribute("categorie_DCD",categorie_DVD);

		return "Categories";
	}
}
