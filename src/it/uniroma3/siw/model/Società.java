package it.uniroma3.siw.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Societ� {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String ragioneSociale;
	private String numeroDiTelefono;
	
	/*
	 * Quando carico una societ� voglio caricare anche il suo indirizzo.
	 * Quando rimuovo una societ� voglio rimuovere anche il suo indirizzo.
	 */
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Indirizzo indirizzo;
	
	public Societ�() {
		
	}

}
