package catalogue.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import catalogue.entity.ClientEntity;
import catalogue.entity.Commande_ClientEntity;

@Repository
public interface Commande_ClientRepository extends CrudRepository<Commande_ClientEntity,Integer>{
	public List<Commande_ClientEntity> findByClient(ClientEntity client);
}
