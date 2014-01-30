package com.quixote.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the char database table.
 * 
 * @since jan/2014
 * @author iuriandreazza
 */
@Entity
@Table(name="char")
@NamedQuery(name="Char.findAll", query="SELECT c FROM Char c")
public class Char implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_char", unique=true, nullable=false)
	private int idChar;

	@Column(name="char_name", length=45)
	private String charName;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_User", nullable=false)
	private User user;

	public Char() {
	}

	public int getIdChar() {
		return this.idChar;
	}

	public void setIdChar(int idChar) {
		this.idChar = idChar;
	}

	public String getCharName() {
		return this.charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}