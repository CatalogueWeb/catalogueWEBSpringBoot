package catalogue.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import catalogue.entity.CategorieEntity;
import catalogue.entity.ProduitEntity;

@Repository
public interface ProduitRepository extends CrudRepository<ProduitEntity,Integer>{
	
	//get all product by a given category
	public List<ProduitEntity> findByCategorie(CategorieEntity categorie);
	//get Produit by nom
	public ProduitEntity findByNom(String nom);
	public void deleteByNom(String nom);
}
