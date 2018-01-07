package catalogue.controller.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import catalogue.entity.ClientEntity;
import catalogue.entity.Commande_ClientEntity;
import catalogue.service.ClientService;
import catalogue.service.Commande_ClientService;

@RestController
public class Commande_ClientRestController {
	@Autowired 
	Commande_ClientService commande_ClientService;
	@Autowired 
	ClientService clientService;
	
	//get all commandes per client
	@GetMapping("/{id}/restCommandes")
	public List<Commande_ClientEntity> getAllCommandesByClient(@PathVariable int id) {
		ClientEntity clientWithId;
		clientWithId=clientService.getClientById(id);
		return commande_ClientService.getCommandes_client(clientWithId);		
		}
	 //Add One Commande per a given Client 
	@PostMapping("{id}/restCommandes")
	public void addCommandePerOneClient(@PathVariable int id, @RequestBody Commande_ClientEntity commande) {
		commande.getClient().setId_client(id);
		commande_ClientService.insertCommande_Client(commande);	
	}
	
	//Delete a Commande 
	@DeleteMapping("{id_Client}/restCommandes/{id_Commande}")
	public void deleteCommandePerCommandeIdPerClient(@PathVariable int id_Client, @PathVariable int id_commande) {
		List<Commande_ClientEntity> commandesClient= new ArrayList<>();
		Commande_ClientEntity commandeClientToFind;
		commandesClient = getAllCommandesByClient(id_Client);
		//fetch in the arraylist for the commande with the id_commande id
		for (Commande_ClientEntity commande :commandesClient) {
			if (commande.getId_commande()==id_commande) {
				commandeClientToFind=commande;
				commande_ClientService.deleteOneCommande_ClientById(commandeClientToFind.getId_commande());
			}
		}
	}
}
