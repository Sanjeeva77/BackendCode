package cggtsrtc.tsrtc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cggtsrtc.tsrtc.entities.CollageStudentForm;
import cggtsrtc.tsrtc.repositories.CollageStudentRepository;

@Service
public class CollageStudentService {

    @Autowired
    private final CollageStudentRepository repository;

    
    public CollageStudentService(CollageStudentRepository repository) {
        this.repository = repository;
    }

    public CollageStudentForm save(CollageStudentForm student) {
        return repository.save(student);
    }
    
}
