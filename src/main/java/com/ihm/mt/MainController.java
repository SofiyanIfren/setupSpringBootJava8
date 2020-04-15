package com.ihm.mt;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ihm.models.Profil;
import com.ihm.services.ProfilService;

@Controller
@EnableJpaRepositories("com.ihm.dao")
@RequestMapping("/")
@PropertySource("classpath:application.properties")
public class MainController {
	/**
	 * @author Sofiyan Ifren
	 * @return Lance la page d'accueil index.html
	 
	public String getIndex(){
        return "index.html";
	}
	*/
	/*****************************************************************************************************
     ************************* SPRING CONFIGURATION ANNOTATIONS ******************************************
     *****************************************************************************************************/
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
	private ProfilService profilService;

	//////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////// REQUESTS ////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	@CrossOrigin
	@RequestMapping(
	    		value = "/test",
	    		produces = "application/json")
	 @ResponseBody
	 public ResponseEntity <List<Profil>> test1(){
		List<Profil> profiles = profilService.getAllProfil();
		return new ResponseEntity <List<Profil>> (profiles, HttpStatus.OK);
	 }


}
