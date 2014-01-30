package com.quixote.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the realm database table.
 * 
 */
@Entity
@Table(name="realm")
@NamedQuery(name="Realm.findAll", query="SELECT r FROM Realm r")
public class Realm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_realm", unique=true, nullable=false)
	private int idRealm;

	//bi-directional many-to-one association to ReamAdm
	@OneToMany(mappedBy="realm")
	private List<ReamAdm> reamAdms;

	//bi-directional many-to-one association to ReamFollower
	@OneToMany(mappedBy="realm")
	private List<ReamFollower> reamFollowers;

	public Realm() {
	}

	public int getIdRealm() {
		return this.idRealm;
	}

	public void setIdRealm(int idRealm) {
		this.idRealm = idRealm;
	}

	public List<ReamAdm> getReamAdms() {
		return this.reamAdms;
	}

	public void setReamAdms(List<ReamAdm> reamAdms) {
		this.reamAdms = reamAdms;
	}

	public ReamAdm addReamAdm(ReamAdm reamAdm) {
		getReamAdms().add(reamAdm);
		reamAdm.setRealm(this);

		return reamAdm;
	}

	public ReamAdm removeReamAdm(ReamAdm reamAdm) {
		getReamAdms().remove(reamAdm);
		reamAdm.setRealm(null);

		return reamAdm;
	}

	public List<ReamFollower> getReamFollowers() {
		return this.reamFollowers;
	}

	public void setReamFollowers(List<ReamFollower> reamFollowers) {
		this.reamFollowers = reamFollowers;
	}

	public ReamFollower addReamFollower(ReamFollower reamFollower) {
		getReamFollowers().add(reamFollower);
		reamFollower.setRealm(this);

		return reamFollower;
	}

	public ReamFollower removeReamFollower(ReamFollower reamFollower) {
		getReamFollowers().remove(reamFollower);
		reamFollower.setRealm(null);

		return reamFollower;
	}

}