package com.quixote.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the char_race database table.
 * 
 */
@Entity
@Table(name="char_race")
@NamedQuery(name="CharRace.findAll", query="SELECT c FROM CharRace c")
public class CharRace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_char_race", unique=true, nullable=false)
	private int idCharRace;

	public CharRace() {
	}

	public int getIdCharRace() {
		return this.idCharRace;
	}

	public void setIdCharRace(int idCharRace) {
		this.idCharRace = idCharRace;
	}

}