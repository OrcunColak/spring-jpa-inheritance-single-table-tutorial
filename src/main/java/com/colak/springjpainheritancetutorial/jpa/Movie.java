package com.colak.springjpainheritancetutorial.jpa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("MOVIE")

@Getter
@Setter
public class Movie extends Item {
    private String director;
    private int duration;

}
