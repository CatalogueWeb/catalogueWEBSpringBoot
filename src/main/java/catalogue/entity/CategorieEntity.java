package catalogue.entity;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categorie")
@Access(AccessType.FIELD)
public class CategorieEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_categorie; 
	private String nom;
	
	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = ProduitEntity.class)
	 //@JoinTable(name = "USER_ROLE", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
   //private Set<Role> roles;
	private Set<ProduitEntity> produits;
	//one to many avec ProduitEntity
	
	
	
	
	public CategorieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CategorieEntity(int id_categorie, String nom, Set<ProduitEntity> produits) {
		super();
		this.id_categorie = id_categorie;
		this.nom = nom;
		this.produits = produits;
	}



	public int getId_categorie() {
		return id_categorie;
	}



	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public Set<ProduitEntity> getProduits() {
		return produits;
	}

	public void setProduits(Set<ProduitEntity> produits) {
		this.produits = produits;
	}
	
	

}
