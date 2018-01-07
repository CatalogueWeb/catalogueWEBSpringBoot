package catalogue.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Commande_Client")
@Access(AccessType.FIELD)
public class Commande_ClientEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_commande;
	private double montant;
	private Timestamp date_creation;
	private int no_confirmation;
	
	@OneToMany(mappedBy="commande_client")
	private Set<Produit_CommandeEntity> produits_commande;
	
	

	@ManyToOne
	@JoinColumn(name="id_client"/*"client_id"*/)
	private ClientEntity client;

	

	public Commande_ClientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId_commande() {
		return id_commande;
	}



	public void setId_commande(int id_commande) {
		this.id_commande = id_commande;
	}



	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Timestamp getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Timestamp date_creation) {
		this.date_creation = date_creation;
	}

	public int getNo_confirmation() {
		return no_confirmation;
	}

	public void setNo_confirmation(int no_confirmation) {
		this.no_confirmation = no_confirmation;
	}

	
	public ClientEntity getClient() {
		return client;
	}

	public void setClient(ClientEntity client) {
		this.client = client;
	}


	public Set<Produit_CommandeEntity> getProduits_commande() {
		return produits_commande;
	}

	public void setProduits_commande(Set<Produit_CommandeEntity> produits_commande) {
		this.produits_commande = produits_commande;
	}

	public Commande_ClientEntity(int id, double montant, Timestamp date_creation, int no_confirmation,
			Set<Produit_CommandeEntity> produits_commande, ClientEntity client) {
		super();
		this.id_commande = id;
		this.montant = montant;
		this.date_creation = date_creation;
		this.no_confirmation = no_confirmation;
		this.produits_commande = produits_commande;
		this.client = client;
	}

	
	
	
	
}

