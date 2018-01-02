package catalogue.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Produit")
public class ProduitEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private double prix;
	private String description;
	private Timestamp dernier_maj; 

	
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

	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private CategorieEntity categorie;
	
	public ProduitEntity(int id, String nom, double prix, String description, Timestamp dernier_maj,CategorieEntity categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.dernier_maj = dernier_maj;
		this.categorie = categorie;
	}
}
