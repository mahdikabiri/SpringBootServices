package com.example.newintership.modules.fnd_lookup_rel_tables.controller;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_lookup_rel_tables.model.FndLookupRelTables;
import com.example.newintership.modules.fnd_lookup_rel_tables.service.FndLookupRelTablesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fndlookupreltables")
public class FndLookupRelTablesController {
    private FndLookupRelTablesServices fndLookupRelTablesServices;

    @Autowired
    public FndLookupRelTablesController(FndLookupRelTablesServices fndLookupRelTablesServices) {
        this.fndLookupRelTablesServices = fndLookupRelTablesServices;
    }


    //getall
    @GetMapping(value = {"/all"})
    public List<FndLookupRelTables> getall() {
        return fndLookupRelTablesServices.findAllEntitys();
    }


    //getone
    @GetMapping(value = "/{entityId}")
    public Optional<FndLookupRelTables> getEntityById(@PathVariable("entityId") Long entityId) {
        return fndLookupRelTablesServices.getEntityById(entityId);
    }

    //delete
    @DeleteMapping(value = "/{entityId}")
    public String deleteEmployeeById(@PathVariable("entityId") Long entityId) {
        String result;
        try {
            fndLookupRelTablesServices.deleteEntity(entityId);
            result = "done";
        } catch (Exception e) {
            result = "failed";
        }
        return result;
    }

    //create
    @PostMapping(value = {"/"})
    public FndLookupRelTables register(@RequestBody FndLookupRelTables entity) {
        return fndLookupRelTablesServices.createEntity(entity);
    }


    //update
    @PutMapping(value = "/{entityId}")
    public String update(@PathVariable("entityId") Long entityID, @RequestBody FndLookupRelTables entity) {
        try {
            fndLookupRelTablesServices.updateEntity(entityID, entity);
            return "done";
        } catch (Exception e) {
            return e.toString();
        }
    }


}
