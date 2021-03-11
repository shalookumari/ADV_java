package com.ltts.Servlet.model;

import java.sql.Date;

public class Player {
private int player_id;
	private String name;
	private Date dateOfBirth;
	private int age;
	private String email;
	private String country;
	private String skills;
	private int match;
	private int runs;
	private int wickets;
	private int team_id;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int player_id, String name, Date dateOfBirth, int age, String email, String country, String skills,
			int match, int runs, int wickets, int team_id) {
		super();
		this.player_id = player_id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.email = email;
		this.country = country;
		this.skills = skills;
		this.match = match;
		this.runs = runs;
		this.wickets = wickets;
		this.team_id = team_id;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getMatch() {
		return match;
	}
	public void setMatch(int match) {
		this.match = match;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", age=" + age
				+ ", email=" + email + ", country=" + country + ", skills=" + skills + ", match=" + match + ", runs="
				+ runs + ", wickets=" + wickets + ", team_id=" + team_id + "]";
	}
	
	
}