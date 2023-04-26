package com.RideSharingPlatform.Incident.management.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.RideSharingPlatform.Incident.management.entities.IncidentTypes;

public interface IncidentTypesRepo extends JpaRepository<IncidentTypes, Integer>{

	
}
