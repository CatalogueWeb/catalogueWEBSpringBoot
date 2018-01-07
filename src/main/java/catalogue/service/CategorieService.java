package catalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catalogue.entity.CategorieEntity;
import catalogue.repository.CategorieRepository;

@Service
public class CategorieService {
	@Autowired 
	CategorieRepository categorieRepository;
	
	//get categories
	public List<CategorieEntity> getCategories(){
		List<CategorieEntity> categories = new ArrayList<>();
		categorieRepository.findAll().forEach(categories::add);;
		return categories;		
	}
	
	//get one categorie by id
	public CategorieEntity getCategorieById(int id) {		
		return categorieRepository.findOne(id);		
	}
	
	//get one categorie by name
		public CategorieEntity getCategorieBynom(String name) {		
			return categorieRepository.findByNom(name);		
		}
	
	//Insert a categorie
	public void insertCategorie(CategorieEntity categorie) {
		categorieRepository.save(categorie);
	}
	
	//modify one categorie
	public void modifyCategorieById(int id, CategorieEntity categorieEntityUpdated) {
		categorieRepository.save(categorieEntityUpdated);
	}
	
	//delete one categorie
	public String deleteOneCategorieById(int id) {
		String deleteStatus; // pour stocker si la suppression a bien passée ou non
		try {
			categorieRepository.delete(id);
			deleteStatus="Deleted successfully";
		}catch(Exception e) {
			deleteStatus="Something went wrong with the delete!";
		}
		return deleteStatus;
	}
	
	
}
