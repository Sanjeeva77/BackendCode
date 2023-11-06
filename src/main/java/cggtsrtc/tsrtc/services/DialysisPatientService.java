package cggtsrtc.tsrtc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cggtsrtc.tsrtc.entities.DialysisPatient;
import cggtsrtc.tsrtc.repositories.DialysisPatientRepository;

@Service
public class DialysisPatientService {
    
    @Autowired
    private final DialysisPatientRepository repository;

    
    public DialysisPatientService(DialysisPatientRepository repository) {
        this.repository = repository;
    }

    public DialysisPatient save(DialysisPatient patient) {
        return repository.save(patient);
    }
}

