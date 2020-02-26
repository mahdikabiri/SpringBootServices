package com.example.newintership.modules.fnd_loockup_names.service;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_application_system.repository.FndApplicationSystemRepository;
import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import com.example.newintership.modules.fnd_loockup_names.repository.FndLoockupNamesRepository;
import com.example.newintership.modules.fnd_lookup_values.repository.FndLoockupValeusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class FndLookupNamesService {
    @Autowired
    private FndLoockupNamesRepository repo;

    public FndLookupNames createEntity(FndLookupNames fndLookupNames) {
        return repo.save(fndLookupNames);
    }

    public Optional<FndLookupNames> getEntityById(Long entityId) {
         Optional<FndLookupNames> result=repo.findById(entityId);
        return result;
    }

    public void deleteEntity(Long entityId) {
        repo.deleteById(entityId);
    }

    public List<FndLookupNames> findAllEntitys() {
        return repo.findAll();
    }

    public FndLookupNames findByName(String txt){
        return repo.findByDesFarsiLkpnm(txt);
        //can find with any property (in repository layer)
    }

    public FndLookupNames updateEntity1(Long entityId,String newSetDesFarsiLkpnm){
        FndLookupNames entityFromDB=repo.getOne(entityId);
        entityFromDB.setDesFarsiLkpnm(newSetDesFarsiLkpnm);
        FndLookupNames updatedEntity=repo.save(entityFromDB);
        return updatedEntity;
    }

    public FndLookupNames updateEntity(Long entityId,FndLookupNames entity){
        FndLookupNames entityFromDB=repo.getOne(entityId);
        if (entity.getApplsApplicationSystemId() != null) {
            entityFromDB.setApplsApplicationSystemId(entity.getApplsApplicationSystemId());
        }
        if (entity.getDesLatinLkpnm() != null) {
            entityFromDB.setDesLatinLkpnm(entity.getDesLatinLkpnm());
        }
        if (entity.getDesFarsiLkpnm() != null) {
            entityFromDB.setDesFarsiLkpnm(entity.getDesFarsiLkpnm());
        }
        if (entity.getNumMaximizeSizeLkpnm() != null) {
            entityFromDB.setNumMaximizeSizeLkpnm(entity.getNumMaximizeSizeLkpnm());
        }
        if (entity.getFlgFixSizeLkpnm() != null) {
            entityFromDB.setFlgFixSizeLkpnm(entity.getFlgFixSizeLkpnm());
        }
        if (entity.getValDefaultLkpnm() != null) {
            entityFromDB.setValDefaultLkpnm(entity.getValDefaultLkpnm());
        }
        if (entity.getFlgEnabledLkpnm() != null) {
            entityFromDB.setFlgEnabledLkpnm(entity.getFlgEnabledLkpnm());
        }
        FndLookupNames updatedEntity=repo.save(entityFromDB);
        return updatedEntity;
    }

}
