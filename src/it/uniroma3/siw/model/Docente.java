package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Docente {

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
	private String partitaIva;
	
	/*
	 * Metto nel database tutti i corsi di un docente. 
	 * Assumo che non sia possibile effettuare un cambio di cattedra; tolto il docente, vengono tolti anche tutti i suoi corsi.
	 */
	@OneToMany(mappedBy = "curatore", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Corso> corsi;
	
	public Docente() {
		
	}
}
