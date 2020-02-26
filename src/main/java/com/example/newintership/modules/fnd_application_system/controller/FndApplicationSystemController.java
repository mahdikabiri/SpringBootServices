package com.example.newintership.modules.fnd_application_system.controller;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_application_system.service.FndApplicationSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fndapplicationsystem")
public class FndApplicationSystemController {
    private FndApplicationSystemService fndApplicationSystemService;

    @Autowired
    public FndApplicationSystemController(FndApplicationSystemService fndApplicationSystemService) {
        this.fndApplicationSystemService = fndApplicationSystemService;
    }

    //getall
    @GetMapping(value = "/all")
    public List<FndApplicationSystem> getEntitys() {
        return fndApplicationSystemService.findAllEntitys();
    }


    //getone
    @GetMapping(value = "/{entityId}")
    public Optional<FndApplicationSystem> getEntityById(@PathVariable("entityId") Long entityId) {
        return fndApplicationSystemService.getEntityById(entityId);
    }

    //delete
    @DeleteMapping(value = "/{entityId}")
    public String deleteEmployeeById(@PathVariable("entityId") Long entityId) {
        String result;
        try {
            fndApplicationSystemService.deleteEntity(entityId);
            result = "done";
        } catch (Exception e) {
            result = "failed";
        }
        return result;

    }

    //create
    @PostMapping(value = "/")
    public FndApplicationSystem savesss(@RequestBody FndApplicationSystem entity) {
       return fndApplicationSystemService.createEntity(entity);
    }

   /* //update
    @PutMapping(value = "/{entityId}/{newProperty}")
    public FndApplicationSystem update(@PathVariable("newProperty") Long entityID, @PathVariable("newProper") String newProper) {
        return fndApplicationSystemService.updateEntity(entityID, newProper);
    }*/

    //update
    @PutMapping(value = "update/{entityId}")
    public String update(@PathVariable("entityId") Long entityID, @RequestBody FndApplicationSystem entity) {
        try {
            fndApplicationSystemService.updateEntity(entityID, entity);
            return "done";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
