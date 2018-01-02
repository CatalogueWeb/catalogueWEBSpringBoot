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
@Table(name="Categorie")
public class CategorieEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	private String nom;
	private Set<ProduitEntity> produits;
	//one to many avec ProduitEntity
	
	
	public CategorieEntity(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	public CategorieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	@OneToMany(mappedBy = "Categorie", cascade = CascadeType.ALL)
	public Set<ProduitEntity> getProduits() {
		return produits;
	}

	public void setProduits(Set<ProduitEntity> produits) {
		this.produits = produits;
	}
	
	

}
