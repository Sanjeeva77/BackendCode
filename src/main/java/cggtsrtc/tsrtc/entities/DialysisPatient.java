package cggtsrtc.tsrtc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dialysis_patients")
@Data
public class DialysisPatient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String wapNo;
    private String name;
    private String gender;
    private int age;
    private String mobileNo;
    private String email;
    private String selectedDistrict;
    private String selectedMandal;
    private String selectedVillage;
    private String address;
    private String dialysisCenter;
    private String dialysisCenterAddress;
    private String fromPlace;
    private String toPlace;
    private String selectedCenter;
    private String selectedPassType;
    private String selectedPaymentMode;
    private String selectedPassDeliveryMode;

}