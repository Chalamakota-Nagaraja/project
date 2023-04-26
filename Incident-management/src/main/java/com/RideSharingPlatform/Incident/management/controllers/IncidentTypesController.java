package com.RideSharingPlatform.Incident.management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RideSharingPlatform.Incident.management.payloads.IncidentTypesDto;
import com.RideSharingPlatform.Incident.management.service.IncidentTypesService;

@RestController
public class IncidentTypesController {
@Autowired
private IncidentTypesService incidentTypesService;
@GetMapping("/api/incidents/types")
public List<IncidentTypesDto> getIncidentTypes(){
	return this.incidentTypesService.getIncidentTypes();
}
}
