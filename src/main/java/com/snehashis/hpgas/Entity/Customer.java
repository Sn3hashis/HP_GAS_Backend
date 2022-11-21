package com.snehashis.hpgas.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String fullName;
    long mainAadharno;
    long familyAadhar;
    long mobileNo;
    long customerNo;
    String regAgencyName;

    String remarks;

    boolean installStatus;

    boolean singleWomen;

    String status;

    String addedBy;
    String updatedBy;

    Date date;

}
