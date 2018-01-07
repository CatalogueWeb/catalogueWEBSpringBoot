package catalogue.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import catalogue.entity.ClientEntity;
@Repository
public interface ClientRepository extends CrudRepository<ClientEntity,Integer>{

}
