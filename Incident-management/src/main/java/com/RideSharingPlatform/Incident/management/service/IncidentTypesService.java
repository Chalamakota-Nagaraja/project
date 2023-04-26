package com.RideSharingPlatform.Incident.management.service;

import java.util.List;

import com.RideSharingPlatform.Incident.management.payloads.IncidentTypesDto;

public interface IncidentTypesService {
	
	public List<IncidentTypesDto> getIncidentTypes();

}
