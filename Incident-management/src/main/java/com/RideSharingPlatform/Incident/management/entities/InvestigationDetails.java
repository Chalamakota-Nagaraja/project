package com.RideSharingPlatform.Incident.management.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class InvestigationDetails {
	@Id
	@Column(name="ID",length=10)
	private int ID;
	
	@Column(name="findings",length=500)
	private String findings;
	
	@Column(name="Suggestions",length=500)
	private String Suggestions;
	
	@Column(name="investigationDate")
	private LocalDate investigationDate;
	
	@ManyToOne
	@JoinColumn(name="IncidentsIncidentId")
	private  Incidents incidents;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getSuggestions() {
		return Suggestions;
	}

	public void setSuggestions(String suggestions) {
		Suggestions = suggestions;
	}

	public LocalDate getInvestigationDate() {
		return investigationDate;
	}

	public void setInvestigationDate(LocalDate investigationDate) {
		this.investigationDate = investigationDate;
	}

	public Incidents getIncidents() {
		return incidents;
	}

	public void setIncidents(Incidents incidents) {
		this.incidents = incidents;
	}

	public InvestigationDetails(int iD, String findings, String suggestions, LocalDate investigationDate,
			com.RideSharingPlatform.Incident.management.entities.Incidents incidents) {
		super();
		ID = iD;
		this.findings = findings;
		Suggestions = suggestions;
		this.investigationDate = investigationDate;
		this.incidents = incidents;
	}

	public InvestigationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
