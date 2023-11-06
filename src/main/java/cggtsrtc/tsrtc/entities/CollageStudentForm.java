package cggtsrtc.tsrtc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "college_students")
@Data
public class CollageStudentForm {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String sscBoardType;
    private String sscType;
    private String yearOfPass;
    private String hallTicketNo;
    private String dob;
    private String studentName;
    private String fatherName;
    private String studentDob;
    private String gender;
    private String aadharNo;
    private String mobileNo;
    private String employeeChildren;
    private String email;
    private String image;
    private String selectedDistrict;
    private String selectedMandal;
    private String selectedVillage;
    private String postalCode;
    private String selectedInstitutionDistrict;
    private String selectedInstitutionMandal;
    private String selectedInstitutionName;
    private String selectedCourseName;
    private String admissionNo;
    private String institutionAddress;
    private String selectedPaymentMode;
    private String selectedPassDeliveryMode;
    private String selectedPassCenter;
    private String selectedPassType;
    
}
