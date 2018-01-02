package catalogue.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class ClientEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String email;
	private String telephone;
	private String adresse;
	
	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	private Set<Commande_ClientEntity> commandes_client;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Set<Commande_ClientEntity> getCommandes_client() {
		return commandes_client;
	}

	public void setCommandes_client(Set<Commande_ClientEntity> commandes_client) {
		this.commandes_client = commandes_client;
	}

	public ClientEntity(int id, String nom, String email, String telephone, String adresse,
			Set<Commande_ClientEntity> commandes_client) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.commandes_client = commandes_client;
	}

	public ClientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
