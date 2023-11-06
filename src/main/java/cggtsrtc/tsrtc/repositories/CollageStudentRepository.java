package cggtsrtc.tsrtc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cggtsrtc.tsrtc.entities.CollageStudentForm;

@Repository
public interface CollageStudentRepository extends JpaRepository<CollageStudentForm, Long> {
}

