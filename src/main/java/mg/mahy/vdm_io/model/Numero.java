package mg.mahy.vdm_io.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Numero {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String numero;
	private String titre;
	private String sous_titre;
	
	@OneToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSous_titre() {
		return sous_titre;
	}
	public void setSous_titre(String sous_titre) {
		this.sous_titre = sous_titre;
	}
	
	
	
}
