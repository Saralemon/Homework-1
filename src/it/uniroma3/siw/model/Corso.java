package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	private LocalDate dataDiInizio;
	
	private int durata;
	
	/*
	 * Quando creao un corso, voglio memorizzare subito tutti i suoi allievi.
	 * Quando un allievo cambia corso, voglio togliere dalla lista del corso lo studente.
	 */
	@ManyToMany(mappedBy = "corsi", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Allievo> studenti;
	
	@ManyToOne
	private Docente curatore;
	
	public Corso() {
		
	}
	

}
