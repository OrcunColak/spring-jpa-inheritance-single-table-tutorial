package com.colak.springjpainheritancetutorial.repository;

import com.colak.springjpainheritancetutorial.jpa.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
