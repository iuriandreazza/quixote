package com.quixote.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@Table(name="User")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="activation_code", length=255)
	private String activationCode;

	private int active;

	@Column(length=45)
	private String FB_Email;

	@Column(length=45)
	private String FB_Gender;

	private BigInteger FB_Id;

	@Column(length=45)
	private String FB_Link;

	@Column(length=45)
	private String FB_Locale;

	@Column(length=45)
	private String FB_Picture;

	@Column(length=45)
	private String first_Name;

	@Column(length=45)
	private String last_Name;

	@Column(length=255)
	private String login;

	@Column(length=255)
	private String pass;

	@Column(name="receive_notification_email")
	private int receiveNotificationEmail;

	//bi-directional many-to-one association to ReamAdm
	@OneToMany(mappedBy="user")
	private List<ReamAdm> reamAdms;

	//bi-directional many-to-one association to ReamFollower
	@OneToMany(mappedBy="user")
	private List<ReamFollower> reamFollowers;

	//bi-directional many-to-one association to Char
	@OneToMany(mappedBy="user")
	private List<Char> chars;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivationCode() {
		return this.activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getFB_Email() {
		return this.FB_Email;
	}

	public void setFB_Email(String FB_Email) {
		this.FB_Email = FB_Email;
	}

	public String getFB_Gender() {
		return this.FB_Gender;
	}

	public void setFB_Gender(String FB_Gender) {
		this.FB_Gender = FB_Gender;
	}

	public BigInteger getFB_Id() {
		return this.FB_Id;
	}

	public void setFB_Id(BigInteger FB_Id) {
		this.FB_Id = FB_Id;
	}

	public String getFB_Link() {
		return this.FB_Link;
	}

	public void setFB_Link(String FB_Link) {
		this.FB_Link = FB_Link;
	}

	public String getFB_Locale() {
		return this.FB_Locale;
	}

	public void setFB_Locale(String FB_Locale) {
		this.FB_Locale = FB_Locale;
	}

	public String getFB_Picture() {
		return this.FB_Picture;
	}

	public void setFB_Picture(String FB_Picture) {
		this.FB_Picture = FB_Picture;
	}

	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getReceiveNotificationEmail() {
		return this.receiveNotificationEmail;
	}

	public void setReceiveNotificationEmail(int receiveNotificationEmail) {
		this.receiveNotificationEmail = receiveNotificationEmail;
	}

	public List<ReamAdm> getReamAdms() {
		return this.reamAdms;
	}

	public void setReamAdms(List<ReamAdm> reamAdms) {
		this.reamAdms = reamAdms;
	}

	public ReamAdm addReamAdm(ReamAdm reamAdm) {
		getReamAdms().add(reamAdm);
		reamAdm.setUser(this);

		return reamAdm;
	}

	public ReamAdm removeReamAdm(ReamAdm reamAdm) {
		getReamAdms().remove(reamAdm);
		reamAdm.setUser(null);

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
		reamFollower.setUser(this);

		return reamFollower;
	}

	public ReamFollower removeReamFollower(ReamFollower reamFollower) {
		getReamFollowers().remove(reamFollower);
		reamFollower.setUser(null);

		return reamFollower;
	}

	public List<Char> getChars() {
		return this.chars;
	}

	public void setChars(List<Char> chars) {
		this.chars = chars;
	}

	public Char addChar(Char char) {
		getChars().add(char);
		char.setUser(this);

		return char;
	}

	public Char removeChar(Char char) {
		getChars().remove(char);
		char.setUser(null);

		return char;
	}

}