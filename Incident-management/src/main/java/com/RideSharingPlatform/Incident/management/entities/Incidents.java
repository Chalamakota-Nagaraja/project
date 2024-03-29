package com.RideSharingPlatform.Incident.management.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
@Entity
public class Incidents {
	    @Id
	    @Column(name="incidentID",length=10)
	    private String     incidentID;
	    
	    @Column(name="incidentDate")
	    @PastOrPresent(message = "Incident date can be today or a past date only")
	    private LocalDate  incidentDate;
	    
	    @Column(name="reportDate")
	    @PastOrPresent(message = "Report date cannot be a future date")
	    private LocalDate  reportDate;
	    
	    @Column(name="incidentReportsByUserId",length=10)
		private int        incidentReportsByUserId;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="IncidentTypeId")
		private     IncidentTypes incidentTypeId;
	    
	    
	                      
		
	    @Column(name=" resolutionETA")
		private LocalDate  resolutionETA;
	    
	    @Column(name="investigatedByUserId",length=10)
		private int        investigatedByUserId;
	    
	    @Column(name="incidentSummary",length=50)
		private String     incidentSummary;
	    
	    @Column(name="incidentDetails",length=500)
		private String     incidentDetails;
	    
	    @Column(name="bookingId",length=10)
		private int        bookingId;
	    
	    @Column(name="Status", nullable = false, columnDefinition = "varchar(255) default 'Pending'", length=10)
	    @Pattern(regexp = "^(pending|closed)$", message = "Status should be either pending or closed")
		private String     status = "pending";

		@OneToMany(mappedBy="incidents")
		private List<IncidentTypes> incidentTypes;

		public Incidents() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Incidents(String incidentID, LocalDate incidentDate, LocalDate reportDate, int incidentReportsByUserId,
				IncidentTypes incidentTypeId, LocalDate resolutionETA, int investigatedByUserId, String incidentSummary,
				String incidentDetails, int bookingId, String status, List<IncidentTypes> incidentTypes) {
			super();
			this.incidentID = incidentID;
			this.incidentDate = incidentDate;
			this.reportDate = reportDate;
			this.incidentReportsByUserId = incidentReportsByUserId;
			this.incidentTypeId = incidentTypeId;
			this.resolutionETA = resolutionETA;
			this.investigatedByUserId = investigatedByUserId;
			this.incidentSummary = incidentSummary;
			this.incidentDetails = incidentDetails;
			this.bookingId = bookingId;
			this.status = status;
			this.incidentTypes = incidentTypes;
		}

		public String getIncidentID() {
			return incidentID;
		}

		public void setIncidentID(String incidentID) {
			this.incidentID = incidentID;
		}

		public LocalDate getIncidentDate() {
			return incidentDate;
		}

		public void setIncidentDate(LocalDate incidentDate) {
			this.incidentDate = incidentDate;
		}

		public LocalDate getReportDate() {
			return reportDate;
		}

		public void setReportDate(LocalDate reportDate) {
			this.reportDate = reportDate;
		}

		public int getIncidentReportsByUserId() {
			return incidentReportsByUserId;
		}

		public void setIncidentReportsByUserId(int incidentReportsByUserId) {
			this.incidentReportsByUserId = incidentReportsByUserId;
		}

		public IncidentTypes getIncidentTypeId() {
			return incidentTypeId;
		}

		public void setIncidentTypeId(IncidentTypes incidentTypeId) {
			this.incidentTypeId = incidentTypeId;
		}

		public LocalDate getResolutionETA() {
			return resolutionETA;
		}

		public void setResolutionETA(LocalDate resolutionETA) {
			this.resolutionETA = resolutionETA;
		}

		public int getInvestigatedByUserId() {
			return investigatedByUserId;
		}

		public void setInvestigatedByUserId(int investigatedByUserId) {
			this.investigatedByUserId = investigatedByUserId;
		}

		public String getIncidentSummary() {
			return incidentSummary;
		}

		public void setIncidentSummary(String incidentSummary) {
			this.incidentSummary = incidentSummary;
		}

		public String getIncidentDetails() {
			return incidentDetails;
		}

		public void setIncidentDetails(String incidentDetails) {
			this.incidentDetails = incidentDetails;
		}

		public int getBookingId() {
			return bookingId;
		}

		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<IncidentTypes> getIncidentTypes() {
			return incidentTypes;
		}

		public void setIncidentTypes(List<IncidentTypes> incidentTypes) {
			this.incidentTypes = incidentTypes;
		}
		
		
		
		
		
		
		
}
