package com.RideSharingPlatform.Incident.management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.RideSharingPlatform.Incident.management.entities.Incidents;
import com.RideSharingPlatform.Incident.management.service.impl.IncidentsServiceImp;

@RestController
public class IncidentsController {
	@Autowired
	IncidentsServiceImp incSerImp; 
	
	@PostMapping("/api/incidents/report")
	String insertReport(@RequestBody Incidents incidents)
	{
		incSerImp.insertIncident(incidents);
		return "incident added";
	}
	@GetMapping("/api/incidents")
	List<Incidents> getIncidnets()
	{
		return incSerImp.getIncidents();
	}
	@GetMapping("/api/incidents/{id}")
	Incidents getIncidnetsById(@PathVariable String id)
	{
		return incSerImp.getIncidentsById(id);
	}
}
