package mg.mahy.vdm_io.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import mg.mahy.vdm_io.model.Numero;

@RepositoryRestController

public interface ServiceNumero extends JpaRepository<Numero,Long>  {

	
	
}