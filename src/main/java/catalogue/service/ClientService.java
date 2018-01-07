package catalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import catalogue.entity.ClientEntity;
import catalogue.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired 
	ClientRepository clientRepository;
	
	//get clients
	public List<ClientEntity> getClients(){
		List<ClientEntity> clients = new ArrayList<>();
		clientRepository.findAll().forEach(clients::add);;
		return clients;		
	}
	
	//get one client by id
	public ClientEntity getClientById(int id) {		
		return clientRepository.findOne(id);		
	}
	
	//Insert a client 
	public void insertClient(ClientEntity client) {
		clientRepository.save(client);
	}
	
	//modify one client
	public void modifyClientById(int id, ClientEntity clientEntityUpdated) {
		clientRepository.save(clientEntityUpdated);
	}
	
	
	
	//delete one client
	public String deleteOneClientById(int id) {
		String deleteStatus; // pour stocker si la suppression a bien passée ou non
		try {
			clientRepository.delete(id);
			deleteStatus="Deleted successfully";
		}catch(Exception e) {
			deleteStatus="Something went wrong with the delete!";
		}
		return deleteStatus;
	}
	
}
