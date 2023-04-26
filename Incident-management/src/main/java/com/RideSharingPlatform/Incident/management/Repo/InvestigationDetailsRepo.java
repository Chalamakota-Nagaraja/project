package com.RideSharingPlatform.Incident.management.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RideSharingPlatform.Incident.management.entities.InvestigationDetails;

public interface InvestigationDetailsRepo extends JpaRepository<InvestigationDetails, Integer> {

}
