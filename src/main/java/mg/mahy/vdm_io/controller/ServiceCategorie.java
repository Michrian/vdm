package mg.mahy.vdm_io.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import mg.mahy.vdm_io.model.Categorie;


@RepositoryRestController
public interface ServiceCategorie extends JpaRepository<Categorie, Long> {

}
