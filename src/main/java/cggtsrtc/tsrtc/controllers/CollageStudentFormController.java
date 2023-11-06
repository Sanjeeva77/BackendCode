package cggtsrtc.tsrtc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cggtsrtc.tsrtc.entities.CollageStudentForm;
import cggtsrtc.tsrtc.services.CollageStudentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/college-student-form")
public class CollageStudentFormController {

    @Autowired
    private CollageStudentService service;

    public CollageStudentFormController(CollageStudentService service) {
        this.service = service;
    }

    @PostMapping("/submit")
    public CollageStudentForm submitCollageStudentForm(@RequestBody CollageStudentForm student) {
        return service.save(student);
    }
}
