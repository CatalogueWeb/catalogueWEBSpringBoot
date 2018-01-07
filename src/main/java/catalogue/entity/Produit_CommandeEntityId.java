package catalogue.entity;

import java.io.Serializable;

public class Produit_CommandeEntityId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProduitEntity produit;
	private Commande_ClientEntity  commande_client;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Produit_CommandeEntityId(ProduitEntity produit, Commande_ClientEntity commande_client) {
		super();
		this.produit = produit;
		this.commande_client = commande_client;
	}
	public Produit_CommandeEntityId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
