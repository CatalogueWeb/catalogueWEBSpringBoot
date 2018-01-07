package catalogue.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Produit")
@Access(AccessType.FIELD)
public class ProduitEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_produit;
	private String nom;
	private double prix;
	private String description;
	private Timestamp dernier_maj; 
	@OneToMany(mappedBy="produit")
	private Set<Produit_CommandeEntity> produits_commande;

	@ManyToOne
	@JoinColumn(name = "id_categorie")
	private CategorieEntity categorie;
	
	



	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDernier_maj() {
		return dernier_maj;
	}

	public void setDernier_maj(Timestamp dernier_maj) {
		this.dernier_maj = dernier_maj;
	}
	

	public CategorieEntity getCategorie() {
		return categorie;
	}

	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}

	


	
	public Set<Produit_CommandeEntity> getProduits_commande() {
		return produits_commande;
	}

	public void setProduits_commande(Set<Produit_CommandeEntity> produits_commande) {
		this.produits_commande = produits_commande;
	}

	public ProduitEntity(int id, String nom, double prix, String description, Timestamp dernier_maj,
			Set<Produit_CommandeEntity> produits_commande, CategorieEntity categorie) {
		super();
		this.id_produit = id;
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.dernier_maj = dernier_maj;
		this.produits_commande = produits_commande;
		this.categorie = categorie;
	}

	public ProduitEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
