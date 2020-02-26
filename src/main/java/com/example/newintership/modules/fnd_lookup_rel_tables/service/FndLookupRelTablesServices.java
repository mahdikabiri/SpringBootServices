package com.example.newintership.modules.fnd_lookup_rel_tables.service;

import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import com.example.newintership.modules.fnd_lookup_rel_tables.model.FndLookupRelTables;
import com.example.newintership.modules.fnd_lookup_rel_tables.repository.FndLookupRelTablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FndLookupRelTablesServices {
    @Autowired
    private FndLookupRelTablesRepository repo;

    public FndLookupRelTables createEntity(FndLookupRelTables fndLookupRelTables) {
        return repo.save(fndLookupRelTables);

    }

    public Optional<FndLookupRelTables> getEntityById(Long entityId) {
        Optional<FndLookupRelTables> result = repo.findById(entityId);
        return result;
    }

    public void deleteEntity(Long entityId) {
        repo.deleteById(entityId);
    }

    public List<FndLookupRelTables> findAllEntitys() {
        return repo.findAll();
    }

    public FndLookupRelTables findByName(String txt) {
        return repo.findByNamTableLkprt(txt);
        //can find with any property (in repository layer)
    }
/*
    public FndLookupRelTables updateEntity(Long entityId, String newSetDesFarsiLkpnm) {
        FndLookupRelTables entityFromDB = repo.getOne(entityId);
        entityFromDB.setNamColumnLkprt(newSetDesFarsiLkpnm);
        FndLookupRelTables updatedEntity = repo.save(entityFromDB);
        return updatedEntity;
    }*/

    public FndLookupRelTables updateEntity(Long entityId, FndLookupRelTables entity){
        FndLookupRelTables entityFromDB=repo.getOne(entityId);
        if (entity.getNamTableLkprt() != null) {
            entityFromDB.setNamTableLkprt(entity.getNamTableLkprt());
        }
        if (entity.getNamColumnLkprt() != null) {
            entityFromDB.setNamColumnLkprt(entity.getNamColumnLkprt());
        }
        FndLookupRelTables updatedEntity=repo.save(entityFromDB);
        return updatedEntity;
    }


}
