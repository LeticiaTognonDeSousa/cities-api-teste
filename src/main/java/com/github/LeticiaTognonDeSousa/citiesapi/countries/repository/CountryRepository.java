package com.github.LeticiaTognonDeSousa.citiesapi.countries.repository;

import com.github.LeticiaTognonDeSousa.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
