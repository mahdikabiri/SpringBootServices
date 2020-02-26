package com.example.newintership.modules.fnd_lookup_values.controller;

import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import com.example.newintership.modules.fnd_lookup_rel_tables.model.FndLookupRelTables;
import com.example.newintership.modules.fnd_lookup_values.model.FndLookupValues;
import com.example.newintership.modules.fnd_lookup_values.repository.FndLoockupValeusRepository;
import com.example.newintership.modules.fnd_lookup_values.service.FndLookupValuesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fndlookupvalues")
public class FndLookupValuesController {
    private FndLookupValuesServices fndLookupValuesServices;

    @Autowired
    public FndLookupValuesController(FndLookupValuesServices fndLookupValuesServices) {
        this.fndLookupValuesServices = fndLookupValuesServices;
    }
    //getall
    @GetMapping(value = "/all")
    public List<FndLookupValues> getEntitys(){
        return fndLookupValuesServices.findAllEntitys();
    }

    //getone
    @GetMapping(value = "/{entityId}")
    public Optional<FndLookupValues> getEntityById(@PathVariable("entityId") Long entityId) {
        return fndLookupValuesServices.getEntityById(entityId);
    }


    //delete
    @DeleteMapping(value = "/{entityId}")
    public String deleteEmployeeById(@PathVariable("entityId") Long entityId) {
        String result;
        try {
            fndLookupValuesServices.deleteEntity(entityId);
            result = "done";
        } catch (Exception e) {
            result = "failed";
        }
        return result;
    }

    //create
    @PutMapping(value = {"/"})
    public FndLookupValues register(@RequestBody FndLookupValues entity) {
        return fndLookupValuesServices.createEntity(entity);
    }

/*

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
*/

}
