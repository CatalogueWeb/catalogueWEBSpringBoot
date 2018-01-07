package catalogue.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import catalogue.entity.Produit_CommandeEntity;
import catalogue.entity.Produit_CommandeEntityId;

@Repository
public interface Produit_CommandeRepository  extends CrudRepository<Produit_CommandeEntity,Produit_CommandeEntityId>{

}
