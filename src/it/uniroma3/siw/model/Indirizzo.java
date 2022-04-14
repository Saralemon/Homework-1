package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    
public class Indirizzo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String via;
	
	private String numeroCivico; //potrebbe essere 2B
	
	private String comune;
	
	private int cap;
	
	private String provincia;
	
	public Indirizzo() {
		
	}
 
}
