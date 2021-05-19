package com.github.budcaze.citiesapi.repository;

import com.github.budcaze.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
