package com.ihm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ihm.models.Profil;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, Long>{
	//////////////////Ici, on ajoute les méthodes personnalisées ne faisant pas partie du CRUD ////////////////////////

}
