package catalogue.controller.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import catalogue.entity.ClientEntity;
import catalogue.service.ClientService;

@RestController
public class ClientRestController {
	@Autowired 
	private ClientService clientService;
	
	//get all clients 
	@GetMapping("/restClients")
	public List<ClientEntity> getAllClients() {
		//initialisation par deux client hamza et safwane 
		ClientEntity hamza=new ClientEntity(1,"EL RHAZI","hamza.elrhazi@catalogue.com","0658745864","Rue Montesson Bezons", null);
		ClientEntity safwane=new ClientEntity(2,"EL BAHI","safwane.elbahi@catalogue.com","0666879566","Residence Gambetta Calais", null);

		clientService.insertClient(hamza);
		clientService.insertClient(safwane);
		return clientService.getClients();
	}
	
	//add one client 
	@PostMapping("/restClients")
	public void AddOneClient(@RequestBody ClientEntity client) {
		clientService.insertClient(client);
	}
	
	//modify one client by id
	@PutMapping("restClients/{id}")
	public void modifyOneClient(@PathVariable int id,@RequestBody ClientEntity clientEntityUpdated) {
		clientService.modifyClientById(id, clientEntityUpdated);
	}
	
	//DeleteOneClient
	@DeleteMapping("/restClients/{id}")
	public void deleteOneClient(@PathVariable int id) {
		clientService.deleteOneClientById(id);
	}
	
}