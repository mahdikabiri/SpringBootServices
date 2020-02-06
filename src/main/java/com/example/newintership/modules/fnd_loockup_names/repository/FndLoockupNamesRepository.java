package com.example.newintership.modules.fnd_loockup_names.repository;

import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FndLoockupNamesRepository extends JpaRepository<FndLookupNames,Long> {
    FndLookupNames findByDesFarsiLkpnm(String s);
}
