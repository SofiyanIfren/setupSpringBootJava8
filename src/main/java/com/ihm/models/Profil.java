package com.ihm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "profils")
@XmlRootElement(name = "PROFILS")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Profil {

	private static final long serialVersionUID = 1L;
	
	// ****************************************** DECLARATIONS ******************************************
	@Id
    @Column(name = "Id")
    private long id;
	@Column(name = "Libelle")
    private String libelle;
	@Column(name = "IdRegion")
    private long idRegion;
	@Column(name = "HoroDate")
    private Date horoDate;
	@Column(name = "IdEcranRepli")
    private long idEcranRepli;
	
	//****************************************** CONSTRUCTEURS ******************************************
	public Profil() {
		super();
	}
	public Profil(long id, String libelle, long idRegion, Date horoDate, long idEcranRepli) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.idRegion = idRegion;
		this.horoDate = horoDate;
		this.idEcranRepli = idEcranRepli;
	}
	
	// ****************************************** GETTERS & SETTERS ******************************************
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public long getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(long idRegion) {
		this.idRegion = idRegion;
	}
	public Date getHoroDate() {
		return horoDate;
	}
	public void setHoroDate(Date horoDate) {
		this.horoDate = horoDate;
	}
	public long getIdEcranRepli() {
		return idEcranRepli;
	}
	public void setIdEcranRepli(long idEcranRepli) {
		this.idEcranRepli = idEcranRepli;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
