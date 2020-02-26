package com.example.newintership.modules.fnd_loockup_names.controller;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import com.example.newintership.modules.fnd_loockup_names.service.FndLookupNamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fndlookupnames")
public class FndLookupNamesController {
    private FndLookupNamesService fndLookupNamesService;

    @Autowired
    public FndLookupNamesController(FndLookupNamesService fndLookupNamesService) {
        this.fndLookupNamesService = fndLookupNamesService;
    }

    //getall
    @GetMapping(value = "/all")
    public List<FndLookupNames> getEntitys() {
        return fndLookupNamesService.findAllEntitys();
    }


    //getone
    @GetMapping(value = "/{entityId}")
    public Optional<FndLookupNames>  getEntityById(@PathVariable("entityId") Long entityId) {
        return fndLookupNamesService.getEntityById(entityId);
    }

    //delete
    @DeleteMapping(value = "/{entityId}")
    public String deleteEntityById(@PathVariable("entityId") Long entityId) {
        String result;
        try {
            fndLookupNamesService.deleteEntity(entityId);
            result = "done";
        } catch (Exception e) {
            result = "failed";
        }
        return result;
    }

    //not working
    //create
    @PostMapping(value = "/")
    public FndLookupNames register(@RequestBody FndLookupNames entity) {
       return fndLookupNamesService.createEntity(entity);
    }

    //update
    @PutMapping(value = "/{entityId}")
    public String update(@PathVariable("entityId") Long entityID, @RequestBody FndLookupNames entity) {
        try {
            fndLookupNamesService.updateEntity(entityID, entity);
            return "done";

        } catch (Exception e) {
            return e.toString();
        }
    }

  /*  @PutMapping(value = "salam/{var1}")
    public String test(@PathVariable("var1") Long l){
        return l.toString();
    }
*/

}
