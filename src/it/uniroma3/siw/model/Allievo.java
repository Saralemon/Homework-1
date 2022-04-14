package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
 

public class Allievo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	private LocalDate dataDiNascita;
	
	private String luogoDiNascita; 
	
	@Column(nullable = false)
	private int matricola;

	private String email;
	
	/*
	 * Quanto immetto un allievo nel database immetto anche la società alla quale appartiene.
	 * Quando rimuovo un allievo non rimuovo anche la società in quanto altri allievi potrebbero appartenervi.
	 */
	@OneToOne(cascade = {CascadeType.PERSIST})
	private Società società;
	
	@ManyToMany
	private List<Corso> corsi;
	
	public Allievo() {
		
	}
}


