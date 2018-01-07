package catalogue.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Produit_Commande")
@Access(AccessType.FIELD)
@IdClass(Produit_CommandeEntityId.class)
public class Produit_CommandeEntity implements Serializable {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	private int quantite;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_produit")
	private ProduitEntity produit;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_commande")
	private Commande_ClientEntity  commande_client;


	public Produit_CommandeEntity(int quantite, ProduitEntity produit, Commande_ClientEntity commande_client) {
		super();
		this.quantite = quantite;
		this.produit = produit;
		this.commande_client = commande_client;
	}


	public Produit_CommandeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	
	public ProduitEntity getProduit() {
		return produit;
	}


	public void setProduit(ProduitEntity produit) {
		this.produit = produit;
	}

	
	public Commande_ClientEntity getCommande_client() {
		return commande_client;
	}


	public void setCommande_client(Commande_ClientEntity commande_client) {
		this.commande_client = commande_client;
	}
	
	
}
