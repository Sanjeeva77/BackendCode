package cggtsrtc.tsrtc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cggtsrtc.tsrtc.entities.DialysisPatient;

public interface DialysisPatientRepository extends JpaRepository<DialysisPatient, Long> {
    // Add custom queries if needed
}
