package com.example.newintership.modules.fnd_lookup_values.repository;

import com.example.newintership.modules.fnd_lookup_values.model.FndLookupValeus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FndLoockupValeusRepository extends JpaRepository<FndLookupValeus,Long> {
    FndLookupValeus findByValLookupLkpvl(String s);
}
