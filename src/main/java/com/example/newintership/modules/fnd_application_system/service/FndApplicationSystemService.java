package com.example.newintership.modules.fnd_application_system.service;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_application_system.repository.FndApplicationSystemRepository;
import com.example.newintership.modules.fnd_lookup_values.repository.FndLoockupValeusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class FndApplicationSystemService {
    @Autowired
    private FndApplicationSystemRepository repo;

    public FndApplicationSystem  createEntity(FndApplicationSystem fndApplicationSystem) {
       return repo.save(fndApplicationSystem);
    }

    public Optional<FndApplicationSystem> getEntityById(Long fndApplicationSystemId) {
        Optional<FndApplicationSystem> result = repo.findById(fndApplicationSystemId);
        return result;
    }

    public void deleteEntity(Long fndApplicationSystemId) {
        repo.deleteById(fndApplicationSystemId);
    }

    public List<FndApplicationSystem> findAllEntitys() {
        return repo.findAll();
    }

    public FndApplicationSystem findByName(String name) {
        return repo.findByNamAppShortAppls(name);
        //can find with any property (in repository layer)
    }

    public FndApplicationSystem updateEntity1(Long fndApplicationSystemId, String newNameAppShort) {
        FndApplicationSystem entityFromDB = repo.getOne(fndApplicationSystemId);
        entityFromDB.setNamAppShortAppls(newNameAppShort);
        FndApplicationSystem updatedEntity = repo.save(entityFromDB);
        return updatedEntity;
    }

    public FndApplicationSystem updateEntity(Long fndApplicationSystemId, FndApplicationSystem entity) {
        FndApplicationSystem entityFromDB = repo.getOne(fndApplicationSystemId);

        if (entity.getNamAppShortAppls() != null) {
            entityFromDB.setNamAppShortAppls(entity.getNamAppShortAppls());
        }
        if (entity.getDesFarsiAppls() != null) {
            entityFromDB.setDesFarsiAppls(entity.getDesFarsiAppls());
        }
        if (entity.getDesAppPathAppls() != null) {
            entityFromDB.setDesAppPathAppls(entity.getDesAppPathAppls());
        }
        if (entity.getDesLatinAppls() != null) {
            entityFromDB.setDesLatinAppls(entity.getDesLatinAppls());
        }
        if (entity.getDlgEnabledAppls() != null) {
            entityFromDB.setDlgEnabledAppls(entity.getDlgEnabledAppls());
        }
        if (entity.getNamAppZoneAppls() != null) {
            entityFromDB.setNamAppZoneAppls(entity.getNamAppZoneAppls());
        }
        if (entity.getNamAppZoneCommAppls() != null) {
            entityFromDB.setNamAppZoneCommAppls(entity.getNamAppZoneCommAppls());
        }
        if (entity.getDesApplicationUrlAppls() != null) {
            entityFromDB.setDesApplicationUrlAppls(entity.getDesApplicationUrlAppls());
        }
        if (entity.getFilSysIconAppls() != null) {
            entityFromDB.setFilSysIconAppls(entity.getFilSysIconAppls());
        }
        if (entity.getNamIconAppls() != null) {
            entityFromDB.setNamIconAppls(entity.getNamIconAppls());
        }
        if (entity.getTypAppAppls() != null) {
            entityFromDB.setTypAppAppls(entity.getTypAppAppls());
        }
        if (entity.getFlgBaseRunAppls() != null) {
            entityFromDB.setFlgBaseRunAppls(entity.getFlgBaseRunAppls());
        }
        if (entity.getNumSysIconAtchAppls() != null) {
            entityFromDB.setNumSysIconAtchAppls(entity.getNumSysIconAtchAppls());
        }
        if (entity.getNumSysIconAtchSeqAppls() != null) {
            entityFromDB.setNumSysIconAtchSeqAppls(entity.getNumSysIconAtchSeqAppls());
        }
        if (entity.getLkpBaseTypAppls() != null) {
            entityFromDB.setLkpBaseTypAppls(entity.getLkpBaseTypAppls());
        }
        if (entity.getDesLatinZoneAppls() != null) {
            entityFromDB.setDesLatinZoneAppls(entity.getDesLatinZoneAppls());
        }
        if (entity.getCodAppRolesAppls() != null) {
            entityFromDB.setCodAppRolesAppls(entity.getCodAppRolesAppls());
        }

        FndApplicationSystem updatedEntity = repo.save(entityFromDB);
        return updatedEntity;
    }

}
