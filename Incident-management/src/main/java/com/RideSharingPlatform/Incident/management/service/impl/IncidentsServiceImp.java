package com.RideSharingPlatform.Incident.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RideSharingPlatform.Incident.management.Repo.IncidentsRepo;

import com.RideSharingPlatform.Incident.management.entities.Incidents;
import com.RideSharingPlatform.Incident.management.service.IncidentsService;


@Service
public class IncidentsServiceImp implements IncidentsService{
	@Autowired
	IncidentsRepo incRepo;
	@Override
	public void insertIncident(Incidents incidents) {
		
		incRepo.save(incidents);
	}
	@Override
	public List<Incidents> getIncidents() {
		
		return incRepo.findAll();
	}
	public Incidents getIncidentsById(String id) {
		
		return incRepo.findById(id).get();
	}

}
