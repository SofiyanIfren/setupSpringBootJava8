package com.ihm.services;

import java.util.List;

import com.ihm.models.Profil;

public interface ProfilService {
	///////////////////// CRUD ///////////////////////////////////////
	List<Profil> getAllProfil();
	Profil getProfilById(long id);
	
	//////////////FONCTIONS PERSONALISEES ////////////////////////////


}
