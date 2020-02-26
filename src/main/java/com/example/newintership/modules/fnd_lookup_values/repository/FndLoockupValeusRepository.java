package com.example.newintership.modules.fnd_lookup_values.repository;

import com.example.newintership.modules.fnd_lookup_values.model.FndLookupValues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FndLoockupValeusRepository extends JpaRepository<FndLookupValues,Long> {
    FndLookupValues findByValLookupLkpvl(String s);
}
