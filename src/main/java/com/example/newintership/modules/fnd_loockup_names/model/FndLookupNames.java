package com.example.newintership.modules.fnd_loockup_names.model;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import com.example.newintership.modules.fnd_lookup_rel_tables.model.FndLookupRelTables;
import com.example.newintership.modules.fnd_lookup_values.model.FndLookupValeus;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class FndLookupNames {
    @Id
    @GeneratedValue
    private Long lookupNameId;

    private Long applsApplicationSystemId;
    private String desLatinLkpnm;
    private String desFarsiLkpnm;
    private Long numMaximizeSizeLkpnm;
    private Long flgFixSizeLkpnm;
    private String valDefaultLkpnm;
    private Long flgEnabledLkpnm;


    @ManyToOne
    private FndApplicationSystem fndApplicationSystem;


    @OneToMany(mappedBy = "fndLookupNames")
    private List<FndLookupRelTables> fndLookupRelTables;


    @OneToMany(mappedBy = "fndLookupNames")
    private List<FndLookupValeus> fndLookupValues;

    public FndLookupNames() {
    }


    public FndLookupNames(String desFarsiLkpnm) {
        this.desFarsiLkpnm=desFarsiLkpnm;
    }
    public Long getLookupNameId() {
        return lookupNameId;
    }

    public void setLookupNameId(Long lookupNameId) {
        this.lookupNameId = lookupNameId;
    }

    public Long getApplsApplicationSystemId() {
        return applsApplicationSystemId;
    }

    public void setApplsApplicationSystemId(Long applsApplicationSystemId) {
        this.applsApplicationSystemId = applsApplicationSystemId;
    }

    public String getDesLatinLkpnm() {
        return desLatinLkpnm;
    }

    public void setDesLatinLkpnm(String desLatinLkpnm) {
        this.desLatinLkpnm = desLatinLkpnm;
    }

    public String getDesFarsiLkpnm() {
        return desFarsiLkpnm;
    }

    public void setDesFarsiLkpnm(String desFarsiLkpnm) {
        this.desFarsiLkpnm = desFarsiLkpnm;
    }

    public Long getNumMaximizeSizeLkpnm() {
        return numMaximizeSizeLkpnm;
    }

    public void setNumMaximizeSizeLkpnm(Long numMaximizeSizeLkpnm) {
        this.numMaximizeSizeLkpnm = numMaximizeSizeLkpnm;
    }

    public Long getFlgFixSizeLkpnm() {
        return flgFixSizeLkpnm;
    }

    public void setFlgFixSizeLkpnm(Long flgFixSizeLkpnm) {
        this.flgFixSizeLkpnm = flgFixSizeLkpnm;
    }

    public String getValDefaultLkpnm() {
        return valDefaultLkpnm;
    }

    public void setValDefaultLkpnm(String valDefaultLkpnm) {
        this.valDefaultLkpnm = valDefaultLkpnm;
    }

    public Long getFlgEnabledLkpnm() {
        return flgEnabledLkpnm;
    }

    public void setFlgEnabledLkpnm(Long flgEnabledLkpnm) {
        this.flgEnabledLkpnm = flgEnabledLkpnm;
    }
}
