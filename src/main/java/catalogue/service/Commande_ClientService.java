package catalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catalogue.entity.ClientEntity;
import catalogue.entity.Commande_ClientEntity;
import catalogue.repository.Commande_ClientRepository;
@Service
public class Commande_ClientService {
	@Autowired 
	private Commande_ClientRepository commande_clientRepository;
	
	//get commandes_client -- all commandes
	public List<Commande_ClientEntity> getCommandes_clients(){
		List<Commande_ClientEntity> commandes_clients = new ArrayList<>();
		commande_clientRepository.findAll();
		return commandes_clients;		
	}
	
	//get commandes by a given Client
	public List<Commande_ClientEntity> getCommandes_client(ClientEntity client){
		List<Commande_ClientEntity> commandes_client = new ArrayList<>();
		commande_clientRepository.findByClient(client).forEach(commandes_client::add);
		return commandes_client;	
	}
	
	//get one commande_client by id
	public Commande_ClientEntity getCommande_ClientById(int id) {		
		return commande_clientRepository.findOne(id);		
	}
	
	//Insert a  commande_client 
	public void insertCommande_Client(Commande_ClientEntity commande_client) {
		commande_clientRepository.save(commande_client);
	}
	
	//modify one  commande_client
	public void modifyClientById(int id, Commande_ClientEntity commande_clientEntityUpdated) {
		commande_clientRepository.save(commande_clientEntityUpdated);
	}
	
	//delete one  commande_client
	public String deleteOneCommande_ClientById(int id) {
		String deleteStatus; // pour stocker si la suppression a bien passée ou non
		try {
			commande_clientRepository.delete(id);
			deleteStatus="Deleted successfully";
		}catch(Exception e) {
			deleteStatus="Something went wrong with the delete!";
		}
		return deleteStatus;
	}
}
