package com.example.newintership.modules.fnd_lookup_values.service;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import com.example.newintership.modules.fnd_lookup_values.model.FndLookupValues;
import com.example.newintership.modules.fnd_lookup_values.repository.FndLoockupValeusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FndLookupValuesServices {
 @Autowired
    private FndLoockupValeusRepository repo;

    public FndLookupValues createEntity(FndLookupValues fndLookupValues) {
        return repo.save(fndLookupValues);
    }

    public Optional<FndLookupValues> getEntityById(Long entityId) {
        Optional<FndLookupValues> result = repo.findById(entityId);
        return result;
    }

    public void deleteEntity(Long entityId) {
        repo.deleteById(entityId);
    }

    public List<FndLookupValues> findAllEntitys() {
        return repo.findAll();
    }

    public FndLookupValues findByName(String txt){
        return repo.findByValLookupLkpvl(txt);
        //can find with any property (in repository layer)
    }

    public FndLookupValues updateEntity(Long entityId,String newSetDesFarsiLkpnm){
        FndLookupValues entityFromDB=repo.getOne(entityId);
        entityFromDB.setDesCommLkpvl(newSetDesFarsiLkpnm);
        FndLookupValues updatedEntity=repo.save(entityFromDB);
        return updatedEntity;
    }

}
