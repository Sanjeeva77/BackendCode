package cggtsrtc.tsrtc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cggtsrtc.tsrtc.entities.DialysisPatient;
import cggtsrtc.tsrtc.services.DialysisPatientService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/dialysis-patients")
public class DialysisPatientController {
    
    @Autowired
    private final DialysisPatientService service;

    
    public DialysisPatientController(DialysisPatientService service) {
        this.service = service;
    }

    @PostMapping("/submit")
    public DialysisPatient submitDialysisPatient(@RequestBody DialysisPatient patient) {
        return service.save(patient);
    }
}

