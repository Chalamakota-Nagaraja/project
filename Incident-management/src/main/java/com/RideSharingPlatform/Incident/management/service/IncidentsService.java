package com.RideSharingPlatform.Incident.management.service;

import java.util.List;

import com.RideSharingPlatform.Incident.management.entities.Incidents;


public interface IncidentsService {
	
	void insertIncident(Incidents incidents);
	List<Incidents> getIncidents();
	Incidents getIncidentsById(String id);
}
