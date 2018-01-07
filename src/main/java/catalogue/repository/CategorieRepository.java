package catalogue.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import catalogue.entity.CategorieEntity;

@Repository
public interface CategorieRepository extends CrudRepository<CategorieEntity,Integer> {

	public CategorieEntity findByNom(String name);

}
