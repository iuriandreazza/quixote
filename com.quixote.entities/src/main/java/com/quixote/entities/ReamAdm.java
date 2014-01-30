package com.quixote.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ReamAdm database table.
 * 
 */
@Entity
@Table(name="ReamAdm")
@NamedQuery(name="ReamAdm.findAll", query="SELECT r FROM ReamAdm r")
public class ReamAdm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=1)
	private String active;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_User", nullable=false)
	private User user;

	//bi-directional many-to-one association to Realm
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_Realm", nullable=false)
	private Realm realm;

	public ReamAdm() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Realm getRealm() {
		return this.realm;
	}

	public void setRealm(Realm realm) {
		this.realm = realm;
	}

}