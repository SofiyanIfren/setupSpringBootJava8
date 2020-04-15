package com.ihm.mt;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihm.dao.ProfilRepository;
import com.ihm.models.Profil;
import com.ihm.services.ProfilService;

@Service(value="profilService")
public class ProfilServiceImplementation implements ProfilService{
	///////////////////////////////// SPRING CONFIGURATION ANNOTATIONS /////////////////////////////////////////
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
	private ProfilRepository profilRepository;

	
	//////////////////////////////////////CRUD METHODS IMPLEMENTATION ///////////////////////////////////////////
	@Override
	public List<Profil> getAllProfil() {
		return profilRepository.findAll();
	}

	@Override
	public Profil getProfilById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
