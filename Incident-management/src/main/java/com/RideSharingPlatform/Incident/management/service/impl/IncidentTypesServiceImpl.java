package com.RideSharingPlatform.Incident.management.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RideSharingPlatform.Incident.management.Repo.IncidentTypesRepo;
import com.RideSharingPlatform.Incident.management.entities.IncidentTypes;
import com.RideSharingPlatform.Incident.management.payloads.IncidentTypesDto;
import com.RideSharingPlatform.Incident.management.service.IncidentTypesService;
@Service
public class IncidentTypesServiceImpl implements IncidentTypesService {
	@Autowired
	private IncidentTypesRepo incidentTypesRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<IncidentTypesDto> getIncidentTypes() {
		// TODO Auto-generated method stub
		List<IncidentTypes> incidentTypes = this.incidentTypesRepo.findAll();
		List<IncidentTypesDto> incidentTypesDto = incidentTypes.stream().map((i)->this.modelMapper.map(i,IncidentTypesDto.class)).collect(Collectors.toList());
		
		return incidentTypesDto ;
	}

}
