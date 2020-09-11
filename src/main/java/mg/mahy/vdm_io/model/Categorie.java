package mg.mahy.vdm_io.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String type_services;

	public String getType_services() {
		return type_services;
	}

	public void setType_services(String type_services) {
		this.type_services = type_services;
	}
	
	
}
