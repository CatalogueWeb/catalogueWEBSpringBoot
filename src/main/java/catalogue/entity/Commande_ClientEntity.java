package catalogue.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Commande_Client")
public class Commande_ClientEntity {
	private int id;
	private double montant;
	private Timestamp date_creation;
	private int no_confirmation;
	

	@ManyToOne
	@JoinColumn(name="client_id")
	private ClientEntity client;

	public Commande_ClientEntity(int id, double montant, Timestamp date_creation, int no_confirmation,
			ClientEntity client) {
		super();
		this.id = id;
		this.montant = montant;
		this.date_creation = date_creation;
		this.no_confirmation = no_confirmation;
		this.client = client;
	}

	public Commande_ClientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
}

