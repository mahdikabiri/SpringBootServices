package com.example.newintership.modules.fnd_loockup_names.repository;

import com.example.newintership.modules.fnd_loockup_names.model.FndLoockupNames;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FndLoockupNamesRepository extends JpaRepository<FndLoockupNames,Long> {
    FndLoockupNames findByDesFarsiLkpnm(String s);
}
