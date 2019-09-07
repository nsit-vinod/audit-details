package com.vsquare.audit.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.AlertObservation;

public interface AlertObservationRepository extends JpaRepository<AlertObservation, Long> {

	Set<AlertObservation> findByAlertObservationIdIn(List<Long> observationIds);

}
