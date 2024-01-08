package com.mimisalon.casestudy.form;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateBookingFormBean {

    private Integer id;
    private Integer user_id;
    private Integer service_id;
    private Date appointment_time;
    private Integer employee_id;

}