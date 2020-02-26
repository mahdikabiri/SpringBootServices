package com.example.newintership.modules.fnd_lookup_rel_tables.repository;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_lookup_rel_tables.model.FndLookupRelTables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface FndLookupRelTablesRepository extends JpaRepository<FndLookupRelTables, Long> {
    FndLookupRelTables findByNamTableLkprt(String s);

}
