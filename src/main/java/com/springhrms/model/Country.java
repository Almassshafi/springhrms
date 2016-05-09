package com.springhrms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name="country_id")
    private String countryId;

    @Column(name="country_name")
    private String countryName;

}
